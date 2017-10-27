package correia.mateus.sistemaacademico.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Curso extends GenericDomain {
	@Column(nullable = false)
	private String codigoCurso;
	private String nome;
	private String descricao;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Disciplina disciplina;
	
	public String getCodigoCurso() {
		return codigoCurso;
	}
	
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}	
	
}
