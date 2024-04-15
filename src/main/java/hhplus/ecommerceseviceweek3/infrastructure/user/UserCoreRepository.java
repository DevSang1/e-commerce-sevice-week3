package hhplus.ecommerceseviceweek3.infrastructure.user;

import hhplus.ecommerceseviceweek3.domain.user.User;
import hhplus.ecommerceseviceweek3.domain.user.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class UserCoreRepository implements UserRepository {
    private final UserJpaRepository userJpaRepository;

    public UserCoreRepository(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public User findById(Long userId) {
        return userJpaRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("사용자를 찾지 못했습니다. - id: " + userId))
                .toUser();
    }

    @Override
    public User updateUserPoint(User user) {
        return null;
    }
}
