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
@Table(name="modelo_acao")
public class ModeloAcao extends ComunEntidades implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6504996157538844876L;
	
	@Id
    @SequenceGenerator(name="modelo_acao_id_modelo_acao_seq", sequenceName="modelo_acao_id_modelo_acao_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="modelo_acao_id_modelo_acao_seq")
    @Column(name = "id_modelo_acao", updatable=false)
	private int idModeloAcao;

	private String nome;

	private String descricao;
	
	public int getIdModeloAcao() {
		return idModeloAcao;
	}

	public void setIdModeloAcao(int idModeloAcao) {
		this.idModeloAcao = idModeloAcao;
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

	

}