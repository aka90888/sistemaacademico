package correia.mateus.sistemaacademico.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Usuario extends GenericDomain {
	@Column(nullable = false, length = 32)
	private String senha;
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
}
