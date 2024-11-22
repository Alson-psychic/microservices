package ru.als.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.als.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
