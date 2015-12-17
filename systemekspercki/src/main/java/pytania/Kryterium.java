/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

/**
 * Przechowuje id KryteriumOceny oraz jego wartoœæ dla konkretnej odpowiedzi.
 * @param id - ID
 * @param value - przechowuje wartoœæ danego kryterium w konkretnej odpowiedzi.
 * @author Freeman
 */
class Kryterium {
    private int id;
    private double value=0.0;
    //private int value;

    @Override
    public String toString(){
        String str = new String();
        str +="id: "+id;
        str +=" value: "+value; 
        
        return str;
    }
    
    
    
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
