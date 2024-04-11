package hhplus.ecommerceseviceweek3.domain.user;

public interface UserRepository {

    User findById(Long userId);

    User updateUserPoint(User user);
}
