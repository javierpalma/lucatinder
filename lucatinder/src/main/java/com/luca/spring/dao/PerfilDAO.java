package com.luca.spring.dao;

import com.luca.spring.model.Perfil;

/**
 * 
 * @author Javier Palma
 * 
 * Esta Interface sera imlementacion de PerfilDAOImpl
 *
 */

public interface PerfilDAO {
	
	public void addPerfil(Perfil perfil);
	public void addLike(int idPerfil, int idOtroPerfil);
	public Perfil getPefil(int id);
}
