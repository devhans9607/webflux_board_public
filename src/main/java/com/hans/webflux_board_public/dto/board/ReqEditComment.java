package com.hans.webflux_board_public.dto.board;

import com.hans.webflux_board_public.entity.Comment;
import lombok.Data;

@Data
public class ReqEditComment {
    private Long commentId;
    private Long postId;
    private Long uid; // commentUid
    private String contents;

    public static Comment mapper(Comment comment, ReqEditComment req) {
        comment.setContents(req.getContents());
        return comment;
    }
}
