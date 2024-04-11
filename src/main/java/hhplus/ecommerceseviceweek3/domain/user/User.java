package hhplus.ecommerceseviceweek3.domain.user;

public record User(
        Long id,
        Long point
) {
    public User chargePoint(Long chargePoint) {
        return new User(id, point + chargePoint);
    }

    public User usePoint(Long amount) {
        return new User(id, point - amount);
    }

    public void notEnoughPoint(Long totalPaymentAmount) {
        if (point < totalPaymentAmount) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
    }
}
