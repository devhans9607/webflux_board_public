package com.hans.webflux_board_public.dto.board;

import com.hans.webflux_board_public.entity.Comment;
import lombok.Data;

@Data
public class ReqNewComment {
    private Long postId;
    private String contents;
    private Long uid;

    public static Comment mapper(ReqNewComment req) {
        return Comment.builder()
                .postId(req.getPostId())
                .contents(req.getContents())
                .isDeleted(false)
                .uid(req.getUid())
                .build();
    }
}
