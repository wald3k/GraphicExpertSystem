/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyniki;

import pytania.Pytanie;

/**
 * Klasa przetrzymujaca wynik programu.
 * @author Freeman, Waldemar Sobiecki
 */
public class Wynik {
    /**
     * Id programu. Pozwala na identyfikacjê w bazie danych
     */
    private int idProgramu;
    /**
     * Przechowuje aktualny wynik programu.
     */
    private double wynik;
    /**
     * Konstruktor argumentowy.
     * @param id 
     */
    public Wynik(int id){
        this.idProgramu=id;
        this.wynik=0.0;
    }
    /**
     * Zwraca id programu.
     * @return 
     */
    public int getIdProgramu() {
        return idProgramu;
    }
    /**
     * Ustawia id programu.
     * @param idProgramu 
     */
    public void setIdProgramu(int idProgramu) {
        this.idProgramu = idProgramu;
    }
    /**
     * Zwraca wynik programu.
     * @return 
     */
    public double getWynik() {
        return wynik;
    }
    /**
     * Ustawia wynik programu.
     * @param wynik 
     */
    public void setWynik(double wynik) {
        this.wynik = wynik;
    }
    
}