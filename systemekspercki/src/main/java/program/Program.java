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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/**
 *
 * @author waldi
 */
@Entity
@Table(name = "Programy")
@SecondaryTable(name="Punkty",pkJoinColumns = @PrimaryKeyJoinColumn(name="ID_programu"))
//pkJoinColumns = @PrimaryKeyJoinColumn(name = "Name")
public class Program {
    @Id
    @GeneratedValue
    private int id;        //przechowuje unikalne id pytania
    private String nazwa;
    private double cena;
    private int liczba_tutoriali;
    private int liczba_ofert_pracy;
    //ponizsze oceny oznaczaja ilosc punktow przydzielonych przez ekspertów
    @Column(table="Punkty")
    private int pktCena;
    @Column(table="Punkty")
    private int pktLicencja;
    @Column(table="Punkty")
    private int pktTrudnosc_nauki;
    @Column(table="Punkty")
    private int pktWymagania_min;
    @Column(table="Punkty")
    private int pktWymagania_zalecane;
    @Column(table="Punkty")
    private int pktInterfejs;
    @Column(table="Punkty")
    private int pktTutoriale;
    @Column(table="Punkty")
    private int pktPraca;
    @Column(table="Punkty")
    private int pktSpolecznosc;
    @Column(table="Punkty")
    private int pktDokumentacja;

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

    public int getPktCena() {
        return pktCena;
    }

    public void setPktCena(int pktCena) {
        this.pktCena = pktCena;
    }

    public int getPktLicencja() {
        return pktLicencja;
    }

    public void setPktLicencja(int pktLicencja) {
        this.pktLicencja = pktLicencja;
    }

    public int getPktTrudnosc_nauki() {
        return pktTrudnosc_nauki;
    }

    public void setPktTrudnosc_nauki(int pktTrudnosc_nauki) {
        this.pktTrudnosc_nauki = pktTrudnosc_nauki;
    }

    public int getPktWymagania_min() {
        return pktWymagania_min;
    }

    public void setPktWymagania_min(int pktWymagania_min) {
        this.pktWymagania_min = pktWymagania_min;
    }

    public int getPktWymagania_zalecane() {
        return pktWymagania_zalecane;
    }

    public void setPktWymagania_zalecane(int pktWymagania_zalecane) {
        this.pktWymagania_zalecane = pktWymagania_zalecane;
    }

    public int getPktInterfejs() {
        return pktInterfejs;
    }

    public void setPktInterfejs(int pktInterfejs) {
        this.pktInterfejs = pktInterfejs;
    }

    public int getPktTutoriale() {
        return pktTutoriale;
    }

    public void setPktTutoriale(int pktTutoriale) {
        this.pktTutoriale = pktTutoriale;
    }

    public int getPktPraca() {
        return pktPraca;
    }

    public void setPktPraca(int pktPraca) {
        this.pktPraca = pktPraca;
    }

    public int getPktSpolecznosc() {
        return pktSpolecznosc;
    }

    public void setPktSpolecznosc(int pktSpolecznosc) {
        this.pktSpolecznosc = pktSpolecznosc;
    }

    public int getPktDokumentacja() {
        return pktDokumentacja;
    }

    public void setPktDokumentacja(int pktDokumentacja) {
        this.pktDokumentacja = pktDokumentacja;
    }

}
