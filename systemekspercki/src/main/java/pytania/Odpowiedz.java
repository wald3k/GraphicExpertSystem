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
 *
 * @author Freeman
 */
@Entity
public class Odpowiedz {
    @Id
    @GeneratedValue
    private int idOdpowiedzi;        //przechowuje unikalne id pytania
    private String tresc;
    private int idPytania;
    
    
    public Odpowiedz(int idPytania, String trescPytania){
        this.idPytania = idPytania;
        this.tresc = trescPytania;
    }

   

    public int getIdOdpowiedzi() {
        return idOdpowiedzi;
    }

    public void setIdOdpowiedzi(int idOdpowiedzi) {
        this.idOdpowiedzi = idOdpowiedzi;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public int getIdPytania() {
        return idPytania;
    }

    public void setIdPytania(int idPytania) {
        this.idPytania = idPytania;
    }

    
    
    
   
}