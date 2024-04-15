package hhplus.ecommerceseviceweek3.api.user.dto.response;

public record ChargePointResponse(Long balance) {
    public static ChargePointResponse from(Long point) {
        return new ChargePointResponse(point);
    }
}
