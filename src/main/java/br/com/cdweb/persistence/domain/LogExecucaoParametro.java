package br.com.cdweb.persistence.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="log_execucao_parametro")
public class LogExecucaoParametro  extends ComunEntidades implements Serializable{

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
	private int idLogExecucaoParametro;

	private int idParametro;

	private String valorParametro;

	private String descricaoErro;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horaCriacaoLog;
	
	
	public int getIdLogExecucaoParametro() {
		return idLogExecucaoParametro;
	}

	public void setIdLogExecucaoParametro(int idLogExecucaoParametro) {
		this.idLogExecucaoParametro = idLogExecucaoParametro;
	}

	public int getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(int idParametro) {
		this.idParametro = idParametro;
	}

	public String getValorParametro() {
		return valorParametro;
	}

	public void setValorParametro(String valorParametro) {
		this.valorParametro = valorParametro;
	}

	public String getDescricaoErro() {
		return descricaoErro;
	}

	public void setDescricaoErro(String descricaoErro) {
		this.descricaoErro = descricaoErro;
	}

	public Date getHoraCriacaoLog() {
		return horaCriacaoLog;
	}

	public void setHoraCriacaoLog(Date horaCriacaoLog) {
		this.horaCriacaoLog = horaCriacaoLog;
	}

	

}
