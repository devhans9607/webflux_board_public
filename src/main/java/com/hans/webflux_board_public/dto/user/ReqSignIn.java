package com.hans.webflux_board_public.dto.user;

import lombok.Data;

@Data
public class ReqSignIn {
    String userId;
    String userPwd;
}
