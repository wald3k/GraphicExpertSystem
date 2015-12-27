//package pytania;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//
///**
// * Przchowuje pojedyñcze pytanie quizu.
// * 
// * @author Twoja Stara
// */
//@Entity
//public class Pytanie {
//    @Id
//    @GeneratedValue
//    private int id;        //przechowuje unikalne id pytania
//    private String tresc=null;  //przecjowuje treœæ pytania
//    private String obrazek=null;    //opcjonalnie przechowuje adres obrazka do wyœwietlenia przy pytaniu
//    private static int licznik=0;   //zmienan do ustalanai id;
//    private boolean wagaPytania=false;  //czy wyœwietliæ pytanie o wagê pytania
//    private Odpowiedzi odpowiedzi=null; //przechowuje mozliwe odpowiedzi
//    
//    public Pytanie(){
//        id = licznik;
//        licznik++;
//    }
//    
//    public Pytanie(String tresc){
//        id = licznik;
//        licznik++;
//        this.tresc=tresc;
//    }
//
//    
//    
//    @Override
//    public String toString(){
//        String str = new String();
//        str +="id: "+id;
//        
//        if(tresc != null){
//            str +=" tresc: "+tresc.subSequence(0, 10)+"..."; 
//        }
//        if(obrazek != null){
//            str +=" img: "+obrazek.subSequence(0, 10)+"..."; 
//        }
//        if(odpowiedzi != null){
//           str +=" ilosc odp.: "+odpowiedzi.size();
//        }
//        //for(Odpowiedz o: this.odpowiedzi){
//        //    str +=" ; "+o.toString();
//        //}
//        
//        return str;
//    }
//    
//    
//    
//    
//    
//    
//    public int getId() {
//        return id;
//    }
//
//    //niewiem czy setId jest dobrym pomys³em, jako ¿e id powinno pozostawaæ niezmienne
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTresc() {
//        return tresc;
//    }
//
//    public void setTresc(String tresc) {
//        this.tresc = tresc;
//    }    
//
//    /**
//     * @return the obrazek
//     */
//    public String getObrazek() {
//        return obrazek;
//    }
//
//    /**
//     * @param obrazek the obrazek to set
//     */
//    public void setObrazek(String obrazek) {
//        this.obrazek = obrazek;
//    }
//
//    /**
//     * @return the odpowiedzi
//     */
//    public Odpowiedzi getOdpowiedzi() {
//        return odpowiedzi;
//    }
//
//    /**
//     * @param odpowiedzi the odpowiedzi to set
//     */
//    public void setOdpowiedzi(Odpowiedzi odpowiedzi) {
//        this.odpowiedzi = odpowiedzi;
//    }
//
//    /**
//     * @return the wagaPytania
//     */
//    public boolean isWagaPytania() {
//        return wagaPytania;
//    }
//
//    /**
//     * @param wagaPytania the wagaPytania to set
//     */
//    public void setWagaPytania(boolean wagaPytania) {
//        this.wagaPytania = wagaPytania;
//    }
//}
//
