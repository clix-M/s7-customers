package clix.s7customers.service;


import clix.s7customers.model.Customer;
import clix.s7customers.repo.RCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SCustomer {
    @Autowired
    private RCustomer rCustomer;

    // get all customers
    public List<Customer> getAllCustomers() {
        return rCustomer.findAll();
    }

    // post a customer
    public Customer postCustomer(Customer customer) {
        return rCustomer.save(customer);
    }
    // delete a customer by id
    public void deleteCustomerById(UUID id) {
        rCustomer.deleteById(id);
    }

    // get a customer by id
    public Customer getCustomerById(UUID id) {
        return rCustomer.findById(id).orElse(null);
    }

    // total salary of all customers
    public double totalSalary() {
        return rCustomer.findAll().stream().mapToDouble(Customer::getSalary).sum();
    }

    // gtotal employees
    public long totalEmployees() {
        return rCustomer.count();
    }
}