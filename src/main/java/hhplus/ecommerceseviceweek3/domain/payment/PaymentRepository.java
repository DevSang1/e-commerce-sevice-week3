package hhplus.ecommerceseviceweek3.domain.payment;

public interface PaymentRepository {
    Payment create(Long orderId, Long payAmount, String paymentMethod);
}
