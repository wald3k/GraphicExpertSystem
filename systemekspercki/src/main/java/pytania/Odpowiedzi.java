/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import java.util.ArrayList;
import javax.persistence.Embeddable;

/**
 *
 * @author Freeman
 */
@Embeddable
public class Odpowiedzi {
    private ArrayList<Odpowiedz> odpowiedzi;

    public Odpowiedzi(){
        this.odpowiedzi = new ArrayList<Odpowiedz>();
    }
    public ArrayList<Odpowiedz> getOdpowiedzi() {
        return odpowiedzi;
    }

    public void setOdpowiedzi(ArrayList<Odpowiedz> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }
    
    public void dodajOdpowiedz(Odpowiedz odp){
        odpowiedzi.add(odp);
    }
}
