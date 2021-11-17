package com.hans.webflux_board_public.dto.board;

import lombok.Data;

@Data
public class ReqPostPagedComments {
    private Integer pageNum = 1;
    private Integer commentsPerPage = 5;
    private Integer postId;
}
