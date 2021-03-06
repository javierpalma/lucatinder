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

	/**
	 * Metodo añade un objeto Perfil.
	 * Method add one object type Perfil.
	 */
	public Perfil addPerfil(Perfil perfil) {
		return perfilDAO.addPerfil(perfil);
	}

	/**
	 * Metodo añade un like a otro usuario y se añade a mi lista de likes.
	 * Method add like to other user and add new like in my list of likes.
	 */
	public void addLike(int idPerfil, int idOtroPerfil) {
		perfilDAO.addLike(idPerfil, idOtroPerfil);
	}

	/**
	 * Metodo devuelve un perfil cuando le pasamos un id.
	 * Method return user when set param  id.
	 */
	public Perfil getPefil(int id) {
		return perfilDAO.getPerfil(id);
	}
	
	/**
	 * Metodo crea perfiles falsos.
	 * Method create fake users.
	 */
	public void crearPerfilFalso() {
		for (int i = 0; i < 20; i++) {			
			perfilDAO.addPerfil(Utilidades.crearPerfilFalso()); //el metodo addPerfilFalso no esta creado en DAO
		}
	}

	/**
	 * Metodo retorna un listado de contactos.
	 * Method return list of Contactos.
	 */
	public List<Perfil> listarContacto(int id) {
		System.out.println("SERVICE LISTAR CONTACTO");
		return perfilDAO.listarContacto(id);
	}
	
	/**
	 * Metodo retorn aun listado de perfiles
	 * Method return list of users.
	 */
	public List<Perfil> listarPerfil(int idPerfil){
		return perfilDAO.listarPerfil(idPerfil);
	}
	
}
