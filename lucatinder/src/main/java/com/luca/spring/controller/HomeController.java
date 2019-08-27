package com.luca.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.luca.spring.Services.PerfilService;
import com.luca.spring.model.Perfil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
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
	 * @param perfil
	 * @param model
	 * @return listado.html
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
	      return "listado.html";
	  }
	  
	  /**
	 * @author Jose Miguel
	 * @param perfil
	 * @param model
	 * @return inicio.html
	 * @date 27/08/19
	 * @version 1.0
	   */
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public String inicio(@ModelAttribute("perfil") Perfil perfil) {
		  logger.info("-- en Inicio");	

	      return "inicio.html";
	  }

}
