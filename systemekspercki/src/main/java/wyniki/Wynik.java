/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyniki;

import java.awt.Point;
import pytania.Pytanie;
import pytania.PytaniePojedWyboru;
import pytania.PytanieSuwak;
import pytania.PytanieWieloWyboru;
import pytania.PytanieWykres;

/**
 *
 * @author Freeman
 */
public class Wynik {
    private int id_pytania;
    private int typ_pytania= -1;
    private int wybrana_odpowiedz= -1;
    private int[] wybrane_odpowiedzi= null;
    private Point wybrany_punkt= null;
    
    
    public Wynik(Object obj){
        if(obj instanceof PytaniePojedWyboru){
            id_pytania = ((Pytanie)obj).getId();
            typ_pytania =PytaniePojedWyboru.getTyp_pytania();
        }else if(obj instanceof PytanieWieloWyboru){
            id_pytania = ((Pytanie)obj).getId();
            typ_pytania =PytanieWieloWyboru.getTyp_pytania();
        }else if(obj instanceof PytanieSuwak){
            id_pytania = ((Pytanie)obj).getId();
            typ_pytania =PytanieSuwak.getTyp_pytania();
        }else if(obj instanceof PytanieWykres){
            id_pytania = ((Pytanie)obj).getId();
            typ_pytania =PytanieWykres.getTyp_pytania();
        }
    }
    
    @Override
    public String toString(){
        String str = new String();
        str +="id: "+id_pytania;
        
        if(typ_pytania != -1){
            str +=" typ: "+typ_pytania; 
        }
        if(wybrana_odpowiedz != -1){
            str +=" odp: "+wybrana_odpowiedz; 
        }
        if(wybrane_odpowiedzi != null){
            for(int i=0; i<wybrane_odpowiedzi.length; i++){
                str +=" odp["+i+"]: "+wybrane_odpowiedzi[i]; 
            }
        }
        if(wybrany_punkt != null){
            str +=" x:"+wybrany_punkt.getX(); 
            str +=" y:"+wybrany_punkt.getY();
        }
        
        return str;
    }
    

    /**
     * @return the id_pytania
     */
    public int getId_pytania() {
        return id_pytania;
    }

    /**
     * @return the typ_pytania
     */
    public int getTyp_pytania() {
        return typ_pytania;
    }

    /**
     * @return the wybrana_odpowiedz
     */
    public int getWybrana_odpowiedz() {
        return wybrana_odpowiedz;
    }

    /**
     * @return the wybrane_odpowiedzi
     */
    public int[] getWybrane_odpowiedzi() {
        return wybrane_odpowiedzi;
    }

    /**
     * @return the wybrany_punkt
     */
    public Point getWybrany_punkt() {
        return wybrany_punkt;
    }

//    /**
//     * @param id_pytania the id_pytania to set
//     */
//    public void setId_pytania(int id_pytania) {
//        this.id_pytania = id_pytania;
//    }
//
//    /**
//     * @param typ_pytania the typ_pytania to set
//     */
//    public void setTyp_pytania(int typ_pytania) {
//        this.typ_pytania = typ_pytania;
//    }

    /**
     * @param wybrana_odpowiedz the wybrana_odpowiedz to set
     */
    public void setWybrana_odpowiedz(int wybrana_odpowiedz) {
        this.wybrana_odpowiedz = wybrana_odpowiedz;
    }

    /**
     * @param wybrane_odpowiedzi the wybrane_odpowiedzi to set
     */
    public void setWybrane_odpowiedzi(int[] wybrane_odpowiedzi) {
        this.wybrane_odpowiedzi = wybrane_odpowiedzi;
    }

    /**
     * @param wybrany_punkt the wybrany_punkt to set
     */
    public void setWybrany_punkt(Point wybrany_punkt) {
        this.wybrany_punkt = wybrany_punkt;
    }
    
}


