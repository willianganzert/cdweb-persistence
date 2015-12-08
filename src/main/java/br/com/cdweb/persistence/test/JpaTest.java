package br.com.cdweb.persistence.test;

import java.util.List;

import br.com.cdweb.persistence.domain.Configuracoes;
import br.com.cdweb.persistence.domain.Usuario;
import br.com.cdweb.persistence.jpa.JpaAllEntities;

public class JpaTest {

	public static void main(String[] args) {
		setIP();
	}
	
	public static void setIP() {
//		EntityManagerFactory factory = Persistence
//				.createEntityManagerFactory("cdwebPersistenceUnit");
//		EntityManager manager = factory.createEntityManager();
		// EntityTransaction tx = manager.getTransaction();
		// tx.begin();
		Configuracoes configuration = new Configuracoes();
		configuration.setChave("IP_RASP");
		configuration.setValor("192.168.0.1");
		Usuario usuario =new Usuario();
		usuario.setLogin("mairalima");
		usuario.setSenha("mairalima");
		JpaAllEntities.insertOrUpdate(usuario);
		
		
		List<Configuracoes> configuracoes = JpaAllEntities.listAll(Configuracoes.class);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
		for (Configuracoes config : configuracoes) {
			System.out.println(configuracoes);
		}
		System.out.println(configuracoes.get(0));
//		try {
//			manager.getReference(Configuracoes.class, "IP_RASP");
//			manager.persist(configuration);
//
//		} catch (javax.persistence.EntityNotFoundException e) {
//			manager.persist(configuration);
//		}
	}

}