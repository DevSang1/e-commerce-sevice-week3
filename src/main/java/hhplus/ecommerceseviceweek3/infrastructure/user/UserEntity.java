package hhplus.ecommerceseviceweek3.infrastructure.user;

import hhplus.ecommerceseviceweek3.domain.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Point")
    private Long point;

    public User toUser() {
        return new User(getId(), point);
    }

    public void updatePoint(User user) {
        this.point = user.point();
    }
}
