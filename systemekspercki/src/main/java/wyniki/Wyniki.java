/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyniki;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import pytania.Odpowiedz;
import pytania.Pytanie;
import javax.persistence.Entity;
import program.Program;

/**
 * Klasa przechowuj¹ca listê wyników dla poszczególnych programów.
 *
 * @author Freeman, Waldemar Sobiecki
 */
public class Wyniki {

    /**
     * Lista wyników.
     */
    private List<Wynik> listaWynikow;

    /**
     * Konstruktor bezargumentowy, Wgrywa do listy programów wszystkie kolejne
     * programy z bazy danych.
     */
    public Wyniki() {
        this.listaWynikow = new ArrayList<Wynik>();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        TypedQuery<Program> query = entityManager.createQuery("SELECT p FROM Program p", Program.class);
        for (Program p : query.getResultList()) {
            this.listaWynikow.add(new Wynik(p.getId()));
        }
        entityManager.close();
        entityManagerFactory.close();
        System.out.println("Wypisuje id programow bedacych na liscie:");
        for (Wynik w : this.listaWynikow) {
            System.out.println(w.getIdProgramu());
        }
    }
    /**
     * Zwraca wynik dla konkretnego programu.
     * @param idProgramu jako int, oznacza id programu, którego wynik chcemy pobraæ
     * @return 
     */
    public Wynik zwrocWynikDlaProgramu(int idProgramu) {
        for (Wynik temp : this.listaWynikow) {
            if (temp.getIdProgramu() == idProgramu) {
                return temp;
            }
        }
        System.out.println("Nie ma takiego programu w wynikach!");
        return null;
    }
    /**
     * Dodaje wynik do listy.
     * @param wynik jako Wynik
     */
    public void dodajWynikDoListy(Wynik wynik) {
        //listaWynikow.add(wynik);
    }

//    public void pobierzOdpowiedzNaPytanie(int idPytania) {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        TypedQuery<Pytanie> query = entityManager.createQuery("SELECT p FROM Pytanie p where p.idPytania=:numer", Pytanie.class);
//        //query.setParameter(1, idPytania);
//        query.setParameter("numer", idPytania);
//        
//        for (Pytanie p : query.getResultList()) {
//            int odpowiedz = (p.getZaznaczonaOdpowiedz());
//            if(odpowiedz == 0){
//                System.out.println("nie wybrano odpowiedzi");
//            }
//            else if(odpowiedz == 1){//TAK
//                Wynik w = this.zwrocWynikDlaProgramu(idPytania);
//                w.setIdProgramu(w.getWynik()+1*);
//            }
//            else if(odpowiedz == 2){//NIE
//                
//            }
//        }
//        
//        entityManager.close();
//        entityManagerFactory.close();
//    }
//    public void obliczWynikiDlaPytania(int idPytania) {
//        for (Wynik temp : this.listaWynikow) {
//           if(temp.getIdProgramu())
//        }
//    }
}
