package pytania;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 * Przchowuje pojedy�cze pytanie quizu.
 * @param id - przechowuje unikalne id pytania
 * @param tresc - przecjowuje tre�� pytania
 * @param obrazek - opcjonalnie przechowuje adres obrazka do wy�wietlenia przy pytaniu
 * @param licznik - zmienan do ustalanai id;
 * @param odpowiedzi - przechowuje mozliwe odpowiedzi
 * @author Twoja Stara
 */
@Entity
public class Pytanie {
    @Id
    @GeneratedValue
    private long id;
    private String tresc;
    private String obrazek=null;
    private static long licznik=0;
    private Odpowiedzi odpowiedzi;
    
    public Pytanie(){
        id = licznik;
        licznik++;
    }
    
    public Pytanie(String tresc){
        id = licznik;
        licznik++;
        this.tresc=tresc;
    }

    
    
    
    
    
    public long getId() {
        return id;
    }

    //niewiem czy setId jest dobrym pomys�em, jako �e id powinno pozostawa� niezmienne
    public void setId(long id) {
        this.id = id;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }    
}

