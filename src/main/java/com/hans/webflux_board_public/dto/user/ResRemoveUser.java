package com.hans.webflux_board_public.dto.user;

import lombok.Data;

@Data
public class ResRemoveUser {
    boolean deleteSuccess;

    public ResRemoveUser (int result) {
        this.deleteSuccess = result != 0;
    }
}
