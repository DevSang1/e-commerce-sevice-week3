package hhplus.ecommerceseviceweek3.domain.payment;

import hhplus.ecommerceseviceweek3.domain.order.Order;
import hhplus.ecommerceseviceweek3.domain.user.User;
import hhplus.ecommerceseviceweek3.domain.user.UserPoint;
import hhplus.ecommerceseviceweek3.domain.user.UserPointValidation;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentAppender paymentAppender;
    private final UserPoint userPoint;
    private final UserPointValidation userPointValidation;

    public PaymentService(PaymentAppender paymentAppender, UserPoint userPoint, UserPointValidation userPointValidation) {
        this.paymentAppender = paymentAppender;
        this.userPoint = userPoint;
        this.userPointValidation = userPointValidation;
    }

    public Payment pay(User user, Order order, OrderRequest request) {
        if (!orderValidator.isOrderStatusWaitingForPay(order)) {
            throw new IllegalArgumentException("결제 대기 상태가 아닙니다. order status : " + order.orderStatus());
        }

        userPointValidator.checkUserPointForPay(user, request.paymentAmount());
        userPointManager.usePoint(user, request.paymentAmount());

        Order paidOrder = orderUpdater.changeStatus(order, OrderStatus.PAID);
        return paymentAppender.create(paidOrder, request.paymentAmount(), request.paymentMethod());
    }
}
