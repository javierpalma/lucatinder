package com.luca.spring.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luca.spring.dao.PerfilDAO;

@Service
@Transactional
public class PerfilServiceImpl {

	@Autowired
	private PerfilDAO perfilDAO;
	
	
}
