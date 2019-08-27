package com.luca.spring.Util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.github.javafaker.Faker;
import com.luca.spring.model.Perfil;

public class Utilidades {

	EntityManager entityManager;
	
	public static Perfil crearPerfilFalso() {
		  
		  Faker faker = new Faker();
		  //for (int i = 0; i < 20; i++) {
			
			 
		    Perfil perfil = new Perfil(faker.idNumber().hashCode(),faker.name().firstName(),"nombre",23,"description",faker.address().cityName());
		    
		    //entityManager.merge(user);
		    
		    return perfil;
		  }
		 
		}
//}
