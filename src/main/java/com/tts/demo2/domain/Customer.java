package com.tts.demo2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
To let Spring Boot know that we want to make sure those instances of our
Customer class are stored in a database, we make it an Entity by using
the @Entity annotation.
This indicates Customer is a JPA entity. It is assumed that this entity
will be mapped to a table named Customer.
 */
@Entity
public class Customer {

    /*
    The Customer’s id property is annotated with @Id so that JPA will
    recognize it as the object’s primary key. The id property is also
    annotated with @GeneratedValue to indicate that the ID should be
    generated automatically.
    The other two properties, firstName and lastName are left unannotated.
    It is assumed that they’ll be mapped to columns that share the same
    name as the properties themselves.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    /*
    @Entity needs an empty constructor  to create a new instance via the
    persistence framework. Typically, if you don't provide any additional
    constructors with arguments for the class, you don't need to provide
    an empty constructor, as Java provides on by default.
     */
    public Customer(){
        //@Entity needs a non-argument constructor
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}//end Customer class


