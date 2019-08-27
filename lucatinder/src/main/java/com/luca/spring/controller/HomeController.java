package com.luca.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luca.spring.Services.PerfilService;
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

}
