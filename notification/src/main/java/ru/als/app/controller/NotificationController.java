package ru.als.app.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import ru.als.app.notification.NotificationRequest;
import ru.als.app.service.NotificationService;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/notification")
public class NotificationController {
    //private final NotificationService notificationService;

//    @PostMapping
//    public void sendNotification(@RequestBody NotificationRequest request) {
//        log.info("New notification... {}", request);
//        notificationService.send(request);
//    }
}
