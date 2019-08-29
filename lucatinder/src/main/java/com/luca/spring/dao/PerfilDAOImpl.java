package com.luca.spring.dao;

import java.util.ArrayList;
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
	
	public Perfil getPerfil(int id) {
		
		return entityManager.find(Perfil.class, id);
	}
	
	/**
	 *  metodo recibe el id del usuario que está logueado, y devuelve un listado de los perfiles a los que ha dado "me gusta"
	 * Method get param userID who is logged and return list type of Perfil when its set "Like".
	 * 
	 * @author Javier Palma
	 * @param id. Metodo recibe como parametro un id.
	 * 			  Method get para id
	 * @return listaPerfil. Metodo devuelve un listado de tipo ArrayList
	 * 						Method return list type ArrayList  
	 */
	@SuppressWarnings( "unchecked" )
	public List<Perfil> listarContacto(int id){
		String hql ="SELECT c FROM Contacto c WHERE c.idPerfil =:id";
        
        List<Contacto> listaContacto = entityManager.createQuery(hql).setParameter("id", id).getResultList();
		List<Perfil> listaPerfil = new ArrayList();		
		for (int i = 0; i < listaContacto.size(); i++) {
			int idOtroPerfil;
			idOtroPerfil=listaContacto.get(i).getIdOtroPerfil();
			System.out.println("ID OTRO PERFIL---"+idOtroPerfil);
			Perfil p = this.getPerfil(idOtroPerfil);
			System.out.println(p);
			listaPerfil.add(p);			
		}
		return listaPerfil;
	}


	/**
	 * @author Asiel
	 * @name listarPerfil
	 * @description El metodo obtiene 20 perfiles de la BD distintos al id del usuario
	 * @date 28/08/19
	 * @version 1.0
	 * @return Devuelve un List<Perfil> con los 20 perfiles
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Perfil> listarPerfil(int idPerfil){
		
		 Perfil p= this.getPerfil(idPerfil);
		 String hql ="SELECT p FROM Perfil p WHERE p.idPerfil !=:id AND p.generoInteres=:gi ORDER BY RAND()";
			List<Perfil> listaPerfil = entityManager.createQuery(hql).setParameter("id", idPerfil).setParameter("gi", p.getGeneroInteres()).setMaxResults(20).getResultList();
		System.out.println(listaPerfil);
		return listaPerfil;
	}
}
