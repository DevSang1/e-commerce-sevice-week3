package hhplus.ecommerceseviceweek3.domain.user;

import org.springframework.stereotype.Component;

@Component
public class UserReader {
    private final UserRepository userRepository;

    public UserReader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User readById(Long userId) {
        return userRepository.findById(userId);
    }
}
