/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyniki;

import pytania.Pytanie;

/**
 *
 * @author Freeman
 */
public class Wynik {
    private int idProgramu;
    private double wynik;
    public Wynik(int id){
        this.idProgramu=id;
        this.wynik=0.0;
    }

    public int getIdProgramu() {
        return idProgramu;
    }

    public void setIdProgramu(int idProgramu) {
        this.idProgramu = idProgramu;
    }

    public double getWynik() {
        return wynik;
    }

    public void setWynik(double wynik) {
        this.wynik = wynik;
    }
    
}