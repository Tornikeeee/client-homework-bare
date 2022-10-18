package com.tadamia;

import com.tadamia.client.ws.bare.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static PersonsWSBare personsWSBare;
    static AuthRequest authRequest = new AuthRequest();

    static {
        authRequest.setUsername("adminUser");
        authRequest.setPassword("asdASD123");

        try {
            URL urlBare = new URL("http://localhost:8080/person-service/PersonServiceBare?wsdl");

            PersonsWSBareImplService personsWSBareImplService = new PersonsWSBareImplService(urlBare);

            personsWSBare = personsWSBareImplService.getPersonsWSBareImplPort();
        } catch (MalformedURLException e) {
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
}
