
package com.tadamia.client.ws.bare;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tadamia.client.ws.bare package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPersonRequest_QNAME = new QName("http://ws.tadamia.com/", "AddPersonRequest");
    private final static QName _AddPersonResult_QNAME = new QName("http://ws.tadamia.com/", "AddPersonResult");
    private final static QName _DeletePersonRequest_QNAME = new QName("http://ws.tadamia.com/", "DeletePersonRequest");
    private final static QName _DeletePersonResult_QNAME = new QName("http://ws.tadamia.com/", "DeletePersonResult");
    private final static QName _GetAllPersonsResult_QNAME = new QName("http://ws.tadamia.com/", "GetAllPersonsResult");
    private final static QName _GetPersonRequest_QNAME = new QName("http://ws.tadamia.com/", "GetPersonRequest");
    private final static QName _GetPersonResult_QNAME = new QName("http://ws.tadamia.com/", "GetPersonResult");
    private final static QName _ListPersonsRequest_QNAME = new QName("http://ws.tadamia.com/", "ListPersonsRequest");
    private final static QName _PersonAlreadyExists_QNAME = new QName("http://ws.tadamia.com/", "PersonAlreadyExists");
    private final static QName _PersonNotFound_QNAME = new QName("http://ws.tadamia.com/", "PersonNotFound");
    private final static QName _UpdatePersonRequest_QNAME = new QName("http://ws.tadamia.com/", "UpdatePersonRequest");
    private final static QName _UpdatePersonResult_QNAME = new QName("http://ws.tadamia.com/", "UpdatePersonResult");
    private final static QName _Person_QNAME = new QName("http://ws.tadamia.com/", "person");
    private final static QName _Persons_QNAME = new QName("http://ws.tadamia.com/", "persons");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tadamia.client.ws.bare
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonRequest }
     * 
     * @return
     *     the new instance of {@link AddPersonRequest }
     */
    public AddPersonRequest createAddPersonRequest() {
        return new AddPersonRequest();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     * @return
     *     the new instance of {@link AddPersonResponse }
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonRequest }
     * 
     * @return
     *     the new instance of {@link DeletePersonRequest }
     */
    public DeletePersonRequest createDeletePersonRequest() {
        return new DeletePersonRequest();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     * @return
     *     the new instance of {@link DeletePersonResponse }
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ListPersonsResponse }
     * 
     * @return
     *     the new instance of {@link ListPersonsResponse }
     */
    public ListPersonsResponse createListPersonsResponse() {
        return new ListPersonsResponse();
    }

    /**
     * Create an instance of {@link GetPersonRequest }
     * 
     * @return
     *     the new instance of {@link GetPersonRequest }
     */
    public GetPersonRequest createGetPersonRequest() {
        return new GetPersonRequest();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonResponse }
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link ListPersonsRequest }
     * 
     * @return
     *     the new instance of {@link ListPersonsRequest }
     */
    public ListPersonsRequest createListPersonsRequest() {
        return new ListPersonsRequest();
    }

    /**
     * Create an instance of {@link PersonAlreadyExists }
     * 
     * @return
     *     the new instance of {@link PersonAlreadyExists }
     */
    public PersonAlreadyExists createPersonAlreadyExists() {
        return new PersonAlreadyExists();
    }

    /**
     * Create an instance of {@link PersonNotFound }
     * 
     * @return
     *     the new instance of {@link PersonNotFound }
     */
    public PersonNotFound createPersonNotFound() {
        return new PersonNotFound();
    }

    /**
     * Create an instance of {@link UpdatePersonRequest }
     * 
     * @return
     *     the new instance of {@link UpdatePersonRequest }
     */
    public UpdatePersonRequest createUpdatePersonRequest() {
        return new UpdatePersonRequest();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePersonResponse }
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     * @return
     *     the new instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Persons }
     * 
     * @return
     *     the new instance of {@link Persons }
     */
    public Persons createPersons() {
        return new Persons();
    }

    /**
     * Create an instance of {@link AuthRequest }
     * 
     * @return
     *     the new instance of {@link AuthRequest }
     */
    public AuthRequest createAuthRequest() {
        return new AuthRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPersonRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "AddPersonRequest")
    public JAXBElement<AddPersonRequest> createAddPersonRequest(AddPersonRequest value) {
        return new JAXBElement<>(_AddPersonRequest_QNAME, AddPersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "AddPersonResult")
    public JAXBElement<AddPersonResponse> createAddPersonResult(AddPersonResponse value) {
        return new JAXBElement<>(_AddPersonResult_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "DeletePersonRequest")
    public JAXBElement<DeletePersonRequest> createDeletePersonRequest(DeletePersonRequest value) {
        return new JAXBElement<>(_DeletePersonRequest_QNAME, DeletePersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "DeletePersonResult")
    public JAXBElement<DeletePersonResponse> createDeletePersonResult(DeletePersonResponse value) {
        return new JAXBElement<>(_DeletePersonResult_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersonsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListPersonsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetAllPersonsResult")
    public JAXBElement<ListPersonsResponse> createGetAllPersonsResult(ListPersonsResponse value) {
        return new JAXBElement<>(_GetAllPersonsResult_QNAME, ListPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetPersonRequest")
    public JAXBElement<GetPersonRequest> createGetPersonRequest(GetPersonRequest value) {
        return new JAXBElement<>(_GetPersonRequest_QNAME, GetPersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "GetPersonResult")
    public JAXBElement<GetPersonResponse> createGetPersonResult(GetPersonResponse value) {
        return new JAXBElement<>(_GetPersonResult_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersonsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListPersonsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "ListPersonsRequest")
    public JAXBElement<ListPersonsRequest> createListPersonsRequest(ListPersonsRequest value) {
        return new JAXBElement<>(_ListPersonsRequest_QNAME, ListPersonsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonAlreadyExists }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonAlreadyExists }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "PersonAlreadyExists")
    public JAXBElement<PersonAlreadyExists> createPersonAlreadyExists(PersonAlreadyExists value) {
        return new JAXBElement<>(_PersonAlreadyExists_QNAME, PersonAlreadyExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNotFound }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonNotFound }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "PersonNotFound")
    public JAXBElement<PersonNotFound> createPersonNotFound(PersonNotFound value) {
        return new JAXBElement<>(_PersonNotFound_QNAME, PersonNotFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "UpdatePersonRequest")
    public JAXBElement<UpdatePersonRequest> createUpdatePersonRequest(UpdatePersonRequest value) {
        return new JAXBElement<>(_UpdatePersonRequest_QNAME, UpdatePersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "UpdatePersonResult")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResult(UpdatePersonResponse value) {
        return new JAXBElement<>(_UpdatePersonResult_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persons }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Persons }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.tadamia.com/", name = "persons")
    public JAXBElement<Persons> createPersons(Persons value) {
        return new JAXBElement<>(_Persons_QNAME, Persons.class, null, value);
    }

}
