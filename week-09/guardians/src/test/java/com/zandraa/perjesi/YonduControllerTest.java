package com.zandraa.perjesi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardiansApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class YonduControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void yourFirstTest() throws Exception{
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void grootWithoutParamTest() throws Exception{
    mockMvc.perform(get("/yondu"))
            .andExpect(status().is(418))
            .andDo(print())
            .andExpect(jsonPath("$.error").value("No params!"));
  }
}
