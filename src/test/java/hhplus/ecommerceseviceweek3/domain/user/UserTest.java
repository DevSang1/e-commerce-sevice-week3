package hhplus.ecommerceseviceweek3.domain.user;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {
    private User user = new User(1l, 1000l);

    @Test
    void 포인트_충전_테스트() {
        //When
        User addPointUser = user.chargePoint(10000L);

        //Then
        assertThat(addPointUser.point()).isEqualTo(1000L + 10000L);
    }
}