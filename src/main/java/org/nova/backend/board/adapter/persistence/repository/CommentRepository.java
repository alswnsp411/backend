package org.nova.backend.board.adapter.persistence.repository;

import java.util.List;
import java.util.UUID;
import org.nova.backend.board.domain.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {
    List<Comment> findAllByPostIdOrderByCreatedTimeAsc(UUID postId);
}
