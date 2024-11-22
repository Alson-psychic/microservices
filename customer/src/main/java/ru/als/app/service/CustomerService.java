package ru.als.app.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.als.app.dto.CustomerRegistrationRequest;
import ru.als.app.entity.Customer;
import ru.als.app.repository.CustomerRepository;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    public final CustomerRegistrationRequest customerRegistrationRequest;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.saveAndFlush(customer);
    }
}
