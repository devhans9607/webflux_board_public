package com.hans.webflux_board_public.dto.user;

import com.hans.webflux_board_public.entity.User;
import lombok.Data;

@Data
public class ReqSignUp {
    String userId;
    String userPwd;
    String name;

    public static User mapper(ReqSignUp req) {
        return User.builder()
                .userName(req.getName())
                .userId(req.getUserId())
                .userPwd(req.getUserPwd())
                .valid(true)
                .build();
    }
}
