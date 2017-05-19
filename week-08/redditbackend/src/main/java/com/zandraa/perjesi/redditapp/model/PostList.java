package com.zandraa.perjesi.redditapp.model;

public class PostList {
  private Iterable<Post> posts;

  public PostList() {}

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
