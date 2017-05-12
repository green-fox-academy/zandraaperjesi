package com.zandraa.perjesi.redditapp.services;

import com.zandraa.perjesi.redditapp.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{
}
