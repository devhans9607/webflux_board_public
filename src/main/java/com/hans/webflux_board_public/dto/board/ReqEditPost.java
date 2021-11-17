package com.hans.webflux_board_public.dto.board;

import com.hans.webflux_board_public.entity.Post;
import lombok.Data;

@Data
public class ReqEditPost {
    private Long uid;
    private Long postId;
    private String title;
    private String contents;

    public static Post mapper(Post post, ReqEditPost req) {
        post.setTitle(req.getTitle());
        post.setContents(req.getContents());
        return post;
    }
}
