package com.projektzespolowy.systemekspercki;

//import pytania.Pytanie;

import java.util.ArrayList;
import java.util.List;
import program.Program;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import pytania.Kategoria;
import pytania.Odpowiedz;
import pytania.Pytanie;
import pytania.Quiz;
import pytania.Ranking;
import wyniki.Analizator;
import zarzadzanieEncjami.EManager;

public class Main {

    public static void main(String[] args) {
       
//
//        EManager eManager= new EManager();
//        eManager.dodajKategorieDoBazy(eManager.getEntityManager());
//        eManager.dodajProgramyDoBazy(eManager.getEntityManager());
//        eManager.dodajPytaniaDoBazy(eManager.getEntityManager()); 
//        eManager.dodajRankingDoBazy(eManager.getEntityManager());              
//        eManager.close();      
        
//       
//        Analizator analizator = new Analizator();
//        analizator.wczytajProgramyDoListyWynikow();
//        analizator.policzWynikiDlaXPytania(1);
//        analizator.policzWynikiDlaXPytania(2);
//        analizator.policzWynikiDlaXPytania(3);
//        analizator.close();
        //Quiz quiz = new Quiz();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //TypedQuery<Program> programQuery = entityManager.createQuery("SELECT p FROM Program p where p.id=:numer", Program.class);
        Program p = entityManager.find(Program.class, 2);
        System.out.println(p.getCena());
    }
}
