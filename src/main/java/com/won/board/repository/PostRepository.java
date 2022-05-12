package com.won.board.repository;

import com.won.board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


    @Query("select p from Post p where p.category.categoryNo = :categoryNo and p.isDeleted = false")
    List<Post> findByCategoryNo(long categoryNo);

}
