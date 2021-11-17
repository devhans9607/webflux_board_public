package com.hans.webflux_board_public.dto.board;

import lombok.Data;

@Data
public class ReqDeletePost {
    private Long postId;
    private Long uid;
}
