package hibernate.test;


import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import hibernate.HibernateUtil;
import model.Aluno;
import model.Disciplina;

public class DisciplinaHibernateTest {
	
	@Test
	public void testarConexao() {
		HibernateUtil.getEntityManager();
	}
	
	@Test
	public void testeGetAll() {
		DaoGeneric<Disciplina> daoGeneric = new DaoGeneric<Disciplina>();
		List<Disciplina> disciplinas = daoGeneric.getAll(Disciplina.class);		
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina);	
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Test
	public void testeGetById() {
		DaoGeneric<Disciplina> daoGeneric = new DaoGeneric<Disciplina>();
		Disciplina disciplina = daoGeneric.pesquisar(4L, Disciplina.class);
		System.out.println(disciplina);
	}
	
	@Test
	public void testeInsert(){
		DaoGeneric daoGeneric = new DaoGeneric();		
		Disciplina disciplina = new Disciplina();
		disciplina.setNomeDisciplina("Java");
		disciplina.setNota(8.7);
		daoGeneric.inserir(disciplina);	
		System.out.println("Inserido com sucesso!");
	}
	
	@Test
	public void testeUpdate() {
		DaoGeneric<Disciplina> daoGeneric = new DaoGeneric<Disciplina>();
		Disciplina disciplina = daoGeneric.pesquisar(4L, Disciplina.class);
		disciplina.setNomeDisciplina("HTML");
		disciplina.setNota(7.5);
		disciplina = daoGeneric.updateMerge(disciplina);
		System.out.println("Atualizado com sucesso!");
	}

	@Test
	public void testeDelete() {
		DaoGeneric<Disciplina> daoGeneric = new DaoGeneric<Disciplina>();
		Disciplina disciplina = daoGeneric.pesquisar(3L, Disciplina.class);
		daoGeneric.deleteById(disciplina);
		System.out.println("Excluído com sucesso!");
	}


}


