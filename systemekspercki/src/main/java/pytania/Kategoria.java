/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Klasa symbolizuj¹ca kategoriê w rankingu.
 * @author Waldemar Sobiecki
 */
@Entity
public class Kategoria {     
    /**
     * Numer id kategorii.
     */
    @Id
    @GeneratedValue
    private int id;
    /**
     * Nazwa kategorii.
     */
    private String nazwa; 
    
    /**
     * Zwraca nazwê kategorii.
     * @return nazwa jako String
     */
    public String getNazwa() {
        return nazwa;
    }
    /**
     * Ustawia nazwê kategorii.
     * @param nazwa jako String
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * Zwraca id kategorii.
     * @return id jako int.
     */
    public int getId() {
        return id;
    }

    /**
     * Ustawia id kategorii.
     * @param id jako String.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    

}
