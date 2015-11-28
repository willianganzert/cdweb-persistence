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
@Table(name="parametro")
public class Parametro  extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3225155586814133708L;

	@Id
    @SequenceGenerator(name="modelo_predefinicao_id_modelo_predefinicao_seq",
    	sequenceName="modelo_predefinicao_id_modelo_predefinicao_seq", allocationSize=1)	
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="modelo_predefinicao_id_modelo_predefinicao_seq")	
    @Column(name = "id_modelo_parametro", updatable=false)
	private int idParametro;

	public int getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(int idParametro) {
		this.idParametro = idParametro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTipoValor() {
		return tipoValor;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	public String getTipoValor2() {
		return tipoValor2;
	}

	public void setTipoValor2(String tipoValor2) {
		this.tipoValor2 = tipoValor2;
	}

	private String nome;

	/**
	 * TIPO 1 = TEXTO
	 * TIPO 2 = NUMERICO
	 * TIPO 3 = INTERVALO
	 * 
	 */
	private int tipo;

	private String tipoValor;

	private String tipoValor2;

}
