package com.luca.spring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Jose Muguel
 *
 */
@Entity
@Table(name = "PERFIL")
public class Perfil implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID_PERFIL")
	private Integer idPerfil;
	String nombre;
	String genero;
	Integer edad;
	String descripcion;
	String poblacion;
	Set<Contacto> setContacto;
	
	public Perfil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perfil(Integer idPerfil, String nombre, String genero, Integer edad, String descripcion, String poblacion,
			Set<Contacto> setContacto) {
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.descripcion = descripcion;
		this.poblacion = poblacion;
		this.setContacto = setContacto;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Set<Contacto> getSetContacto() {
		return setContacto;
	}

	public void setSetContacto(Set<Contacto> setContacto) {
		this.setContacto = setContacto;
	}

	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad
				+ ", descripcion=" + descripcion + ", poblacion=" + poblacion + ", setContacto=" + setContacto + "]";
	}
	
	
	
}
