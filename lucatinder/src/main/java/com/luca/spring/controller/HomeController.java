package com.luca.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.luca.spring.Services.PerfilService;
import com.luca.spring.model.Perfil;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @Version 1.0
 * 
 * Controlador para los requestMapping
 * Controller for requestMapping
 *  
 */
@Controller
@ComponentScan("/resources/templates/")
public class HomeController {
	@Autowired
	private PerfilService perfilService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/addLike", method = RequestMethod.POST)
	public String addLike(@ModelAttribute("idPerfil") int idPerfil, @ModelAttribute("idOtroPerfil") int idOtroPerfil, ModelMap model) {
		logger.info("-------DAR LIKE-------");
		perfilService.addLike(idPerfil, idOtroPerfil);
		return "listado.html";
	}
	
	/**
	 * @author Jose Miguel
	 * @param perfil. Metodo recibe parametro de tipo Perfil.
	 * 				  Method get param type Perfil.
	 * 
	 * @param model.  Metodo recibe parametro de tipo modelo.
	 * 				  Method get param type ModelMap
	 * 
	 * @return listado.html. Metodo retorna un objeto de tipo String.
	 * 						 Method return String object type.
	 * 
	 * @date 27/08/19
	 * @version 1.0
	 */
	  @RequestMapping(value = "/addPerfil", method = RequestMethod.POST)
	  public String altaPerfil(@ModelAttribute("perfil") Perfil perfil, ModelMap model) { 
		  logger.info("-- Registrando");
	      System.out.println("-- metodo addCliente");
	      System.out.println("--------"+perfil);	      
	      model.addAttribute(perfil);
	      perfilService.addPerfil(perfil);
	      return "listado";
	  }
	  
	  /**
	 * @author Jose Miguel
	 * @param perfil. Metodo recibe parametro de tipo Perfil.
	 * 				  Method get param type Perfil.
	 * @param model.  Metodo recibe parametro de tipo ModelMap.
	 * 				  Method get param type ModelMap.
	 * @return inicio.html
	 * @date 27/08/19
	 * @version 1.0
	   */
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public String inicio(@ModelAttribute("perfil") Perfil perfil) {
		  logger.info("-- en Inicio");
	      return "inicio";
	  }
	  
	  /**
	   * 
	   * @author Valdimir Juan
	   * @param id. Metodo recibe un parametro de tipo id.
	   * 			This method get param type id.
	   * 
	   * @param model.  Metodo recibe parametro de tipo ModelMap.
	 * 					Method get param type ModelMap.
	 * 
	   * @return String. Metodo retorna un objeto de tipo String
	   * 				 Method return String object type.
	   * 
	   * @date 27/08/19
	   * 
	   */
	  @RequestMapping(value="/login", method = RequestMethod.POST)
	  public String loggin(@RequestParam("idPerfil") Integer idPerfil, Perfil perfil, ModelMap model) {
		  logger.info("--- Buscando usuario por id ");
		  model.addAttribute(perfil);
		  model.addAttribute(idPerfil);
		  if(perfilService.getPefil(idPerfil)!=null) {
			  logger.info("------------ Usuario encontrado ");
			  return "listado";
		  }
		  else {
			  logger.warn("--------- Usuario no encontrado ");
		  	return "inicio";
		  }
	  }
	  
	  /**
	   * Metodo genera perfiles falsos.
	   * 
	   * @return inicio.html. Metodo retorna un objeto de tipo String.
	   * 					  Method return String object type.
	   */
	  @RequestMapping(value = "/aleatorio", method = RequestMethod.GET)
	  public String generarPerfilFalso() { 
		  logger.info("-- Registrando perfil falso");
	      System.out.println("-- metodo generarPerfilFalso");
	      //System.out.println("--------"+perfil);	      
	      //model.addAttribute(perfil);
	      perfilService.crearPerfilFalso();
	      return "inicio";
	  }
	  
	  /**
	   * @author Jose Miguel
	   * @param perfil. Metodo recibe como parametro un objeto de tipo Perfil.
	   * 				Method get param object type Perfil.
	   * 
	   * @param model. Metodo recibe como parametro un objeto de tipo ModelMap.
	   * 			   Method get param object type ModelMap.
	   * 
	   * @return contacto.html. Metodo retorna un objeto de tipo String.
	   * 						Method return String object type.
	   * 
	   */
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public String listarContacto(@ModelAttribute("perfil") Perfil perfil, ModelMap model) {
		  logger.info("-- en Listado Contactos");	
	      System.out.println("---- metodo Listar Contacto");
	      int id = perfil.getIdPerfil();
	      List<Perfil> listPerfil = perfilService.listarContacto(id);
	      model.addAttribute("listPerfil",listPerfil);
	      
	      return "contacto.html";	      
	   }
	      	  

}
