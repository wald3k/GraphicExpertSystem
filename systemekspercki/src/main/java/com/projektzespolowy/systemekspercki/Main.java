package com.projektzespolowy.systemekspercki;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
                
                Pytanie pytanie = new Pytanie();
                pytanie.setTresc("Tresc z netbeansa!");
                Pytanie pytanie2 = new Pytanie();
                pytanie2.setTresc("Tresc pytania 2");
                Pytanie pytanie3 = new Pytanie();
                pytanie3.setTresc("Tresc pytania 3");
                
                entityManager.getTransaction().begin();
                entityManager.persist(pytanie);                
                entityManager.persist(pytanie2);                
                entityManager.persist(pytanie3);                
                entityManager.getTransaction().commit(); 
                
		entityManager.close();
		entityManagerFactory.close();
	}

}
