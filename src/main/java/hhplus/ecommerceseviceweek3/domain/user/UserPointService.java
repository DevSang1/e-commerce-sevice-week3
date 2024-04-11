package hhplus.ecommerceseviceweek3.domain.user;

import org.springframework.stereotype.Service;

@Service
public class UserPointService {
    private final UserReader userReader;
    private final UserPoint userPoint;

    public UserPointService(UserReader userReader, UserPoint userPoint) {
        this.userReader = userReader;
        this.userPoint = userPoint;
    }

    public Long getUserPoint(Long userId) {
        User user = userReader.readById(userId);
        return user.point();
    }

    public Long chargeUserPoint(Long userId, Long amount) {
        User user = userReader.readById(userId);
        User chargePoint = userPoint.chargePoint(user, amount);
        return chargePoint.point();
    }

}
