/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import java.util.ArrayList;

/**
 *
 * @author Freeman
 */
public class Quiz extends ArrayList<Pytanie>{
    
/**
 * znajduje w quizie pytanie o podanym id.
 * Je¿eli nie znajdzie pytania o podanym id, zwraca null.
 * @author Freeman
 * @param id - pytanie o takim id ma zostaæ zwrócone
 */
    public Pytanie findPytanieWithId(int id){
        for(Pytanie p: this){
            if(p.getId()==id) return p;
        }
        return null;
    }
    
    
/**
 * usuwa z quizu pytanie o podanym id.
 * jako wynik zwraca iloœc usuniêtych elementów.
 * @author Freeman
 * @param id - pytanie o takim id ma zostaæ zwrócone
 */
    public int removePytanieWithId(int id){
        int ilosc_usunietych=0;
        for(int i=0; i<this.size(); i++){
            if(this.get(i).getId()==id){
                this.remove(i);
                ilosc_usunietych++;
            }
        }
        return ilosc_usunietych;
    }
    
/**
 * Funkcja wypisuje wszystkie elementy listy.
 * @author Freeman
 */
    public void wypisz(){
        for (Pytanie pyt : this) {
            System.out.println(pyt.toString());
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
