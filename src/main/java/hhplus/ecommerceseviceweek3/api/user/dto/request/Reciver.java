package hhplus.ecommerceseviceweek3.api.user.dto.request;

import jakarta.validation.constraints.NotBlank;

public record Reciver(
        @NotBlank String name
) {
}
