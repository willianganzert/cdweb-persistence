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
@Table(name="status_execucao")
@SequenceGenerator(name="status_execucao_id_status_execucao_seq", sequenceName="status_execucao_id_status_execucao_seq", allocationSize=1)
public class StatusExecucao extends ComunEntidades implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9033337457373404955L;
	
	@Id    	
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="status_execucao_id_status_execucao_seq")	
    @Column(name = "id_status_execucao", updatable=false)
	private int idStatusExecucao;

	private String nome;

	public int getIdStatusExecucao() {
		return idStatusExecucao;
	}

	public void setIdStatusExecucao(int idStatusExecucao) {
		this.idStatusExecucao = idStatusExecucao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
