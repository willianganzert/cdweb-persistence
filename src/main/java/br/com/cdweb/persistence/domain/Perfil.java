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
@Table(name="perfil")
public class Perfil  extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1131850648956130365L;

	@Id
    @SequenceGenerator(name="perfil_id_perfil_seq", sequenceName="perfil_id_perfil_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="perfil_id_perfil_seq")
    @Column(name = "id_perfil", updatable=false)
	private int idPerfil;

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	private String nome;

	private String descricao;

}
