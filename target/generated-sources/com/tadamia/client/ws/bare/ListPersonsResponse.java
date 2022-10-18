
package com.tadamia.client.ws.bare;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listPersonsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="listPersonsResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Persons" type="{http://ws.tadamia.com/}persons" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listPersonsResponse", propOrder = {
    "persons"
})
public class ListPersonsResponse {

    @XmlElement(name = "Persons")
    protected Persons persons;

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link Persons }
     *     
     */
    public Persons getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persons }
     *     
     */
    public void setPersons(Persons value) {
        this.persons = value;
    }

}
