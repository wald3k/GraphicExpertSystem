/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import pytania.Ranking;

/**
 *
 * @author waldi
 */
@Entity
public class Program {

    @Id
    @GeneratedValue
    private int id;        //przechowuje unikalne id pytania
    private String nazwa;
    private double cena;
    private int liczba_tutoriali;
    private int liczba_ofert_pracy;
    private String opisProgramu;
    @OneToOne(mappedBy = "program")
    private Ranking ranking;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getLiczba_tutoriali() {
        return liczba_tutoriali;
    }

    public void setLiczba_tutoriali(int liczba_tutoriali) {
        this.liczba_tutoriali = liczba_tutoriali;
    }

    public int getLiczba_ofert_pracy() {
        return liczba_ofert_pracy;
    }

    public void setLiczba_ofert_pracy(int liczba_ofert_pracy) {
        this.liczba_ofert_pracy = liczba_ofert_pracy;
    }

    public String getOpisProgramu() {
        return opisProgramu;
    }

    public void setOpisProgramu(String opisProgramu) {
        this.opisProgramu = opisProgramu;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }
    

}
