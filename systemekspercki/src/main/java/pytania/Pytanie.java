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
 * @author Freeman, Waldemar Sobiecki
 */
@Entity
public class Pytanie {
    /**
     * Numer id pytania.
     */
    @Id
    @GeneratedValue
    @Column(name="idPytania")
    private int idPytania;        //przechowuje unikalne id pytania
    /**
     * Treœæ pytania.
     */
    @Column(name="tresc")
    private String tresc;
    /**
     * Kategoria pytania.
     */
    @Column(name="kategoria")    
    private int kategoria;
    /**
     * Waga pytania wyra¿ona liczb¹ zmiennoprzecinkow¹.
     */
    @Column(name="wagaPytania")
    private double wagaPytania;//malowazne 0.5 wazne 1 bardzo wazne 1.5
    /**
     * Lista dostêpnych odpowiedzi na pytanie.
     */
    @OneToMany 
    @JoinColumn(name="Id_pytania")
    private List<Odpowiedz> listaOdpowiedzi;//Dla hibernate trzeba uzywac List a nie ArrayList    
    //@Column(name="zaznaczonaOdpowiedz")//1 dla tak 2 dla nie 0 jesli nie jest zaznaczona
    /**
     * Udzielona odpowiedŸ na pytanie.
     */
    @OneToOne
    private Odpowiedz zaznaczonaOdpowiedz;
    /**
     * Konstruktor bezargumentowy. Domyœlna waga pytania to 1.0.
     */
    public Pytanie(){    
        this.wagaPytania=1.0;
    }
    /**
     * Konstruktor argumentowy.
     * @param idPytania okreœla numer id pytania.
     */
    public Pytanie(int idPytania){
        this.idPytania=idPytania;
        this.wagaPytania=1.0;
    }
    /**
     * Zwraca id pytania.
     * @return int
     */
    public int getIdPytania() {
        return idPytania;
    }
    /**
     * Ustawia id pytania.
     * @param idPytania jako int.
     */
    public void setIdPytania(int idPytania) {
        this.idPytania = idPytania;
    }
    /**
     * Zwraca treœæ pytania.
     * @return tresc jako String.
     */
    public String getTresc() {
        return tresc;
    }
    /**
     * Ustawia treœæ pytania.
     * @param tresc 
     */
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }   
    /**
     * Zwraca listê dostêpnych odpowiedzi.
     * @return listaOdpowiedzi jako ArrayList.
     */
    public List<Odpowiedz> getListaOdpowiedzi() {
        return listaOdpowiedzi;
    }
    /**
     * Przypisuje listê odpowiedzi.
     * @param listaOdpowiedzi 
     */
    public void setListaOdpowiedzi(List<Odpowiedz> listaOdpowiedzi) {
        this.listaOdpowiedzi = listaOdpowiedzi;
    }    
    /**
     * Zwraca wagê pytania.
     * @return 
     */
    public double getWagaPytania() {
        return wagaPytania;
    }
    /**
     * Ustawia wagê pytania.
     * @param wagaPytania jako double.
     */
    public void setWagaPytania(double wagaPytania) {
        this.wagaPytania = wagaPytania;
    }
    /**
     * Zwraca kategoriê pytania.
     * @return kategoria jako int.
     */
    public int getKategoria() {
        return kategoria;
    }
    /**
     * Ustawia kategoriê do której nale¿y pytanie.
     * @param kategoria jako int.
     */
    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }
    /**
     * Wypisuje na ekran dostêpne odpowiedzi.
     */
    public void wypiszDostepneOdpowiedzi(){
        for(Odpowiedz o:listaOdpowiedzi){
            System.out.println(o.getTresc());
        }
    }
    /**
     * Zaznacza odpowiedŸ w pytaniu.
     * @param numerWybranejOdpowiedzi
     * @return true jeœli uda³o siê zaznaczyæ odpowiedŸ. W pp. zwraca false.
     */
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
    
    /**
     * Pobiera zaznaczon¹ odpowiedŸ.
     * @return zaznaczonaOdpowiedz jako Odpowiedz.
     */
    public Odpowiedz getZaznaczonaOdpowiedz() {
        return zaznaczonaOdpowiedz;
    }
    /**
     * Ustawia zaznaczon¹ odpowiedŸ.
     * @param zaznaczonaOdpowiedz 
     */
    public void setZaznaczonaOdpowiedz(Odpowiedz zaznaczonaOdpowiedz) {
        this.zaznaczonaOdpowiedz = zaznaczonaOdpowiedz;
    }   
    
}

