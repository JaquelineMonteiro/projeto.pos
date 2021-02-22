package hibernate.test;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import hibernate.HibernateUtil;
import model.Aluno;
import model.Disciplina;

public class AlunoHibernateTest {
	
	@Test
	public void testarConexao() {
		HibernateUtil.getEntityManager();
	}
	
	@Test
	public void testeGetAll() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		List<Aluno> alunos = daoGeneric.getAll(Aluno.class);		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);	
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Test
	public void testeGetById() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		Aluno aluno = daoGeneric.pesquisar(1L, Aluno.class);
		System.out.println(aluno);
	}
	
	@Test
	public void testeInsert(){
		DaoGeneric daoGeneric = new DaoGeneric();		
		Aluno aluno = new Aluno();		
		Disciplina disciplina = new Disciplina("Java", 9.9);
		aluno.setNome("teste");
		aluno.setEmail("teste.teste@gmail.com");	
		aluno.setCpf(102);
		aluno.setDisciplina(disciplina);
		daoGeneric.inserir(aluno);	
		daoGeneric.inserir(disciplina);
		System.out.println("Inserido com sucesso!");
	}
	
	@Test
	public void testeUpdate() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		Aluno aluno = daoGeneric.pesquisar(1L, Aluno.class);
		Disciplina disciplina = new Disciplina("Java", 6.9);
		aluno.setDisciplina(disciplina);
		aluno = daoGeneric.updateMerge(aluno);
		System.out.println("Atualizado com sucesso!");
	}

	@Test
	public void testeDelete() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		Aluno aluno = daoGeneric.pesquisar(2L, Aluno.class);
		daoGeneric.deleteById(aluno);
		System.out.println("Excluído com sucesso!");
	}


}
