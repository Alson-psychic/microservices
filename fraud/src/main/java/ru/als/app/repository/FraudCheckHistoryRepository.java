package ru.als.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.als.app.entity.FraudCheckHistory;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Long> {
}
