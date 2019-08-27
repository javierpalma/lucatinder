package com.luca.spring.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "id_contacto")
	int idPeril;
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
		return idPeril;
	}

	public void setIdPeril(int idPeril) {
		this.idPeril = idPeril;
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
		return "Contacto [idContacto=" + idContacto + ", idPeril=" + idPeril + ", idOtroPerfil=" + idOtroPerfil + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idContacto;
		result = prime * result + idOtroPerfil;
		result = prime * result + idPeril;
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
		if (idPeril != other.idPeril)
			return false;
		return true;
	}	

}
