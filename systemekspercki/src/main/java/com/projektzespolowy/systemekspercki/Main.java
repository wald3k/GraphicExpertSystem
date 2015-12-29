package com.projektzespolowy.systemekspercki;

//import pytania.Pytanie;

import java.util.ArrayList;
import java.util.List;
import program.Program;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pytania.Kategoria;
import pytania.Odpowiedz;
import pytania.Pytanie;
import pytania.Ranking;
import zarzadzanieEncjami.EManager;

public class Main {

    public static void main(String[] args) {
//        ManagerPytan managerPytan = new ManagerPytan();
//        ManagerProgramow managerProgramow = new ManagerProgramow();        
//        managerPytan.dodajPytanieDoBazy();
//        managerProgramow.dodajProgramDoBazy();
//        
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        
//        Kategoria kategoria = new Kategoria();
//        kategoria.setNazwa("Sculpt 3d");
//        Ranking ranking = new Ranking();
//        ranking.setKategoria(kategoria);
//        ranking.setPunkty(50);



//        Kategoria kategoria = new Kategoria();
//        Ranking ranking = new Ranking();
//        Program program = new Program();
//        kategoria.setNazwa("Sculpt3d");
//        ranking.setPunkty(10);
//        program.setNazwa("3ds Max");
//        program.setCena(1700);
//        program.setOpisProgramu("Jeden z najpopularniejszych programów. Bardzo szeroki zasób materia³ów efukacyjnych. \nBardzo dobra dokumentacja");
//        program.setLiczba_tutoriali(3570000);
//        program.setLiczba_ofert_pracy(744000);
//        ranking.setProgram(program);
//        ranking.setKategoria(kategoria);
//        
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(program);
//        entityManager.persist(kategoria);
//        entityManager.persist(ranking);
//        
//        entityManager.getTransaction().commit(); 
//
//        entityManager.close();
//        entityManagerFactory.close();

        EManager eManager= new EManager();
        eManager.dodajKategorieDoBazy(eManager.getEntityManager());
        eManager.dodajProgramyDoBazy(eManager.getEntityManager());
        eManager.dodajRankingDoBazy(eManager.getEntityManager());
        eManager.dodajPytaniaDoBazy(eManager.getEntityManager());        
        eManager.close();      
        
       
        
        
        
        //obliczenie wynikow
//        Wyniki wyniki = new Wyniki();
//        Wynik wynik1=new Wynik(1);
//        wyniki.dodajWynikDoListy(wynik1);
//        wyniki.pobierzOdpowiedzNaPytanie(1);
        
    }	
}
