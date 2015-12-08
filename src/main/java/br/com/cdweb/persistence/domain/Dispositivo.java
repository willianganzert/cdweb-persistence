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
@Table(name="dispositivo")
@SequenceGenerator(name="dispositivo_id_dispositivo_seq", sequenceName="dispositivo_id_dispositivo_seq", allocationSize=1)
public class Dispositivo extends ComunEntidades implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5313126163246103312L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="dispositivo_id_dispositivo_seq")	
    @Column(name = "id_dispositivo", updatable=false)
	private int idDispositivo;

	private String nome;
	
	public Dispositivo() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
