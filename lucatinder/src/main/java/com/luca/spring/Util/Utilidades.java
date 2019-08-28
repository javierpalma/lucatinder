package com.luca.spring.Util;


import javax.persistence.EntityManager;

import com.github.javafaker.Faker;
import com.luca.spring.model.Perfil;

public class Utilidades {

	EntityManager entityManager;
	
	public static Perfil crearPerfilFalso() {
		  
		  Faker faker = new Faker();
		  //for (int i = 0; i < 20; i++) {
			
			 
		    Perfil perfil = new Perfil(faker.name().firstName(),faker.demographic().sex(),(int)(Math.random()*10),"Soy super cool y super fake",faker.address().cityName(),faker.demographic().sex(), (int)(Math.random()*10), (int)(Math.random()*10));
		    
		    //entityManager.merge(user);
		    
		    return perfil;
		  }
		 
		}
//}
