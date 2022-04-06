package br.org.catolicasc.banco.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.org.catolicasc.banco.bean.Banco;
import br.org.catolicasc.banco.util.JpaUtil;


public class BancoListTest {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManger();
		
		Query query = em.createQuery(" select a from Banco a ",Banco.class);
		
		List<Banco> bancos = query.getResultList();
		for (Banco banco : bancos) {
			System.out.println("Nome:" + banco.getCliente() + " Saldo: " + banco.getSaldo());
		}
		
		
	}
	
}
