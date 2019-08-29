package com.luca.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.luca.spring.Services.PerfilServiceImpl;
import com.luca.spring.controller.HomeController;
import com.luca.spring.dao.PerfilDAOImpl;
import com.luca.spring.model.Perfil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LucatinderApplicationTests3 {

	 @Autowired
	 private PerfilServiceImpl service;
	
	@Test
	public void contextLoads() {
		//controla que el service exista
    	
    	assertThat(service).isNotNull();
	}
}
