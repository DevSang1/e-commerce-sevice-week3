package hhplus.ecommerceseviceweek3.domain.user;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;


class UserPointServiceTest {

    private UserReader userReader;
    private UserPoint userPoint;
    private UserPointService userPointService;

    @BeforeEach
    void setUp() {
        userReader = mock(UserReader.class);
        userPoint = mock(UserPoint.class);
        userPointService = new UserPointService(userReader, userPoint);
    }

    @Test
    void 유저_포인트_충전_성공() {
        // Given
        Long userId = 1L;
        Long chargingPoint = 1000L;
        User user = TestFixtures.user(userId);

        given(userReader.retrieveByUserId(userId)).willReturn(user);
        given(userPointManager.chargePoint(user, chargingPoint))
                .willReturn(new User(user.id(), user.name(), user.address(), user.phoneNumber(), user.point() + chargingPoint));

        // When
        Long point = userPointService.chargePoint(userId, chargingPoint);

        // Then
        assertThat(point).isEqualTo(10_00_000L + 1000L);
    }
    }
}