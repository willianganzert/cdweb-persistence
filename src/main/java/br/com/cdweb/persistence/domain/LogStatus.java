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
@SequenceGenerator(name="log_status_id_log_status_seq", sequenceName="log_status_id_log_status_seq", allocationSize=1)
public class LogStatus extends ComunEntidades implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id    
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="log_status_id_log_status_seq")	
    @Column(name = "id_log_status", updatable=false)
	private int idLogStatus;
	
	private String nome;
	
	
	public LogStatus() {
	
	}
	

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
}
