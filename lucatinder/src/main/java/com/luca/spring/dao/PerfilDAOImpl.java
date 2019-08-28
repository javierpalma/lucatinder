package com.luca.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.luca.spring.model.Contacto;
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

	/**
	 * @author Javier Palma
	 * @name addLike
	 * @param(id usuario actal, id usuario al que doy like)
	 */
	public void addLike(int idPerfil, int idOtroPerfil) {
		Contacto c = new Contacto();
		c.setIdPeril(idPerfil);
		c.setIdOtroPerfil(idOtroPerfil);
		entityManager.merge(c);
		
	}

	/**
	 * @author Vladimir Juan
	 *
	 * @Return Este metodo nos permite seleccionar el perfil segun el id proporcionado.
	 * @Return This method get Perfil when given id of user
	 * 
	 */
	@Query("SELECT id, name, email FROM user WHERE id = ?")
	public Perfil getPefil(int id) {
		
		return entityManager.find(Perfil.class, id);
	}
	
	/**
	 * @author Javier Palma
	 * metodo recibe el id del usuario que está logueado, y devuelve un listado de los perfiles a los que ha dado "me gusta"
	 */
	@SuppressWarnings("null")
	public List<Perfil> listarContacto(int id){
		String hql ="SELECT c FROM Contacto c WHERE Contacto.idPerfil = "+id;
		System.out.println("---------------"+hql);
		System.out.println(entityManager.createQuery(hql));
		List<Contacto> listaContacto = entityManager.createQuery(hql).getResultList();
		List<Perfil> listaPerfil = null;
		for (int i = 0; i < listaContacto.size(); i++) {
			int idOtroPerfil = listaContacto.get(i).getIdOtroPerfil();
			listaPerfil.add(this.getPefil(idOtroPerfil));
		}
		return listaPerfil;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Perfil> listarPerfil(int idPerfil){
		String hql ="SELECT p FROM Perfil p WHERE Perfil.idPerfil != "+idPerfil+"LIMIT 20";
		System.out.println("---------------"+hql);
		System.out.println(entityManager.createQuery(hql));
		List<Perfil> listaPerfil = entityManager.createQuery(hql).getResultList();
		return listaPerfil;
	}
}
