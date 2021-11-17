package com.hans.webflux_board_public.dto.board;

import com.hans.webflux_board_public.entity.CommentWithName;
import com.hans.webflux_board_public.entity.PostWithName;
import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.util.function.Tuple2;

import java.util.List;

@Data
@AllArgsConstructor
public class ResGetPost {
    private List<CommentWithName> pagedComments;
    private PostWithName post;

    public ResGetPost(Tuple2<List<CommentWithName>, PostWithName> tuple2) {
        this.pagedComments = tuple2.getT1();
        this.post = tuple2.getT2();
    }
}
