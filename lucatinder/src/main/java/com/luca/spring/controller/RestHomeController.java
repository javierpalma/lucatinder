package com.luca.spring.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luca.spring.Services.PerfilService;
import com.luca.spring.model.Perfil;

@RestController
public class RestHomeController {
	
	@Autowired
	private PerfilService perfilService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// @RequestBody Student student significa que un estudiante será el cuerpo de la respuesta
	@RequestMapping(
			value = "/raddPerfil", 
			method = RequestMethod.POST, 
			headers ={"Accept=application/json"},			
			produces = "application/json; charset=utf-8")
		public Perfil addPerfil(Perfil perfil){
		logger.info("-- Registrando REST!!!!!!!!");
		perfil=perfilService.addPerfil(perfil);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(perfil.getIdPerfil())
				.toUri();
		
		/*
		 * Inside the method body, we build a java.net.URI object using ServletUriComponentsBuilder. 
		 * It builds the object by capturing the URI of the current request and appending the 
		 * placeholder /{id} to create a template. buildAndExpand(result.getId()) 
		 * inserts the id of the newly created student into the template. 
		 * The result is the URI of the new resource.
		 */

		return perfilService.getPefil(perfil.getIdPerfil());		
	}
	
}
