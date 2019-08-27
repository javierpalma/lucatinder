package com.luca.spring.dao;

import com.luca.spring.model.Perfil;

public interface PerfilDAO {
	
	public void addPerfil(Perfil perfil);
	public void addLike(int idPerfil, int idOtroPerfil);

}
