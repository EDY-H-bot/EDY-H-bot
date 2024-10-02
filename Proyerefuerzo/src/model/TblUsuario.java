package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuario database table.
 * 
 */
@Entity
@Table(name="tbl_usuario")
@NamedQuery(name="TblUsuario.findAll", query="SELECT t FROM TblUsuario t")
public class TblUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private String claveusario;
	
    @Id
	private int idsuario;


	private String nousuario;


	public TblUsuario() {
	}


	public String getClaveusario() {
		return this.claveusario;
	}

	public void setClaveusario(String claveusario) {
		this.claveusario = claveusario;
	}

	public int getIdsuario() {
		return this.idsuario;
	}

	public void setIdsuario(int idsuario) {
		this.idsuario = idsuario;
	}


	public String getNousuario() {
		return this.nousuario;
	}

	public void setNousuario(String nousuario) {
		this.nousuario = nousuario;
	}


}