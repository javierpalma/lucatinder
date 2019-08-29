package com.luca.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.luca.spring.Services.PerfilServiceImpl;
import com.luca.spring.controller.HomeController;
import com.luca.spring.dao.PerfilDAOImpl;
import com.luca.spring.model.Perfil;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class LucatinderApplicationTests4 {

    @org.springframework.boot.web.server.LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.
        		getForObject("http://localhost:" + port + "/",String.class)).
          contains("Hello Wooorld");
    }
}
