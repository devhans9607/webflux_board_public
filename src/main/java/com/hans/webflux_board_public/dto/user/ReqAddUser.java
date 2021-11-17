package com.hans.webflux_board_public.dto.user;

import com.hans.webflux_board_public.entity.User;
import lombok.Data;

@Data
public class ReqAddUser {
    String userId;
    String userPwd;
    String name;
    Boolean valid;

    public static User mapper(ReqAddUser req) {
        return User.builder()
                .userName(req.getName())
                .userId(req.getUserId())
                .userPwd(req.getUserPwd())
                .valid(req.getValid())
                .build();
    }
}
