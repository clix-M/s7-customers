package clix.s7customers.repo;


import clix.s7customers.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RCustomer extends JpaRepository<Customer, UUID> {


}
