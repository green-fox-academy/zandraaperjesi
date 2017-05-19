package com.zandraa.perjesi.redditapp;

import com.zandraa.perjesi.redditapp.model.Post;
import com.zandraa.perjesi.redditapp.repository.PostRepository;
import com.zandraa.perjesi.redditapp.service.PostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedditPostTest {

  @Test
  public void newPostTest() throws Exception{
    PostRepository mockedPostRepository = Mockito.mock(PostRepository.class);
    Mockito.when(mockedPostRepository.findOne(0L))
            .thenReturn(new Post("testTitle", "testHref", "testOwner"));

    PostService postServiceUnderTest = new PostService(mockedPostRepository);
    assertEquals(postServiceUnderTest.upVote(0).getScore(), 1);
  }
}
