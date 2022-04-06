package br.org.catolicasc.banco.test;

import javax.persistence.EntityManager;

import br.org.catolicasc.banco.bean.Banco;
import br.org.catolicasc.banco.util.JpaUtil;

public class BancoSaveTest {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManger();
		
		Banco banco = new Banco();
		banco.setCliente("Matheus");
		banco.setNumero("13564");
		banco.setSaldo(80000.00);
		
		em.getTransaction().begin();
		em.persist(banco);
		em.getTransaction().commit();
		
	}
	
}
