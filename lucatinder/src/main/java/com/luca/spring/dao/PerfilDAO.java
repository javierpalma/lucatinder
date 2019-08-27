package com.luca.spring.dao;

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
	
	public void addPerfil(Perfil perfil);
	public void addLike(int idPerfil, int idOtroPerfil);
	public Perfil getPefil(int id);
}
