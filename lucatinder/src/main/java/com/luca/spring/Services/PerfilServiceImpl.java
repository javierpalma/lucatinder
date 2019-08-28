package com.luca.spring.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luca.spring.Util.Utilidades;
import com.luca.spring.dao.PerfilDAO;
import com.luca.spring.model.Perfil;

/**
 * 
 * @author Vladimir Juan
 * 
 * Esta clase nos redirige a los metodos de perfilDAO
 * This class redirect to methods of PerfilDAO
 */

@Service
@Transactional
public class PerfilServiceImpl implements PerfilService {

	@Autowired
	private PerfilDAO perfilDAO;

	@Override
	public void addPerfil(Perfil perfil) {
		perfilDAO.addPerfil(perfil);
	}

	@Override
	public void addLike(int idPerfil, int idOtroPerfil) {
		perfilDAO.addLike(idPerfil, idOtroPerfil);
	}

	@Override
	public Perfil getPefil(int id) {
		return perfilDAO.getPefil(id);
	}
	
	@Override
	public void crearPerfilFalso() {
		for (int i = 0; i < 20; i++) {			
			perfilDAO.addPerfil(Utilidades.crearPerfilFalso()); //el metodo addPerfilFalso no esta creado en DAO
		}
	}

	@Override
	public List<Perfil> listarContacto(int id) {
		System.out.println("SERVICE LISTAR CONTACTO");
		return perfilDAO.listarContacto(id);
	}
	
	public List<Perfil> listarPerfil(int idPerfil){
		return perfilDAO.listarPerfil(idPerfil);
	}
	
}
