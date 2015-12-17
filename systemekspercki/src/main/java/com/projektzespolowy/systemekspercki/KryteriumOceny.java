/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projektzespolowy.systemekspercki;

/**
 *Przechowuje pojedyncze kryterium oceny programu.
 * @param id
 * @param nazwa - nazwa kryterium
 * @param opis - s³owny opis kryterium
 * @param waga - waga, priorytet, wa¿noœæ kryterium
 * @author Freeman
 */
public class KryteriumOceny {
    private static int licznik=0;
    private int id;
    private String nazwa=null;
    private String opis=null;
    private double waga=0.0;
    
    
    public KryteriumOceny(){
        id=licznik;
        licznik++;
    }
    
    
    @Override
    public String toString(){
        String str = new String();
        str +="id: "+id;
        
        if(nazwa != null){
            str +=" nazwa: "+nazwa; 
        }
        if(opis != null){
            str +=" opis: "+opis.subSequence(0, 10)+"..."; 
        }
        str +=" waga: "+waga; 
        
        return str;
    }
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

//    /**
//     * @param id the id to set
//     */
//    public void setId(int id) {
//        this.id = id;
//    }

    /**
     * @return the nazwa
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @param nazwa the nazwa to set
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * @return the opis
     */
    public String getOpis() {
        return opis;
    }

    /**
     * @param opis the opis to set
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }

    /**
     * @return the waga
     */
    public double getWaga() {
        return waga;
    }

    /**
     * @param waga the waga to set
     */
    public void setWaga(double waga) {
        this.waga = waga;
    }
    
}
