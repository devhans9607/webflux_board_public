package com.hans.webflux_board_public.dto.board;

import lombok.Data;

@Data
public class ReqDeleteComment {
    private Long commentId;
    private Long uid;
}
