package ru.als.app.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "fraud",
        url = "${clients.fraud.url}"
)
public interface FraudClient {
    FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerId
    );
}
