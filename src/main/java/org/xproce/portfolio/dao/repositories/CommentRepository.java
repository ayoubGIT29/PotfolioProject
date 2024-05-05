package org.xproce.portfolio.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.portfolio.dao.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Define custom query methods if needed
}
