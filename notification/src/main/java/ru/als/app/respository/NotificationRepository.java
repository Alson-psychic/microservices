package ru.als.app.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.als.app.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
