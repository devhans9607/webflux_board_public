package com.hans.webflux_board_public.dto.board;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResDeletePost {
    Long deletedPostId;
    Integer queryResult;
}
