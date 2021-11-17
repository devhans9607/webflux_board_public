package com.hans.webflux_board_public.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResSignIn {
    boolean isSuccess;
    String userId;
    boolean isValid;
}
