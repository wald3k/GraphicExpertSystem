/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import java.util.ArrayList;
import javax.persistence.Embeddable;

/**
 * Klasa osadzana w bazie danych przechowuj�ca list� odpowiedzi.
 * @author Freeman, Waldemar Sobiecki
 */
@Embeddable
public class Odpowiedzi {
    /**
     * Lista odpowiedzi.
     */
    private ArrayList<Odpowiedz> odpowiedzi;
    /**
     * Konstruktor.
     */
    public Odpowiedzi(){
        this.odpowiedzi = new ArrayList<Odpowiedz>();
    }
    /**
     * Zwraca list� odpowiedzi.
     * @return odpowiedzi jako ArrayList
     */
    public ArrayList<Odpowiedz> getOdpowiedzi() {
        return odpowiedzi;
    }
    /**
     * Ustawia list� odpowiedzi.
     * @param odpowiedzi jako ArrayList.
     */
    public void setOdpowiedzi(ArrayList<Odpowiedz> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }
    /**
     * Dodaje odpowied� do listy odpowiedzi.
     * @param odp jako Odpowiedz.
     */
    public void dodajOdpowiedz(Odpowiedz odp){
        odpowiedzi.add(odp);
    }
}
