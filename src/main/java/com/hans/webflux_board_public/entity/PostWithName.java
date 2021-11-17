package com.hans.webflux_board_public.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.relational.core.mapping.Column;

@EqualsAndHashCode(callSuper = true)
@Data
public class PostWithName extends Post {
    @Column("name")
    private String userName;
}
