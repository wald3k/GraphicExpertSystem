/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyniki;

import java.util.ArrayList;

/**
 *
 * @author Freeman
 */
public class Wyniki extends ArrayList<Wynik>{
    
/**
 * Funkcja wypisuje wszystkie elementy listy.
 * @author Freeman
 */
    public void wypisz(){
        for (Wynik aThi : this) {
            System.out.println(aThi.toString());
        }
    }
    
/**
 * Funkcja wypisuje elementy listy od start do end.
 * @author Freeman
     * @param start
     * @param end
 */
    public void wypisz(int start, int end){
        if (start>=end){
            System.out.println("Z£E DANE!!! start >= end");
            return;
        }
        for(int i=start; i<end; i++){
            System.out.println(this.get(i).toString());
        }
    }
    
}
