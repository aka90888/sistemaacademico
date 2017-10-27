package correia.mateus.sistemaacademico.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Disciplina extends GenericDomain {
	@Column(nullable = false)
	private String codigoDisciplina;
	private String nome;
	@OneToOne
	private Turma turma;
	//@OneToOne
	//private Prova prova;
	
	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}
	
	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	/*
	public Prova getProva() {
		return prova;
	}
	
	public void setProva(Prova prova) {
		this.prova = prova;
	}	
	*/
}
