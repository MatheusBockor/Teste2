package br.org.catolicasc.banco.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static final EntityManagerFactory EM =
			Persistence.createEntityManagerFactory("default");
	
	public static EntityManager getEntityManger() {
		return EM.createEntityManager();
	}
}
