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
import wyniki.Analizator;
import zarzadzanieEncjami.EManager;

public class Main {

    public static void main(String[] args) {
       

        EManager eManager= new EManager();
        eManager.dodajKategorieDoBazy(eManager.getEntityManager());
        eManager.dodajProgramyDoBazy(eManager.getEntityManager());
        eManager.dodajPytaniaDoBazy(eManager.getEntityManager()); 
        eManager.dodajRankingDoBazy(eManager.getEntityManager());              
        eManager.close();      
        
//       
//        Analizator analizator = new Analizator();
//        analizator.wczytajProgramyDoListyWynikow();
//        analizator.policzWynikiDlaXPytania(1);
//        analizator.policzWynikiDlaXPytania(2);
//        analizator.policzWynikiDlaXPytania(3);
//        analizator.close();
        
    }
}
