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
@Table(name="perfil_acesso")
public class PerfilAcesso  extends ComunEntidades implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 544226908245284451L;
	
	@Id
    @SequenceGenerator(name="perfil_acesso_id_perfil_acesso_seq",
    	sequenceName="perfil_acesso_id_perfil_acesso_seq", allocationSize=1)	
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="perfil_acesso_id_perfil_acesso_seq")	
    @Column(name = "id_perfil_acesso", updatable=false)
	private int idPerfilAcesso;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtribuicao;
	
	public int getIdPerfilAcesso() {
		return idPerfilAcesso;
	}

	public void setIdPerfilAcesso(int idPerfilAcesso) {
		this.idPerfilAcesso = idPerfilAcesso;
	}

	
	public Date getDataAtribuicao() {
		return dataAtribuicao;
	}

	public void setDataAtribuicao(Date dataAtribuicao) {
		this.dataAtribuicao = dataAtribuicao;
	}


}
