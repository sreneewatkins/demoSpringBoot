package com.tts.demo2.repository;

import com.tts.demo2.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    /*
    CustomerRepository extends the CrudRepository interface. The type of
    entity and ID that it works with (Customer and Long) are specified in
    the parameters on CrudRepository. By extending CrudRepository,
    CustomerRepository inherits several methods for working with Customer
    persistence, which include methods for saving, deleting, and reading
    Customer entities.
     */
    List<Customer> findByLastName(String lastName);

}//end CustomerRepository interface
