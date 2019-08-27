package com.luca.spring.Services;

import org.springframework.stereotype.Service;

import com.luca.spring.model.Perfil;

@Service
public interface PerfilService{
	
	public void addPerfil(Perfil perfil);
	public void addLike(int idPerfil, int idOtroPerfil);
	public Perfil getPefil(int id);
}
