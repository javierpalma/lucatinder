package com.luca.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luca.spring.model.Perfil;

@Repository
public class PerfilDAOImpl implements PerfilDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	public PerfilDAOImpl() {
		super();
	}

	
	/**
	 * @author José Miguel
	 * @name addPerfil
	 * @description Método para añadir perfil a la tabla perfil en la bdd
	 * @date 27/08/19
	 * @version 1.0
	 * @param perfil
	 */
	public void addPerfil(Perfil perfil) {
		entityManager.merge(perfil);
	}

	
	public void addLike(int idPerfil, int idOtroPerfil) {
		
	}


	@Query("SELECT id, name, email FROM user WHERE id = ?")
	public Perfil getPefil(int id) {
		
		return entityManager.find(Perfil.class, id);
	}
	

}
