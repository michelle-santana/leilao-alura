package br.com.alura.leilao.dao;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.model.Usuario;
import br.com.alura.leilao.util.JPAUtil;

class UsuarioDaoTest {
	
	private UsuarioDao dao;
	
	EntityManager em = JPAUtil.getEntityManager();

	//Classe não funciona pois o entity está nulo.
//	@Test
//	void testeBuscarDeUsuarioPeloUsername() {
//		
//		this.dao = new UsuarioDao(); 
//		Usuario usuario = this.dao.buscarPorUsername("fulano");
//		Assert.assertNotNull(usuario);
//		
//				
//	}
	
	@Test
	void testeBuscarDeUsuarioPeloUsername() {
		
		this.dao = new UsuarioDao(em); 
		Usuario usuario = this.dao.buscarPorUsername("fulano");
		Assert.assertNotNull(usuario);
	

}
 }
