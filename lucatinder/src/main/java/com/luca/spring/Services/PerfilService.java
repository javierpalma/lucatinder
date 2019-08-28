package com.luca.spring.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luca.spring.model.Perfil;

@Service
public interface PerfilService{
	
	public void addPerfil(Perfil perfil);
	public void addLike(int idPerfil, int idOtroPerfil);
	public Perfil getPefil(int id);
	public void crearPerfilFalso();
	public List<Perfil> listarContacto(int id);
	public List<Perfil> listarPerfil(int idPerfil);
}
