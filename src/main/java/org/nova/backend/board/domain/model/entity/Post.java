package org.nova.backend.board.domain.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.nova.backend.board.domain.model.valueobject.PostType;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "post", indexes = {
        //@Index(name = "idx_member_id", columnList = "member_id"),
        @Index(name = "idx_post_id", columnList = "post_id")
})
public class Post {
    @Id
    @Column
    private UUID postId;

    @Column
    private UUID memberId;

    @Enumerated(EnumType.STRING)
    @Column
    private PostType postType;

    @Column
    private String title;

    @Column
    private String  content;

    @Column
    private int viewCount;

    @Column
    private int likeCount;

    @Column
    private int commentCount;

    @OneToMany(mappedBy = "post", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<File> files;

    @Column
    private LocalDateTime createdTime;

    @Column
    private LocalDateTime modifiedTime;
}
