package com.luca.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
public class HomeController {
	@Autowired
	private PerfilService perfilService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/addLike/{idPerfil}/{idOtroPerfil}", method = RequestMethod.GET)
	public ModelAndView addLike(@PathVariable("idOtroPerfil") int idOtroPerfil, @PathVariable("idPerfil") int idPerfil, Model model) {
		logger.info("-------DAR LIKE-------");
		System.out.println("ID MI PERFIL -- "+ idPerfil);
		System.out.println("ID PERFIL LIKE -- "+ idOtroPerfil);
		perfilService.addLike(idPerfil, idOtroPerfil);
		return new ModelAndView("redirect:/listado/"+idPerfil);
		
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
	  public ModelAndView altaPerfil(@ModelAttribute("perfil") Perfil perfil, ModelMap model) { 
		  logger.info("-- Registrando");    
	      perfil=perfilService.addPerfil(perfil);
	      model.addAttribute(perfil);
	      return new ModelAndView("redirect:/listado/"+perfil.getIdPerfil());
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
	      return "index.html";
	  }
	  @RequestMapping(value = "/registrar", method = RequestMethod.GET)
	  public String registrar(@ModelAttribute("perfil") Perfil perfil) {
		  logger.info("-- en Registrar");
	      return "registrar.html";
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
	  public ModelAndView loggin(@RequestParam("idPerfil") Integer idPerfil, Perfil perfil, ModelMap model) {
		  logger.info("--- Buscando usuario por id ");
		  
			  
			  model.addAttribute(idPerfil);
			  System.out.println("-----------ID--------");
			  perfil =perfilService.getPefil(idPerfil);
			  if(perfil!=null) {
				  model.addAttribute("perfil",perfil);
				  System.out.println(perfil);
				  logger.info("------------ Usuario encontrado ");
				  return new ModelAndView("redirect:/listado/"+perfil.getIdPerfil());
			  }
			  else {
				  logger.warn("--------- Usuario no encontrado ");
			  	return new ModelAndView("redirect:/registrar");
			  }
		  
	  }
	  
	  /**
	   * Metodo lista los Perfiles.
	   * Method list all Perfil.
	   * 
	   * @param idPerfil. Metodo recibe un parametro de tipo Integer.
	   * 				  Method get param type Integer.
	   * @param model. Metodo recibe un parametro de tipo ModelMap.
	   * 			   Method get param type ModelMap.
	   * @return listado.html. Metodo retorna un objeto de tipo String.
	   * 					   Method return String object type.
	   */
	  @RequestMapping(value = "/listado/{id}", method = RequestMethod.GET)
	  //public String listar(@ModelAttribute("idPerfil") int idPerfil, ModelMap model) {
		  public String listar(@PathVariable("id") int idPerfil, ModelMap model) {
		  
		  logger.info("-- en Listado Perfil");
		  logger.info("-- idPerfil: "+idPerfil);
		  logger.info("------ p: ");
		  //Perfil p = (Perfil) model.get("perfil");
		  
	      List<Perfil> listPerfil = perfilService.listarPerfil(idPerfil);
	      model.addAttribute("idPerfil", idPerfil);
	      model.addAttribute("listPerfil",listPerfil);
	      System.out.println("------------------"+listPerfil);
	      return "listado";
	      
	  }
	 
	  
	  /**
	   * Metodo genera perfiles falsos.
	   * Method generate fake users for app
	   * 
	   * @return inicio.html. Metodo retorna un objeto de tipo String.
	   * 					  Method return String object type.
	   */
	  @RequestMapping(value = "/aleatorio", method = RequestMethod.GET)
	  public String generarPerfilFalso() { 
		  logger.info("-- Registrando perfil falso");
	      System.out.println("-- metodo generarPerfilFalso");
	      
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

	  @RequestMapping(value = "/contacto/{idPerfil}", method = RequestMethod.GET)
	  public String listarContacto(@PathVariable("idPerfil") int idPerfil, Model model) {
		  logger.info("-- en Listado Contactos");	
	      System.out.println("---- metodo Listar Contacto");
	      
	      List<Perfil> listPerfil = perfilService.listarContacto(idPerfil);
	      System.out.println("LISTA PERFIL---------"+ listPerfil);
	      model.addAttribute("listPerfil",listPerfil);
	      
	      return "contacto.html";	      
	   }
	  
	 
	  
	  /**
	   * 
	   * @param model. Metodo recibe un parametro de tipo ModelMap.
	   * 			   Method get param type ModelMap.
	   * 
	   * @return listado.html. Metodo retorna un objeto de tipo String.
	   * 					   Method return String object type.
	   */
	  @RequestMapping(value = "/prueba", method = RequestMethod.GET)
	  public String prueba(Model model) {
		  logger.info("-- en Listado Perfil");	
	      List<Perfil> listPerfil = perfilService.listarPerfil(1);
	      model.addAttribute("listPerfil",listPerfil);
	      System.out.println(listPerfil);
	      return "listado";
	      
	  }
	  
	  /*
	   * @RequestMapping(value = "/addLike", method = RequestMethod.GET)
	public String addLike(@ModelAttribute("idPerfil") int idPerfil, @RequestParam("idOtroPerfil") int idOtroPerfil, ModelMap model) {
		logger.info("-------DAR LIKE-------");
		perfilService.addLike(idPerfil, idOtroPerfil);
		return "listado/"+idPerfil;
	}
	   */
	
}
