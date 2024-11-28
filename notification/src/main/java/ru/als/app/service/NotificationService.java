package ru.als.app.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.als.app.entity.Notification;
import ru.als.app.notification.NotificationRequest;
import ru.als.app.respository.NotificationRepository;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("Alson")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}
