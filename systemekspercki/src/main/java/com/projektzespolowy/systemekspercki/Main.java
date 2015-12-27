package com.projektzespolowy.systemekspercki;

//import pytania.Pytanie;
import program.Program;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
                
//                Pytanie pytanie = new Pytanie();
//                pytanie.setTresc("Tresc z netbeansa!");
//                Pytanie pytanie2 = new Pytanie();
//                pytanie2.setTresc("Tresc pytania 2");
//                Pytanie pytanie3 = new Pytanie();
//                pytanie3.setTresc("Tresc pytania 3");
                  Program program1 = new Program();
                  program1.setNazwa("3ds Max");
                  program1.setCena(199.59);
                  program1.setPktCena(5);
                  program1.setPktTrudnosc_nauki(9);
                
                entityManager.getTransaction().begin();
//                entityManager.persist(pytanie);                
//                entityManager.persist(pytanie2);                
//                entityManager.persist(pytanie3);  
                entityManager.persist(program1);
                entityManager.getTransaction().commit(); 
                
		entityManager.close();
		entityManagerFactory.close();
    }

}
