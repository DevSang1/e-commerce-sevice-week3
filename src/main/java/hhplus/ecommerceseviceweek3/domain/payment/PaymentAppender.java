package hhplus.ecommerceseviceweek3.domain.payment;

import hhplus.ecommerceseviceweek3.domain.order.Order;
import org.springframework.stereotype.Component;

@Component
public class PaymentAppender {
    private final PaymentRepository paymentRepository;

    public PaymentAppender(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment create(Order order, Long payAmount, String paymentMethod) {
        return paymentRepository.create(order.id(), payAmount, paymentMethod);
    }
}
