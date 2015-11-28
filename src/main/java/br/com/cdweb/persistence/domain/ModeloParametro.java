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
@Table(name="modelo_parametro")
public class ModeloParametro extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5360076284629466609L;

	@Id
    @SequenceGenerator(name="modelo_parametro_id_modelo_parametro_seq",
    	sequenceName="modelo_parametro_id_modelo_parametro_seq", allocationSize=1)
	
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="modelo_parametro_id_modelo_parametro_seq")	
    @Column(name = "id_modelo_parametro", updatable=false)
	private int idModeloParametro;

	private String valorParametroAcao;

	public int getIdModeloParametro() {
		return idModeloParametro;
	}

	public void setIdModeloParametro(int idModeloParametro) {
		this.idModeloParametro = idModeloParametro;
	}

	public String getValorParametroAcao() {
		return valorParametroAcao;
	}

	public void setValorParametroAcao(String valorParametroAcao) {
		this.valorParametroAcao = valorParametroAcao;
	}

}
