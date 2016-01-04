package pytania;



import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Przchowuje pojedyñcze pytanie quizu.
 * 
 * @author Twoja Stara
 */
@Entity
public class Pytanie {
    @Id
    @GeneratedValue
    @Column(name="idPytania")
    private int idPytania;        //przechowuje unikalne id pytania
    @Column(name="tresc")
    private String tresc;
    @Column(name="kategoria")    
    private int kategoria;
    
    @Column(name="wagaPytania")
    private double wagaPytania;//malowazne 0.5 wazne 1 bardzo wazne 1.5
    @OneToMany 
    @JoinColumn(name="Id_pytania")
    private List<Odpowiedz> listaOdpowiedzi;//Dla hibernate trzeba uzywac List a nie ArrayList    
    //@Column(name="zaznaczonaOdpowiedz")//1 dla tak 2 dla nie 0 jesli nie jest zaznaczona
    @OneToOne
    private Odpowiedz zaznaczonaOdpowiedz;
    
    public Pytanie(){    
        this.wagaPytania=1.0;
    }
    public Pytanie(int idPytania){
        this.idPytania=idPytania;
        this.wagaPytania=1.0;
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

    public double getWagaPytania() {
        return wagaPytania;
    }

    public void setWagaPytania(double wagaPytania) {
        this.wagaPytania = wagaPytania;
    }

    public int getKategoria() {
        return kategoria;
    }

    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }
    public void wypiszDostepneOdpowiedzi(){
        for(Odpowiedz o:listaOdpowiedzi){
            System.out.println(o.getTresc());
        }
    }
    public boolean wybierzOdp(int numerWybranejOdpowiedzi){
        int licznik=1;
        for(Odpowiedz o:listaOdpowiedzi){
            if(licznik==numerWybranejOdpowiedzi){
                this.setZaznaczonaOdpowiedz(o);
                return true;//udalo sie zaznaczyc odpowiedy
            }
            licznik++;
        }
        return false;//nie udalo sie wzbrac odpowiedyi
    }
    
    
    public Odpowiedz getZaznaczonaOdpowiedz() {
        return zaznaczonaOdpowiedz;
    }

    public void setZaznaczonaOdpowiedz(Odpowiedz zaznaczonaOdpowiedz) {
        this.zaznaczonaOdpowiedz = zaznaczonaOdpowiedz;
    }   
    
}

