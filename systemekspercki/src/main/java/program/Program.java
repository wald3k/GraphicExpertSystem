/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import javax.persistence.Column;
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
    private String systemy;
    private int min_ram;
    private int zal_ram;
    private int hdd;
    private int liczba_tutoriali;
    private int liczba_ofert_pracy;
    @Column( length = 100000 )
    private String opisProgramu;
    private String link;
    

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSystemy() {
        return systemy;
    }

    public void setSystemy(String systemy) {
        this.systemy = systemy;
    }

    public int getMin_ram() {
        return min_ram;
    }

    public void setMin_ram(int min_ram) {
        this.min_ram = min_ram;
    }

    public int getZal_ram() {
        return zal_ram;
    }

    public void setZal_ram(int zal_ram) {
        this.zal_ram = zal_ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
    

}
