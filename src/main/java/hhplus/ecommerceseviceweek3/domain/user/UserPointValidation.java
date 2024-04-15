package hhplus.ecommerceseviceweek3.domain.user;

import org.springframework.stereotype.Component;

@Component
public class UserPointValidation {

    public void checkThePointForPay(User user, Long payAmount) {
        user.notEnoughPoint(payAmount);
    }
}
