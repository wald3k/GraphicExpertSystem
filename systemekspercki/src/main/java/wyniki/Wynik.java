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
    private int wynik;
    public Wynik(int id){
        this.idProgramu=id;
        this.wynik=0;
    }

    public int getIdProgramu() {
        return idProgramu;
    }

    public void setIdProgramu(int idProgramu) {
        this.idProgramu = idProgramu;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }
    
}