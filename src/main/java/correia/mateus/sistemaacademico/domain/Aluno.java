package correia.mateus.sistemaacademico.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Aluno extends GenericDomain {
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	private Double rendimento;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Double getRendimento() {
		return rendimento;
	}
	
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
}
