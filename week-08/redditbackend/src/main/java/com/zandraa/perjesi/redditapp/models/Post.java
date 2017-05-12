package com.zandraa.perjesi.redditapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String href;
  private long timestamp;
  private long score;

  public Post() {}

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timestamp = new Date().getTime();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }
}
