package com.luca.spring.dao;

import java.util.List;

import com.luca.spring.model.Perfil;



/**
 * 
 * @author Javier Palma
 * 
 * Esta Interface sera imlementacion de PerfilDAOImpl
 * 
 * This Interface will be implement by PerfilDAOImpl
 *
 */

public interface PerfilDAO {
	
	public Perfil addPerfil(Perfil perfil);
	public void addLike(int idPerfil, int idOtroPerfil);
	public Perfil getPerfil(int id);
	public List<Perfil> listarContacto(int id);
	public List<Perfil> listarPerfil(int id);
}
