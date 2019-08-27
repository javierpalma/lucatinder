package com.luca.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.luca.spring.Services.PerfilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HomeController {
	@Autowired
	private PerfilService perfilService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	

}
