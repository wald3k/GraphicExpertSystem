package pytania;



import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Przchowuje pojedyñcze pytanie quizu.
 * 
 * @author Twoja Stara
 */
@Entity
public class Pytanie {
    //public static int licznik=0;
    @Id
    //@GeneratedValue
    @Column(name="idPytania")
    private int idPytania;        //przechowuje unikalne id pytania
    @Column(name="tresc")
    private String tresc;
    @Column(name="kategoria")
    private String kategoria;
    @Column(name="zaznaczonaOdpowiedz")//1 dla tak 2 dla nie 0 jesli nie jest zaznaczona
    private int zaznaczonaOdpowiedz;
    @Column(name="wagaPytania")
    private double wagaPytania;//malowazne 0.5 wazne 1 bardzo wazne 1.5
    @OneToMany
    @Column(name="listaOdpowiedzi")    
    private List<Odpowiedz> listaOdpowiedzi;//Dla hibernate trzeba uzywac List a nie ArrayList    
    
    public Pytanie(){
//        licznik++;
//        this.idPytania=licznik;
        
    }
    public Pytanie(int idPytania){
        this.idPytania=idPytania;
    }
    public int getIdPytania() {
        return idPytania;
    }

    public void setIdPytania(int idPytania) {
        this.idPytania = idPytania;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }   

    public List<Odpowiedz> getListaOdpowiedzi() {
        return listaOdpowiedzi;
    }

    public void setListaOdpowiedzi(List<Odpowiedz> listaOdpowiedzi) {
        this.listaOdpowiedzi = listaOdpowiedzi;
    }

    public int getZaznaczonaOdpowiedz() {
        return zaznaczonaOdpowiedz;
    }

    public void setZaznaczonaOdpowiedz(int zaznaczonaOdpowiedz) {
        this.zaznaczonaOdpowiedz = zaznaczonaOdpowiedz;
    }

    public double getWagaPytania() {
        return wagaPytania;
    }

    public void setWagaPytania(double wagaPytania) {
        this.wagaPytania = wagaPytania;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    
    
}

