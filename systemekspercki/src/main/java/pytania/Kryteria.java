/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import java.util.ArrayList;

/**
 * przechowuje list� warto�ci kryteri�w dla konkretnej odpowiedzi.
 * @author Freeman
 */
class Kryteria extends ArrayList<Kryterium>{
    
    
    
 /**
 * znajduje kryterium o podanym id.
 * Je�eli nie znajdzie kryterium o podanym id, zwraca null.
 * @author Freeman
 * @param id - pytanie o takim id ma zosta� zwr�cone
 */
    public Kryterium findKryteriumWithId(int id){
        for(Kryterium k: this){
            if(k.getId()==id) return k;
        }
        return null;
    }
    
    
/**
 * Funkcja wypisuje wszystkie elementy listy.
 * @author Freeman
 */
    public void wypisz(){
        for (Kryterium k : this) {
            System.out.println(k.toString());
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
            System.out.println("Z�E DANE!!! start >= end");
            return;
        }
        for(int i=start; i<end; i++){
            System.out.println(this.get(i).toString());
        }
    }
    
}
