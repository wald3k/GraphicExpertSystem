/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

/**
 *
 * @author Freeman
 */
public class Odpowiedz {
    private String tresc=null;
    private Kryteria kryteria=null;
    
    
    @Override
    public String toString(){
        String str = new String();
        str +="tresc: "+tresc.subSequence(0, 10)+"...";
        
        if(kryteria != null){
            str +=" ilosc kryterii: "+kryteria.size(); 
        }
        
        return str;
    }
    
    
    

    /**
     * @return the tresc
     */
    public String getTresc() {
        return tresc;
    }

    /**
     * @param tresc the tresc to set
     */
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    /**
     * @return the kryteria
     */
    public Kryteria getKryteria() {
        return kryteria;
    }

    /**
     * @param kryteria the kryteria to set
     */
    public void setKryteria(Kryteria kryteria) {
        this.kryteria = kryteria;
    }
    
    
}
