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
@Table(name="usuario_perfil")
public class UsuarioPerfil  extends ComunEntidades implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4802938299145735748L;
	
	@Id
    @SequenceGenerator(name="usuario_perfil_id_usuario_perfil_seq",
    	sequenceName="usuario_perfil_id_usuario_perfil_seq", allocationSize=1)	
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="usuario_perfil_id_usuario_perfil_seq")	
    @Column(name = "id_usuario_perfil", updatable=false)
	private int idUsuarioPerfil;

	private int idUsuario;
	
	private int idPerfil;

	public int getIdUsuarioPerfil() {
		return idUsuarioPerfil;
	}

	public void setIdUsuarioPerfil(int idUsuarioPerfil) {
		this.idUsuarioPerfil = idUsuarioPerfil;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
}
