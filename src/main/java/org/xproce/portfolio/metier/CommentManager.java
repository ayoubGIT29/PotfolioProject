package org.xproce.portfolio.metier;

import org.springframework.data.domain.Page;
import org.xproce.portfolio.dao.entities.Comment;

public interface CommentManager {
    Comment addComment(Comment comment);
    Page<Comment> getAllComments(int page, int size);
    Comment getCommentById(Long id);
    Comment updateComment(Comment comment);
    boolean deleteComment(Long id);
}
