package com.zandraa.perjesi.redditapp.service;

import com.zandraa.perjesi.redditapp.model.InputData;
import com.zandraa.perjesi.redditapp.model.Post;
import com.zandraa.perjesi.redditapp.model.PostList;
import com.zandraa.perjesi.redditapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository){
    this.postRepository = postRepository;
  }

  public PostList postList() {
    PostList newList = new PostList();
    newList.setPosts(postRepository.findAll());
    return newList;
  }

  public Post addPost(InputData newPost, String owner) {
    Post createThisPost = new Post(newPost.getTitle(), newPost.getHref(), owner);
    postRepository.save(createThisPost);
    return createThisPost;
  }

  public Post upVote(long id) {
    Post upvotePost = postRepository.findOne(id);
    upvotePost.setScore(upvotePost.getScore() + 1);
    postRepository.save(upvotePost);
    return upvotePost;
  }

  public Post downVote(long id) {
    Post downvotePost = postRepository.findOne(id);
    downvotePost.setScore(downvotePost.getScore() - 1);
    postRepository.save(downvotePost);
    return downvotePost;
  }

  public Post deletePost(long id) {
    Post deletePost = postRepository.findOne(id);
    postRepository.delete(id);
    return deletePost;
  }
}
