package com.zandraa.perjesi.redditapp.repository;

import com.zandraa.perjesi.redditapp.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{
}
