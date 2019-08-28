package com.luca.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Javier Palma
 *
 */

@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_contacto")
	int idContacto;
	int idPerfil;
	@Column(name = "id_otro_perfil")
	int idOtroPerfil;
	
	public Contacto() {
		super();
	}

	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}

	public int getIdPeril() {
		return idPerfil;
	}

	public void setIdPeril(int idPeril) {
		this.idPerfil = idPeril;
	}

	public int getIdOtroPerfil() {
		return idOtroPerfil;
	}

	public void setIdOtroPerfil(int idOtroPerfil) {
		this.idOtroPerfil = idOtroPerfil;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", idPeril=" + idPerfil + ", idOtroPerfil=" + idOtroPerfil + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idContacto;
		result = prime * result + idOtroPerfil;
		result = prime * result + idPerfil;
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
		Contacto other = (Contacto) obj;
		if (idContacto != other.idContacto)
			return false;
		if (idOtroPerfil != other.idOtroPerfil)
			return false;
		if (idPerfil != other.idPerfil)
			return false;
		return true;
	}	

}
