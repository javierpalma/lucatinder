package com.luca.spring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jose Muguel
 * @name Perfil
 * @description Clase Perfil relacionada con la tabla perfil de la bdd
 * @date 27/08/19
 * @version 1.0
 */
@Entity
@Table(name = "PERFIL")
public class Perfil implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "ID_PERFIL")
	private Integer idPerfil;
	private String nombre;
	private String genero;
	private Integer edad;
	private String descripcion;
	private String poblacion;
	private String generoInteres;
	private int edadMinima;
	private int edadMaxima;

	
	public Perfil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Perfil(String nombre, String genero, Integer edad, String descripcion, String poblacion,
			String generoInteres, int edadMinima, int edadMaxima) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.descripcion = descripcion;
		this.poblacion = poblacion;
		this.generoInteres = generoInteres;
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
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


	public String getGeneroInteres() {
		return generoInteres;
	}


	public void setGeneroInteres(String generoInteres) {
		this.generoInteres = generoInteres;
	}


	public int getEdadMinima() {
		return edadMinima;
	}


	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}


	public int getEdadMaxima() {
		return edadMaxima;
	}


	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad
				+ ", descripcion=" + descripcion + ", poblacion=" + poblacion + ", generoInteres=" + generoInteres
				+ ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + edadMaxima;
		result = prime * result + edadMinima;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((generoInteres == null) ? 0 : generoInteres.hashCode());
		result = prime * result + ((idPerfil == null) ? 0 : idPerfil.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (edadMaxima != other.edadMaxima)
			return false;
		if (edadMinima != other.edadMinima)
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (generoInteres == null) {
			if (other.generoInteres != null)
				return false;
		} else if (!generoInteres.equals(other.generoInteres))
			return false;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (poblacion == null) {
			if (other.poblacion != null)
				return false;
		} else if (!poblacion.equals(other.poblacion))
			return false;
		return true;
	}
	
	
	
}
