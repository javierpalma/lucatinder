package com.luca.spring.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luca.spring.Services.PerfilService;
import com.luca.spring.model.Perfil;

@RestController
public class RestHomeController {
	
	@Autowired
	private PerfilService perfilService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	/**
	 * @author Jose Miguel
	 * @param perfil
	 * @return perfil
	 * @version 1.0
	 */
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

		return perfilService.getPefil(perfil.getIdPerfil());		
	}
	
	
	/**
	 * @author Jose Miguel
	 * @param idPerfil
	 * @param model
	 * @return listPerfil
	 */
	  @RequestMapping(value = "/rlistado/{id}",
			  method = RequestMethod.GET, 
			  headers ={"Accept=application/json"},			
			  produces = "application/json; charset=utf-8")
		  public List<Perfil> listar(@PathVariable("id") int idPerfil, ModelMap model) {
		  
		  logger.info("-- en Listado Perfil");
		  logger.info("-- idPerfil: "+idPerfil);
		  logger.info("------ p: ");
	      List<Perfil> listPerfil = perfilService.listarPerfil(idPerfil);
	      model.addAttribute("listPerfil",listPerfil);
	      System.out.println("------------------"+listPerfil);
	      
	      return listPerfil;
	      
	  }
	
}