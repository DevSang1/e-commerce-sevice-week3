package hhplus.ecommerceseviceweek3.domain.user;

import org.springframework.stereotype.Component;

@Component
public class UserPoint {
    private final UserRepository userRepository;

    public UserPoint(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User chargePoint(User user, Long chargingPoint) {
        return userRepository.updateUserPoint(user.chargePoint(chargingPoint));
    }

    public User usePoint(User user, Long payAmount) {
        return userRepository.updateUserPoint(user.usePoint(payAmount));
    }
}
