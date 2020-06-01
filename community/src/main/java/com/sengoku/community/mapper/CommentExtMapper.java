package com.sengoku.community.mapper;

import life.majiang.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}