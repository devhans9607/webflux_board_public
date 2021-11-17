package com.hans.webflux_board_public.dto.board;

import com.hans.webflux_board_public.entity.PostWithName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResGetPagedPosts {
    private List<PostWithName> posts;
    private String keyword;
}
