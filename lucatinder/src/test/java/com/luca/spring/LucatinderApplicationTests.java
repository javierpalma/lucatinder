package com.luca.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.luca.spring.controller.HomeController;
import com.luca.spring.model.Perfil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LucatinderApplicationTests {
/*
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void pruebaPerfilDAOImpl() {//HAcemos test para probar el PerfilDAOImpl
		Perfil p= new Perfil();
	}
	*/
	@Test
	public void logginTest() {//Hacer test para probar si podemos acceder a la aplicacion con nuestro id
		HomeController h= new HomeController();
		Perfil p= new Perfil();
		h.inicio(p);
		
	}
}
