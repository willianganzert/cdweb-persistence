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
@Table(name="modelo_dispositivo")
public class ModeloDispositivo extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5072581408493829746L;
	
	@Id
    @SequenceGenerator(name="modelo_dispositivo_id_modelo_dispositivo_seq",
                       sequenceName="modelo_dispositivo_id_modelo_dispositivo_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="modelo_dispositivo_id_modelo_dispositivo_seq")	
    @Column(name = "id_modelo_dispositivo", updatable=false)
	private int idModeloDispositivo;

	public int getIdModeloDispositivo() {
		return idModeloDispositivo;
	}

	public void setIdModeloDispositivo(int idModeloDispositivo) {
		this.idModeloDispositivo = idModeloDispositivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome;

}
