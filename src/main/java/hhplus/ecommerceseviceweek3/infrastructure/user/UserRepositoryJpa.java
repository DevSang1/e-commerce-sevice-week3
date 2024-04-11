package hhplus.ecommerceseviceweek3.infrastructure.user;

import hhplus.ecommerceseviceweek3.domain.user.User;
import hhplus.ecommerceseviceweek3.domain.user.UserRepository;
import hhplus.ecommerceseviceweek3.infrastructure.UserEntity;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryJpa implements UserRepository {


    @PersistenceContext
    private UserEntity userEntity;

    @Override
    public User findById(Long userId) {
        return
    }

    @Override
    @Transactional
    public User updateUserPoint(User user) {
        // 해당 ID의 User를 찾고, 없으면 null 반환
        User existingUser = entityManager.find(User.class, user.getId());
        if (existingUser == null) {
            return null;
        }

        // 포인트 업데이트
        existingUser.setPoints(user.getPoints());

        // 변경된 내용을 데이터베이스에 반영
        entityManager.merge(existingUser);
        return existingUser;
    }
}
