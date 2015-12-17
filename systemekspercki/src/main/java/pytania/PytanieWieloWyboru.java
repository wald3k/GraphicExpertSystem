/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

/**
 * TYP 1
 * @author Freeman
 */
public class PytanieWieloWyboru extends Pytanie{
    private static final int typ_pytania =1;

    
    @Override
    public String toString(){
        String str = super.toString();
        
        str +=" typ: "+typ_pytania;
        return str;
    }
    
    
    
    /**
     * @return the typ_pytania
     */
    public static int getTyp_pytania() {
        return typ_pytania;
    }
}
