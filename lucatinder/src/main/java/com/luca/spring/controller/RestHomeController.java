package com.luca.spring.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.luca.spring.Services.PerfilService;
import com.luca.spring.model.Perfil;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
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
			value = "/API/addPerfil", 
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
	  @RequestMapping(value = "/API/listado/{id}",
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
	  
		/**
		 * @author José Miguel 
		 * @param idPerfil
		 * @param idOtroPerfil
		 * @param model
		 * @version 1.0
		 */
		@RequestMapping(
				value = "/API/addLike/{idPerfil}/{idOtroPerfil}", 
				method = RequestMethod.POST, 
				headers ={"Accept=application/json"},			
				produces = "application/json; charset=utf-8")
		public void addLike(@PathVariable("idPerfil") int idPerfil, @PathVariable("idOtroPerfil") int idOtroPerfil) {
			logger.info("-------DAR LIKE EN EL REST-------");
			perfilService.addLike(idPerfil, idOtroPerfil);
		}
		
		
		/**
		 * @author Asiel Blanco
		 * @param perfil
		 * @param model
		 * @return listContacto
		 */
	  @GetMapping("/API/contacto/{id}")
	  public List<Perfil> listarContacto(@PathVariable("id") int id) {
		  
		  logger.info("-- en Listado Contactos");	
	      System.out.println("---- metodo Listar Contacto");
	      /*
	      int id = perfil.getIdPerfil();
	      List<Perfil> listContacto = perfilService.listarContacto(id);
	     */
	      return perfilService.listarContacto(id) ;	   
	      
	   }
	  
	  @GetMapping("/API/login/{id}")
	  public Perfil login(@PathVariable("id") int id) {
		  System.out.println("--------------------------" + id);
		  return perfilService.getPefil(id);
	  }
	  
	
}
