package com.zandraa.perjesi.redditapp.controllers;

import com.zandraa.perjesi.redditapp.models.InputData;
import com.zandraa.perjesi.redditapp.models.Post;
import com.zandraa.perjesi.redditapp.models.PostList;
import com.zandraa.perjesi.redditapp.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public PostList postList() {
    PostList newList = new PostList();
    newList.setPosts(postRepository.findAll());
    return newList;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody InputData newPost) {
    Post createThisPost = new Post(newPost.getTitle(), newPost.getHref());
    postRepository.save(createThisPost);
    return createThisPost;
  }
}
