/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Klasa reprezentuj¹ca odpowiedŸ na zadane pytanie.
 * @author Freeman, Waldemar Sobiecki
 */
@Entity
public class Odpowiedz {
    /**
     * numer id odpowiedzi.
     */
    @Id
    @GeneratedValue
    private int idOdpowiedzi;        //przechowuje unikalne id pytania
    /**
     * Treœæ odpowiedzi.
     */
    private String tresc;
    /**
     * Mno¿nik wykorzystywany do ustalania wagi odpowiedzi.
     */
    private double mnoznik;

    /**
     * Konstruktor domyœlny.
     */
    public Odpowiedz() {
    }

    /**
     * Konstruktor odpowiedzi. Przjmuje 2 argumenty.
     * @param trescPytania zawiera treœæ pytanai jako String.
     * @param mnoznik jako double.
     */
    public Odpowiedz(String trescPytania, double mnoznik) {

        this.tresc = trescPytania;
        this.mnoznik = mnoznik;
    }
    /**
     * Pobiera id odpowiedzi.
     * @return idOdpowiedzi jako int.
     */
    public int getIdOdpowiedzi() {
        return idOdpowiedzi;
    }
    /**
     * Ustawia id odpowiedzi.
     * @param idOdpowiedzi jako int.
     */
    public void setIdOdpowiedzi(int idOdpowiedzi) {
        this.idOdpowiedzi = idOdpowiedzi;
    }
    /**
     * Pobiera treœæ odpowiedzi.
     * @return tresc jako String.
     */
    public String getTresc() {
        return tresc;
    }
    /**
     * Ustala treœæ odpowiedzi.
     * @param tresc jako String.
     */
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
    /**
     * Pobiera mno¿nik odpowiedzi.
     * @return mnoznik jako double.
     */
    public double getMnoznik() {
        return mnoznik;
    }
    /**
     * Ustala mno¿nik odpowiedzi.
     * @param mnoznik jako double.
     */
    public void setMnoznik(double mnoznik) {
        this.mnoznik = mnoznik;
    }

    
}
