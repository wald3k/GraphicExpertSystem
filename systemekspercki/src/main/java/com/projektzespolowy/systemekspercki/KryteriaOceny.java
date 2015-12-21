/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektzespolowy.systemekspercki;

import java.util.ArrayList;

/**
 *Klasa przechowuje zbiór glównych kryteriów oceny, na podstawie których oceniane s¹ programy.
 * @author Freeman
 */
public class KryteriaOceny extends ArrayList<KryteriumOceny>{
    
    public KryteriumOceny findKryteriumOcenyWithId(int id){
        for(KryteriumOceny ko: this){
            if(ko.getId()==id) return ko;
        }
        return null;
    }
    
//    kryteria           zdefiniiowane   quiz
//    dodatki                 5           10
//    cena                    10          10
//    interfejs_prostota      1           7
    
    
    
    /**
 * Funkcja wypisuje wszystkie elementy listy.
 * @author Freeman
 */
    public void wypisz(){
        for (KryteriumOceny k : this) {
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
            System.out.println("Z£E DANE!!! start >= end");
            return;
        }
        for(int i=start; i<end; i++){
            System.out.println(this.get(i).toString());
        }
    }
        
    
}
