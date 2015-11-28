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
@Table(name="area")
public class Area  extends ComunEntidades implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2383542454530985998L;

	@Id
    @SequenceGenerator(name="area_id_area_seq", sequenceName="area_id_area_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="area_id_area_seq")
    @Column(name = "id_acao_predeficao", updatable=false)
	private int idArea;

	private String nome;

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
