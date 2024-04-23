package hhplus.ecommerceseviceweek3.domain.payment;

import java.time.LocalDateTime;

public record Payment(
        Long id,
        Long orderId,
        Long payment,
        String paymentMethod,
        LocalDateTime PaymentDateTime
) {
}
