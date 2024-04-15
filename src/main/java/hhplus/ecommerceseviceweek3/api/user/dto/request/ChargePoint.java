package hhplus.ecommerceseviceweek3.api.user.dto.request;

import jakarta.validation.constraints.NotNull;

public record ChargePoint(
        @NotNull
        Long point
) {
}
