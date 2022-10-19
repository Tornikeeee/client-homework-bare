package com.tadamia;

import com.sun.xml.ws.client.BindingProviderProperties;
import com.tadamia.client.ws.bare.*;
import jakarta.xml.ws.Binding;
import jakarta.xml.ws.BindingProvider;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    private static PersonsWSBare personsWSBare;
    private static AuthRequest authRequest = new AuthRequest();
    private static Properties props;

    static {

        try {
            props = Config.loadFile();

            /*
            url = http://localhost:8080/person-service/PersonService
timeout = 10000
username = adminUser
password = asdASD123
            * */

            authRequest.setUsername(props.getProperty("username"));
            authRequest.setPassword(props.getProperty("password"));

//            URL urlBare = new URL("http://localhost:8080/person-service/PersonServiceBare?wsdl");

            PersonsWSBareImplService personsWSBareImplService = new PersonsWSBareImplService();
            personsWSBare = personsWSBareImplService.getPersonsWSBareImplPort();
            BindingProvider bindingProvider = (BindingProvider) personsWSBare;

            //8443 პორტზე შემექმნა პრობლემა, ვერ გავხსენი ეგ პორტი
            bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, props.getProperty("url"));//"http://localhost:8080/person-service/PersonService");

            bindingProvider.getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT, Integer.parseInt(props.getProperty("timeout",null)));//10_000);
            bindingProvider.getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT, Integer.parseInt(props.getProperty("timeout",null)));//10_000);


            SSLContext sslContext = getInsecureSSLContext();
            bindingProvider.getRequestContext().put(BindingProviderProperties.SSL_SOCKET_FACTORY, sslContext.getSocketFactory());
            HostnameVerifier hostnameVerifier = getHostnameVerifier();
            bindingProvider.getRequestContext().put(BindingProviderProperties.HOSTNAME_VERIFIER, hostnameVerifier);


            Binding binding = bindingProvider.getBinding();
            var handlerList = binding.getHandlerChain();
            if (handlerList == null) {
                handlerList = new ArrayList<>();
            }
            handlerList.add(new SoapHandler());
            binding.setHandlerChain(handlerList);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main( String[] args ) throws PersonAlreadyExists_Exception, PersonNotFound_Exception {
        personsWS_AddPerson();
        personsWS_GetPerson();
        personsWS_GetPersons();
        personsWS_UpdatePerson();
        personsWS_DeletePerson();
    }

    public static void personsWS_AddPerson() throws PersonAlreadyExists_Exception {

        AddPersonRequest addPersonRequest = new AddPersonRequest();
        addPersonRequest.setAuthRequest(authRequest);
        addPersonRequest.setID(79);
        addPersonRequest.setLastname("mamuka");
        addPersonRequest.setFirstname("khazaradze");
        addPersonRequest.setAge(55);


        ListPersonsRequest listPersonsRequest = new ListPersonsRequest();
        listPersonsRequest.setAuthRequest(authRequest);

        int numberOfPersonsOld = personsWSBare.getAllPersons(listPersonsRequest).getPersons().getPerson().size();
        System.out.println("old number of persons " + numberOfPersonsOld);

        personsWSBare.addPerson(addPersonRequest);

        int numberOfPersonsNew = personsWSBare.getAllPersons(listPersonsRequest).getPersons().getPerson().size();
        System.out.println("old number of persons " + numberOfPersonsNew);
    }

    public static void personsWS_GetPerson() throws PersonNotFound_Exception {
        GetPersonRequest getPersonRequest = new GetPersonRequest();
        getPersonRequest.setAuthRequest(authRequest);
        getPersonRequest.setID(79);

        Person person = personsWSBare.getPerson(getPersonRequest).getPerson();//personsWS.getPerson(77);
        System.out.println("person with id 77 " + personToString(person));
    }
//
    public static void personsWS_GetPersons() throws PersonNotFound_Exception {
        ListPersonsRequest listPersonsRequest = new ListPersonsRequest();
        listPersonsRequest.setAuthRequest(authRequest);

        List<Person> persons = personsWSBare.getAllPersons(listPersonsRequest).getPersons().getPerson();

        System.out.println("get all persons");
        for (Person person: persons) {
            System.out.println(personToString(person));
        }
    }

    public static void personsWS_UpdatePerson() throws PersonNotFound_Exception {
        GetPersonRequest getPersonRequest = new GetPersonRequest();
        getPersonRequest.setAuthRequest(authRequest);
        getPersonRequest.setID(79);

        Person person = personsWSBare.getPerson(getPersonRequest).getPerson();//personsWS.getPerson(77);
        System.out.println("old version " + personToString(person));

        UpdatePersonRequest updatePersonRequest = new UpdatePersonRequest();
        updatePersonRequest.setAuthRequest(authRequest);
        updatePersonRequest.setID(79);
        updatePersonRequest.setLastname("mamuka");
        updatePersonRequest.setFirstname("khazaradze");
        updatePersonRequest.setAge(55);

        person = personsWSBare.updatePerson(updatePersonRequest).getPerson();
                //personsWS.updatePerson(77, "mamuka", "khazaradze", 50);
        System.out.println("new version " + personToString(person));
    }

    public static void personsWS_DeletePerson() throws PersonNotFound_Exception {
        ListPersonsRequest listPersonsRequest = new ListPersonsRequest();
        listPersonsRequest.setAuthRequest(authRequest);

        int numberOfPersonsOld = personsWSBare.getAllPersons(listPersonsRequest).getPersons().getPerson().size();
        System.out.println("old number of persons " + numberOfPersonsOld);

        DeletePersonRequest deletePersonRequest = new DeletePersonRequest();
        deletePersonRequest.setAuthRequest(authRequest);
        deletePersonRequest.setID(79);
        personsWSBare.deletePerson(deletePersonRequest);

        int numberOfPersonsNew = personsWSBare.getAllPersons(listPersonsRequest).getPersons().getPerson().size();
        System.out.println("old number of persons " + numberOfPersonsNew);
    }

    public static String personToString(Person person) {
        return "Person: [id:" + person.getId() + " lastname:" + person.getLastname() + " firstname:" + person.getFirstname() + " age:" + person.getAge() + "]";
    }

    private static SSLContext getInsecureSSLContext() {
        TrustManager[] trustStore = new TrustManager[] { new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
            }
        } };

        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustStore, new SecureRandom());
            return sc;
        } catch (KeyManagementException | NoSuchAlgorithmException ex) {
            return null;
        }
    }

    private static HostnameVerifier getHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession sslSession) {
                return true;
            }
        };
    }
}
