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
@Table(name="log_status")
public class LogStatus extends ComunEntidades implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @SequenceGenerator(name="log_execucao_parametro_id_log_execucao_parametro_seq",
                       sequenceName="log_execucao_parametro_id_log_execucao_parametro_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="log_execucao_parametro_id_log_execucao_parametro_seq")	
    @Column(name = "id_log_execucao_parametro", updatable=false)
	private int idLogStatus;

	public int getIdLogStatus() {
		return idLogStatus;
	}

	public void setIdLogStatus(int idLogStatus) {
		this.idLogStatus = idLogStatus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome;

}
