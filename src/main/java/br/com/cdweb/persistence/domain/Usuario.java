package br.com.cdweb.persistence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario  extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2972313420767777806L;

	@Id
    @SequenceGenerator(name="usuario_id_usuario_seq",
    	sequenceName="usuario_id_usuario_seq", allocationSize=1)	
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="usuario_id_usuario_seq")	
    @Column(name = "id_usuario", updatable=false)
	private int idUsuario;

	private String login;

	private String senha;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
