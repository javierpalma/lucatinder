package com.luca.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.luca.spring.Services.PerfilServiceImpl;
import com.luca.spring.controller.HomeController;
import com.luca.spring.dao.PerfilDAOImpl;
import com.luca.spring.model.Perfil;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LucatinderApplicationTests6 {

    @Autowired
    private MockMvc mockMvc;
	
    @Test
    public void testHtml() throws Exception {
        this.mockMvc
        .perform(get("/lucatinder_lucatinder/src/main/resources/templates/inicio.html"))
        .andDo(print())
        .andExpect(status().isOk());
    }
}
