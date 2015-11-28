package br.com.cdweb.persistence.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class FilaEventoExecutar  extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idFilaEventoExecutar;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horaInsercaoFila;

	@Temporal(TemporalType.TIMESTAMP)
	private Date horaExecucaoEvento;

	private int numeroTentativa = 0;
	
	public int getIdFilaEventoExecutar() {
		return idFilaEventoExecutar;
	}

	public void setIdFilaEventoExecutar(int idFilaEventoExecutar) {
		this.idFilaEventoExecutar = idFilaEventoExecutar;
	}

	public Date getHoraInsercaoFila() {
		return horaInsercaoFila;
	}

	public void setHoraInsercaoFila(Date horaInsercaoFila) {
		this.horaInsercaoFila = horaInsercaoFila;
	}

	public Date getHoraExecucaoEvento() {
		return horaExecucaoEvento;
	}

	public void setHoraExecucaoEvento(Date horaExecucaoEvento) {
		this.horaExecucaoEvento = horaExecucaoEvento;
	}

	public int getNumeroTentativa() {
		return numeroTentativa;
	}

	public void setNumeroTentativa(int numeroTentativa) {
		this.numeroTentativa = numeroTentativa;
	}

	

}
