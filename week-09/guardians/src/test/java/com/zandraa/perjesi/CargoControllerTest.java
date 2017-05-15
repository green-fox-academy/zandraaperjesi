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
public class CargoControllerTest {

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
    mockMvc.perform(get("/rocket"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.ready").value(false));
  }

  @Test
  public void fiveKCargoTest() throws Exception{
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.shipstatus").value("40%"));
  }

  @Test
  public void emptyCargoTest() throws Exception{
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=0"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.shipstatus").value("empty"));
  }

  @Test
  public void fullCargoTest() throws Exception{
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.shipstatus").value("full"));
  }

  @Test
  public void isReadyCargoTest() throws Exception{
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.ready").value(true));
  }

  @Test
  public void isNotReadyCargoTest() throws Exception{
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=10000"))
            .andExpect(status().isOk())
            .andDo(print())
            .andExpect(jsonPath("$.ready").value(false));
  }

  @Test
  public void grootWithoutParamTest() throws Exception{
    mockMvc.perform(get("/rocket/fill"))
            .andExpect(status().is(418))
            .andDo(print())
            .andExpect(jsonPath("$.error").value("No params!"));
  }
}
