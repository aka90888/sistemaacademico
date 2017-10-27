package correia.mateus.sistemaacademico.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import correia.mateus.sistemaacademico.domain.Turma;

public class TurmaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Turma turma = new Turma();
		turma.setCodigoTurma("def456");
		turma.setSala("405");

		TurmaDAO turmaDAO = new TurmaDAO();
		turmaDAO.salvar(turma);
	}

	@Test
	@Ignore
	public void listar() {
		TurmaDAO turmaDAO = new TurmaDAO();
		List<Turma> resultado = turmaDAO.listar();

		for (Turma turma : resultado) {
			System.out.println(turma.getSala() + " - " + turma.getCodigoTurma());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		TurmaDAO turmaDAO = new TurmaDAO();
		Turma turma = turmaDAO.buscar(codigo);

		if (turma == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println(turma.getSala() + " - " + turma.getCodigoTurma());
		}
	}
	
	@Test
	public void excluir() {
		Long codigo = 1L;

		TurmaDAO turmaDAO = new TurmaDAO();
		Turma turma = turmaDAO.buscar(codigo);
		
		if (turma == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			turmaDAO.excluir(turma);
		}
	}

}