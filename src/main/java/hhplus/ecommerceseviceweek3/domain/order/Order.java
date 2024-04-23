package hhplus.ecommerceseviceweek3.domain.order;

import java.time.LocalDateTime;

public record Order(
        Long id,
        Long userId,
        Long payAmount,
        String receiverName,
        String address,
        String phoneNumber,
        String orderStatus,
        LocalDateTime OrderDateTime
) {

}