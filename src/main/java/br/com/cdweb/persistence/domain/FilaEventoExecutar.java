package br.com.cdweb.persistence.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.cdweb.mensagens.StatusMensagem;

@Entity
@Table(name="fila_evento_executar")
@SequenceGenerator(name="fila_evento_executar_id_fila_evento_executar_seq",
sequenceName="fila_evento_executar_id_fila_evento_executar_seq",
allocationSize=1)
public class FilaEventoExecutar  extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="dispositivo_id_dispositivo_seq")
	@Column(name="id_fila_evento_executar")
	private long idFilaEventoExecutar;
	
	@JoinColumn(name="id_modelo_acao")
	private ModeloAcao modelo_acao;
	
	@Column(length=1, columnDefinition="char(1)")
	@Enumerated(EnumType.STRING)
	private StatusMensagem status;
	
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	@Column(name="hora_insercao_fila", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaInsercaoFila = new Date();

	@Column(name="hora_execucao_evento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaExecucaoEvento;

	@Column(name="numero_tentativa")
	private int numeroTentativa = 0;

	
	public FilaEventoExecutar() {
	
	}
	
	
	public long getIdFilaEventoExecutar() {
		return idFilaEventoExecutar;
	}

	public void setIdFilaEventoExecutar(long idFilaEventoExecutar) {
		this.idFilaEventoExecutar = idFilaEventoExecutar;
	}

	public ModeloAcao getModelo_acao() {
		return modelo_acao;
	}
	public void setModelo_acao(ModeloAcao modelo_acao) {
		this.modelo_acao = modelo_acao;
	}
	
	public StatusMensagem getStatus() {
		return status;
	}


	public void setStatus(StatusMensagem status) {
		this.status = status;
	}


	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
