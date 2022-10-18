
package com.tadamia.client.ws.bare;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPersonRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="addPersonRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthRequest" type="{http://ws.tadamia.com/}authRequest"/>
 *         <element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPersonRequest", propOrder = {
    "authRequest",
    "id",
    "lastname",
    "firstname",
    "age"
})
public class AddPersonRequest {

    @XmlElement(name = "AuthRequest", required = true)
    protected AuthRequest authRequest;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "Lastname", required = true)
    protected String lastname;
    @XmlElement(name = "Firstname", required = true)
    protected String firstname;
    @XmlElement(name = "Age")
    protected int age;

    /**
     * Gets the value of the authRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuthRequest }
     *     
     */
    public AuthRequest getAuthRequest() {
        return authRequest;
    }

    /**
     * Sets the value of the authRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthRequest }
     *     
     */
    public void setAuthRequest(AuthRequest value) {
        this.authRequest = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

}
