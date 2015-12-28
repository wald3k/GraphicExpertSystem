/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import program.Program;

/**
 *
 * @author waldi
 */
@Entity
public class Ranking {  
    @Id
    @GeneratedValue    
    private int id;        //przechowuje unikalne id pytania
    @OneToOne
    private Kategoria kategoria;
    @OneToOne
    private Program program;
    private int punkty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    public int getPunkty() {
        return punkty;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    

    
}
