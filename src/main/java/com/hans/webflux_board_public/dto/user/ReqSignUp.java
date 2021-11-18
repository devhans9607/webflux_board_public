package com.hans.webflux_board_public.dto.user;

import com.hans.webflux_board_public.entity.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class ReqSignUp {
    String userId;
    String userPwd;
    String name;

    public static User mapper(ReqSignUp req, PasswordEncoder encoder) {
        return User.builder()
                .userName(req.getName())
                .userId(req.getUserId())
                .userPwd(encoder.encode(req.getUserPwd()))
                .valid(true)
                .build();
    }
}
