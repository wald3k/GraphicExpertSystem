/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

/**
 * TYP 2
 * @author Freeman
 */
public class PytanieSuwak extends Pytanie {
    private static final int typ_pytania =2;

    /**
     * @return the typ_pytania
     */
    public static int getTyp_pytania() {
        return typ_pytania;
    }
    private double przedzial_min=0.0;
    private double przedzial_max=0.0;

    
    
    @Override
    public String toString(){
        String str = super.toString();
        
        str +=" typ: "+typ_pytania;
        str +=" przedz_min: "+przedzial_min;
        str +=" przedz_max: "+przedzial_max;
        
        return str;
    }
    
    
    
    
    /**
     * @return the przedzial_min
     */
    public double getPrzedzial_min() {
        return przedzial_min;
    }

    /**
     * @param przedzial_min the przedzial_min to set
     */
    public void setPrzedzial_min(double przedzial_min) {
        this.przedzial_min = przedzial_min;
    }

    /**
     * @return the przedzial_max
     */
    public double getPrzedzial_max() {
        return przedzial_max;
    }

    /**
     * @param przedzial_max the przedzial_max to set
     */
    public void setPrzedzial_max(double przedzial_max) {
        this.przedzial_max = przedzial_max;
    }
}
