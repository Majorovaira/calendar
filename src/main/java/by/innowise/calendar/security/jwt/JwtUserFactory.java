package by.innowise.calendar.security.jwt;

import by.innowise.calendar.model.User;
import by.innowise.calendar.model.UserStatus;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class JwtUserFactory {

    public static JwtUser create(User user){
        return new JwtUser(
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail(),
                user.getStatus().equals(UserStatus.ACTIVE),
                null,
                user.getUpdated());
    }
}
