package hibernate;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import model.Aluno;

public class HibernateTest {
	
	@Test
	public void testarConexao() {
		HibernateUtil.getEntityManager();
	}
	
	@Test
	public void testeGetAll() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		List<Aluno> list = daoGeneric.getAll(Aluno.class);		
		for (Aluno aluno : list) {
			System.out.println(aluno);	
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Test
	public void testeGetById() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		Aluno aluno = daoGeneric.pesquisar(2L, Aluno.class);
		System.out.println(aluno);
	}
	
	@Test
	public void testeInsert(){
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();		
		Aluno aluno = new Aluno();		
		aluno.setNome("teste");
		aluno.setSobrenome("teste");
		aluno.setEmail("teste.teste@gmail.com");	
		aluno.setIdade(18);
		daoGeneric.inserir(aluno);	
		System.out.println("Inserido com sucesso!");
	}
	
	@Test
	public void testeUpdate() {
		DaoGeneric<Aluno> daoGeneric = new DaoGeneric<Aluno>();
		Aluno aluno = daoGeneric.pesquisar(2L, Aluno.class);
		aluno.setNome("Lorenny");
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
