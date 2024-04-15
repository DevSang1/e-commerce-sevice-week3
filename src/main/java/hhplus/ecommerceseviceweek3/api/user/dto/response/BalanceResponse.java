package hhplus.ecommerceseviceweek3.api.user.dto.response;

public record BalanceResponse(Long balance) {
    public static BalanceResponse from(Long balance) {
        return new BalanceResponse(balance);
    }
}
