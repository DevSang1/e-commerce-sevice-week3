package hhplus.ecommerceseviceweek3.api.user;

import hhplus.ecommerceseviceweek3.api.user.dto.request.ChargePoint;
import hhplus.ecommerceseviceweek3.api.user.dto.response.BalanceResponse;
import hhplus.ecommerceseviceweek3.api.user.dto.response.ChargePointResponse;
import hhplus.ecommerceseviceweek3.domain.user.UserPointService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private UserPointService userPointService;

    public UserController(UserPointService userPointService) {
        this.userPointService = userPointService;
    }

    @GetMapping("/{userId}")
    public BalanceResponse getBalance(@PathVariable Long userId) {
        Long balance = userPointService.getUserPoint(userId);
        return BalanceResponse.from(balance);
    }

    @PostMapping("/charge/{userId}")
    public ChargePointResponse charge(@PathVariable Long userId,
                                      @Valid
                                      @RequestBody ChargePoint chargePoint) {
        Long balance = userPointService.chargeUserPoint(userId, chargePoint.point());
        return ChargePointResponse.from(balance);
    }
}
