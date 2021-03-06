package com.hans.webflux_board_public.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("posts")
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    @Id
    @Column("post_id")
    private Long postId;

    @Column("uid")
    private Long uid;
//    private User user;

    @Column("title")
    private String title;

    @Column("contents")
    private String contents;

    @Column("created_at")
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column("updated_at")
    private LocalDateTime updatedAt;

    @Column("delete_at")
    private LocalDateTime deletedAt;

    @Column("is_deleted")
    private Boolean isDeleted;
//
//    @Column("userid")
//    private String userId;

//    @JsonIgnore
//    private List<Comment> comments;
}
