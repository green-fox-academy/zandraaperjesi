package com.zandraa.perjesi.redditapp.controllers;

import com.zandraa.perjesi.redditapp.models.InputData;
import com.zandraa.perjesi.redditapp.models.Post;
import com.zandraa.perjesi.redditapp.models.PostList;
import com.zandraa.perjesi.redditapp.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
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

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public Post upVote(@PathVariable("id") long id) {
    Post upvotePost = postRepository.findOne(id);
    upvotePost.setScore(upvotePost.getScore() + 1);
    postRepository.save(upvotePost);
    return upvotePost;
  }

  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public Post downVote(@PathVariable("id") long id) {
    Post downvotePost = postRepository.findOne(id);
    downvotePost.setScore(downvotePost.getScore() - 1);
    postRepository.save(downvotePost);
    return downvotePost;
  }

  @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
  public Post deletePost(@PathVariable("id") long id) {
    Post deletePost = postRepository.findOne(id);
    postRepository.delete(id);
    return deletePost;
  }
}
