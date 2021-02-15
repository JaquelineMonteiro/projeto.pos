package hibernate;

import org.junit.Test;

public class HibernateTest {
	
	@Test
	public void testarConexao() {
		HibernateUtil.getEntityManager();
	}

}
