package ru.als.app.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.als.app.dto.CustomerRegistrationRequest;
import ru.als.app.entity.Customer;
import ru.als.app.fraud.FraudCheckResponse;
import ru.als.app.fraud.FraudClient;
import ru.als.app.notification.NotificationRequest;
import ru.als.app.repository.CustomerRepository;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        customerRepository.saveAndFlush(customer);

        FraudCheckResponse fraudCheckResponse =
                fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }

        NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome to Amigoscode...",
                        customer.getFirstName())
        );
//        rabbitMQMessageProducer.publish(
//                notificationRequest,
//                "internal.exchange",
//                "internal.notification.routing-key"
//        );

    }
}