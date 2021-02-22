package hibernate.test;

import java.util.List;

import org.junit.Test;

import dao.DaoGeneric;
import hibernate.HibernateUtil;
import model.Usuario;

public class UsuarioHibernateTest {
	
	@Test
	public void testarConexao() {
		HibernateUtil.getEntityManager();
	}
	
	@Test
	public void testeGetAll() {
		DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
		List<Usuario> usuarios = daoGeneric.getAll(Usuario.class);		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);	
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Test
	public void testeGetById() {
		DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
		Usuario usuario = daoGeneric.pesquisar(2L, Usuario.class);
		System.out.println(usuario);
	}
	
	@Test
	public void testeInsert(){
		DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();		
		Usuario usuario = new Usuario();		
		usuario.setNome("teste");
		usuario.setLogin("TESTE");	
		usuario.setSenha("1234");
		daoGeneric.inserir(usuario);	
		System.out.println("Inserido com sucesso!");
	}
	
	@Test
	public void testeUpdate() {
		DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
		Usuario usuario = daoGeneric.pesquisar(2L, Usuario.class);
		usuario.setNome("JAQUE");
		usuario = daoGeneric.updateMerge(usuario);
		System.out.println("Atualizado com sucesso!");
	}

	@Test
	public void testeDelete() {
		DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
		Usuario usuario = daoGeneric.pesquisar(2L, Usuario.class);
		daoGeneric.deleteById(usuario);
		System.out.println("Excluído com sucesso!");
	}


}

