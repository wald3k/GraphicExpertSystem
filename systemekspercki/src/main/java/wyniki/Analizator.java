/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. AnalLizator.
 */
package wyniki;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import program.Program;
import pytania.Kategoria;
import pytania.Odpowiedz;
import pytania.Pytanie;
import pytania.Ranking;

/**
 * Klasa odpowiedzialna za analizowanie udzielanych odpowiedzi oraz liczenie
 * punktacji.
 *
 * @author Freeman
 */
public class Analizator {

    /**
     * Lista wyników.
     */
    private List<Wynik> listaWynikow;
    /**
     * EntityManagerFactory potrzebne do stworzenai entityManager'a.
     */
    private EntityManagerFactory entityManagerFactory;
    /**
     * EntityManager.
     */
    private EntityManager entityManager;

    /**
     * Konstruktor bezargumentowy.
     */
    public Analizator() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        this.entityManager = entityManagerFactory.createEntityManager();
        this.listaWynikow = new ArrayList<Wynik>();
    }

    /**
     * Zamyka entityManagera i entityManagerFactory.
     */
    public void close() {
        this.entityManager.close();
        this.entityManagerFactory.close();
    }

    /**
     * Dodaje do listy wyników programy.
     */
    public void wczytajProgramyDoListyWynikow() {
        TypedQuery<Program> query = entityManager.createQuery("SELECT p FROM Program p", Program.class);
        for (Program p : query.getResultList()) {
            this.listaWynikow.add(new Wynik(p.getId()));
        }
        System.out.println("Wypisuje id programow bedacych na liscie:");
        for (Wynik w : this.listaWynikow) {
            System.out.println(w.getIdProgramu());
        }

    }

    /**
     * Liczy wyniki dla wskazanego pytania.
     *
     * @param x jako int, numer pytania.
     */
    public void policzWynikiDlaXPytania(int x) {
        reset();
        //oblicza wynik i dodaje do sumy poprzednich wynikow.
        System.out.println("Wyniki przed policzeniem dla " + x + " pytania");
        for (Wynik w : this.listaWynikow) {
            System.out.println("Wynik dla programu " + w.getIdProgramu() + " to:\t" + w.getWynik());
        }
        TypedQuery<Ranking> queryKat = entityManager.createQuery("SELECT r FROM Ranking r where r.kategoria=:numer", Ranking.class);
        queryKat.setParameter("numer", this.entityManager.find(Kategoria.class, x));
        int licznik = 0;
        for (Ranking r : queryKat.getResultList()) {

            Wynik tempWynik = this.listaWynikow.get(licznik);

            Pytanie tempPytanie = this.entityManager.find(Pytanie.class, x);
            //Odpowiedz tempOdp = this.entityManager.find(Odpowiedz.class, x); 

            double starePunkty = tempWynik.getWynik();
            double wagaPytania = tempPytanie.getWagaPytania();
            double mnoznik = tempPytanie.getZaznaczonaOdpowiedz().getMnoznik();
            double punktyRankingowe = r.getPunkty();
            tempWynik.setWynik(starePunkty + wagaPytania * mnoznik * punktyRankingowe);
            licznik++;
        }
        System.out.println("Nowe wyniki to:");
        for (Wynik w : this.listaWynikow) {
            System.out.println("Wynik dla programu " + w.getIdProgramu() + " to:\t" + w.getWynik());
        }
    }

    /**
     * Podlicza wynik uwzglêdniaj¹c x-te pytanie.
     *
     * @param x jako int numer pytania
     * @return
     */
    public String policzWynikiDlaXPytaniaStr(int x) {
        reset();
        String str = "";
        //oblicza wynik i dodaje do sumy poprzednich wynikow.
        System.out.println("Wyniki przed policzeniem dla " + x + " pytania");
        for (Wynik w : this.listaWynikow) {
            System.out.println("Wynik dla programu " + w.getIdProgramu() + " to:\t" + w.getWynik());
        }
        TypedQuery<Ranking> queryKat = entityManager.createQuery("SELECT r FROM Ranking r where r.kategoria=:numer", Ranking.class);
        queryKat.setParameter("numer", this.entityManager.find(Kategoria.class, x));
        int licznik = 0;
        for (Ranking r : queryKat.getResultList()) {

            Wynik tempWynik = this.listaWynikow.get(licznik);

            Pytanie tempPytanie = this.entityManager.find(Pytanie.class, x);
            //Odpowiedz tempOdp = this.entityManager.find(Odpowiedz.class, x); 

            double starePunkty = tempWynik.getWynik();
            double wagaPytania = tempPytanie.getWagaPytania();
            double mnoznik = tempPytanie.getZaznaczonaOdpowiedz().getMnoznik();
            double punktyRankingowe = r.getPunkty();
            tempWynik.setWynik(starePunkty + wagaPytania * mnoznik * punktyRankingowe);
            licznik++;
        }
        System.out.println("Nowe wyniki to:");
        for (Wynik w : this.listaWynikow) {      
            Program p = entityManager.find(Program.class, w.getIdProgramu());            
            str += "Wynik dla  " + p.getNazwa() + " to:\t" + w.getWynik() + "\n";            
        }

        return str;
    }

    /**
     * Resetuje entityManager i entityManagerFactory oraz wypycha wprowadzone
     * zmiany do bazy danych.
     */
    public void reset() {
        this.entityManager.close();
        this.entityManagerFactory.close();
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        this.entityManager = entityManagerFactory.createEntityManager();
    }
}
