/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

/**
 * Przechowuje id oraz wartoœc kryterium dla konkretnej odpowiedzi.
 * @param id - ID
 * @param value - przechowuje wartoœæ danego kryterium w konkretnej odpowiedzi.
 * @author Freeman
 */
class Kryterium {
    private int id;
    private double value;
    //private int value;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }
}
