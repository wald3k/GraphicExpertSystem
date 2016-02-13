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
 * Klasa symbolizuje program w bazie danych.
 * @author Waldemar Sobiecki
 */
@Entity
public class Program {
    /**
     * Numer id programu.
     */
    @Id
    @GeneratedValue
    private int id;        //przechowuje unikalne id pytania
    /**
     * Nazwa programu.
     */
    private String nazwa;
    /**
     * Cena programu,
     */
    private double cena;
    /**
     * Systemy jakie obs�uguj� dany program.
     */
    private String systemy;
    /**
     * Minimalna ilo�� ramu potrzebna do uruchomienia programu.
     */
    private int min_ram;
    /**
     * Zalecana liczba ramu potrzebna do p�ynnego korzystania z programu.
     */
    private int zal_ram;
    /**
     * Wymagane miejsce na dysku.
     */
    private int hdd;
    /**
     * Liczba dost�pnych tutoriali do nauki programu.
     */
    private int liczba_tutoriali;
    /**
     * Liczba ofert pracy zawieraj�cych nazw� programu w og�oszeniu.
     */
    private int liczba_ofert_pracy;
    /**
     * Kr�tki opis programu.
     */
    @Column( length = 100000 )
    private String opisProgramu;
    /**
     * Link do strony producenta programu.
     */
    private String link;
    
    /**
     * Zwraca id programu.
     * @return id jako int.
     */
    public int getId() {
        return id;
    }
    /**
     * Ustawia id programu.
     * @param id jako int.
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Zwraca nazw� programu.
     * @return nazwa jako String.
     */
    public String getNazwa() {
        return nazwa;
    }
    /**
     * Ustawia nazw� programu.
     * @param nazwa jako String.
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    /**
     * Zwraca cen� programu.
     * @return cena jako double.
     */
    public double getCena() {
        return cena;
    }
    /**
     * Ustawia cen� za program.
     * @param cena jako double.
     */
    public void setCena(double cena) {
        this.cena = cena;
    }
    /**
     * Zwraca liczb� tutoriali.
     * @return liczba_tutoriali jako int.
     */
    public int getLiczba_tutoriali() {
        return liczba_tutoriali;
    }
    /**
     * Ustawia liczb� tutoriali.
     * @param liczba_tutoriali jako int.
     */
    public void setLiczba_tutoriali(int liczba_tutoriali) {
        this.liczba_tutoriali = liczba_tutoriali;
    }
    /**
     * Zwraca liczb� ofert pracy.
     * @return liczba_ofert_pracy jako int.
     */
    public int getLiczba_ofert_pracy() {
        return liczba_ofert_pracy;
    }
    /**
     * Ustawia liczb� ofert pracy.
     * @param liczba_ofert_pracy jako int.
     */
    public void setLiczba_ofert_pracy(int liczba_ofert_pracy) {
        this.liczba_ofert_pracy = liczba_ofert_pracy;
    }
    /**
     * Zwraca opis programu.
     * @return opisProgramu jako String.
     */
    public String getOpisProgramu() {
        return opisProgramu;
    }
    /**
     * Ustawia opis programu.
     * @param opisProgramu 
     */
    public void setOpisProgramu(String opisProgramu) {
        this.opisProgramu = opisProgramu;
    }
    /**
     * Pobiera link do strony producenta programu.
     * @return link jako String.
     */
    public String getLink() {
        return link;
    }
    /**
     * Ustawia link do strony producenta programu.
     * @param link 
     */
    public void setLink(String link) {
        this.link = link;
    }
    /**
     * Zwraca systemy obs�uguj�ce program.
     * @return systemy jako String.
     */
    public String getSystemy() {
        return systemy;
    }
    /**
     * Ustawia systemy obs�uguj�ce program.
     * @param systemy jako String.
     */
    public void setSystemy(String systemy) {
        this.systemy = systemy;
    }
    /**
     * Zwraca minimaln� ilo�� ramu
     * @return 
     */
    public int getMin_ram() {
        return min_ram;
    }
    /**
     * Ustawia minimaln� ilo�� ramu.
     * @param min_ram 
     */
    public void setMin_ram(int min_ram) {
        this.min_ram = min_ram;
    }
    /**
     * Zwraca zalecan� ilo�� ramu.
     * @return 
     */
    public int getZal_ram() {
        return zal_ram;
    }
    /**
     * Ustawia zalecan� ilo�� ramu.
     * @param zal_ram 
     */
    public void setZal_ram(int zal_ram) {
        this.zal_ram = zal_ram;
    }
    /**
     * Zwraca wymagane miejsce na dysku.
     * @return 
     */
    public int getHdd() {
        return hdd;
    }
    /**
     * Ustawia wymagane miejsce na dysku.
     * @param hdd 
     */
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
    

}
