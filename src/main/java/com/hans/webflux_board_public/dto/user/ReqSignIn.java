package com.hans.webflux_board_public.dto.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ReqSignIn {
    @NotNull(message = "wht not working")
    String userId;
    @NotEmpty(message = "wht not working2")
    String userPwd;
}
