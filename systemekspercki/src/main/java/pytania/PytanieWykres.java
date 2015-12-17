/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

/**
 * TYP3
 * @author Freeman
 */
public class PytanieWykres extends Pytanie{
    private static final int typ_pytania =3;

    /**
     * @return the typ_pytania
     */
    public static int getTyp_pytania() {
        return typ_pytania;
    }
    private double y_min;
    private double y_max;
    private double x_min;
    private double x_max;

    
    @Override
    public String toString(){
        String str = super.toString();
        
        str +=" typ: "+typ_pytania;
        str +=" y_min: "+y_min;
        str +=" y_max: "+y_max;
        str +=" x_min: "+x_min;
        str +=" x_max: "+x_max;
        
        return str;
    }
    
    
    
    
    
    
    /**
     * @return the y_min
     */
    public double getY_min() {
        return y_min;
    }

    /**
     * @param y_min the y_min to set
     */
    public void setY_min(double y_min) {
        this.y_min = y_min;
    }

    /**
     * @return the y_max
     */
    public double getY_max() {
        return y_max;
    }

    /**
     * @param y_max the y_max to set
     */
    public void setY_max(double y_max) {
        this.y_max = y_max;
    }

    /**
     * @return the x_min
     */
    public double getX_min() {
        return x_min;
    }

    /**
     * @param x_min the x_min to set
     */
    public void setX_min(double x_min) {
        this.x_min = x_min;
    }

    /**
     * @return the x_max
     */
    public double getX_max() {
        return x_max;
    }

    /**
     * @param x_max the x_max to set
     */
    public void setX_max(double x_max) {
        this.x_max = x_max;
    }
}
