package com.zandraa.perjesi.redditapp.controller;

import com.zandraa.perjesi.redditapp.model.InputData;
import com.zandraa.perjesi.redditapp.model.Post;
import com.zandraa.perjesi.redditapp.model.PostList;
import com.zandraa.perjesi.redditapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class PostController {

  private PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public PostList postList() {
    return postService.postList();
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody InputData newPost, @RequestHeader String owner) {
    return postService.addPost(newPost, owner);
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upVote(@PathVariable("id") long id) {
    return postService.upVote(id);
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downVote(@PathVariable("id") long id) {
    return postService.downVote(id);
  }

  @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
  public Post deletePost(@PathVariable("id") long id) {
    return postService.deletePost(id);
  }
}
