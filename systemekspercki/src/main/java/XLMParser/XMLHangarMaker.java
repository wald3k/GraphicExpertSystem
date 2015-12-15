/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package XLMParser;

import DBModel.model.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Freeman
 */
public class XMLHangarMaker {
    
    private ArrayList<Pojazd> pojazdyList = null;
    private ArrayList<Wypozycajacy> wypozycajaceList = null;
    private ArrayList<Wyjazd> wyjazdyList = null;
    private ArrayList<Przyjazd> przyjazdyList = null;
    private ArrayList<Stan> stanyList = null;
    
    public XMLHangarMaker(){ 
    }
    
    public void makeXML(String path) throws IOException{
        File pliczek = new File(path);
        pliczek.createNewFile();
        
        PrintWriter p = new PrintWriter(pliczek);
        
        ////////////////WSTAWIANIE TRESCI//////////////
        p.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        p.println("<Hangar xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"bazaxml.xsd\">");
        
        if(pojazdyList!=null){
            p.println();
            p.println("\t<Pojazdy>");
            for(Pojazd o: pojazdyList){
                p.println("\t\t<pojazd>");
                    p.println("\t\t\t<id>"+o.getId()+"</id>");
                    p.println("\t\t\t<typ>"+o.getTyp()+"</typ>");
                    p.println("\t\t\t<nazwa>"+o.getNazwa()+"</nazwa>");
                p.println("\t\t</pojazd>");
            }
            p.println("\t</Pojazdy>");
        }
        
        if(wypozycajaceList!=null){
            p.println();
            p.println("\t<Wypozyczajace>");
            for(Wypozycajacy o: wypozycajaceList){
                p.println("\t\t<wypozyczajacy>");
                    p.println("\t\t\t<id>"+o.getId()+"</id>");
                    p.println("\t\t\t<stopien>"+o.getStopien()+"</stopien>");
                    p.println("\t\t\t<imie>"+o.getImie()+"</imie>");
                    p.println("\t\t\t<nazwisko>"+o.getNazwisko()+"</nazwisko>");
                p.println("\t\t</wypozyczajacy>");
            }
            p.println("\t</Wypozyczajace>");
        }
        
        if(wyjazdyList!=null){
            p.println();
            p.println("\t<Wyjazdy>");
            for(Wyjazd o: wyjazdyList){
                p.println("\t\t<wyjazd>");
                    p.println("\t\t\t<id>"+o.getId()+"</id>");
                    p.println("\t\t\t<idPojazd>"+o.getIdPojazd()+"</idPojazd>");
                    p.println("\t\t\t<idWypozyczajacy>"+o.getIdWypozycajacy()+"</idWypozyczajacy>");
                    p.println("\t\t\t<data>"+o.getData()+"</data>");
                p.println("\t\t</wyjazd>");
            }
            p.println("\t</Wyjazdy>");
        }
        
        p.println();
        p.println("</Hangar>");
        ///////////////////////////////////////////////
        p.close();
    }

    /**
     * @return the pojazdyList
     */
    public ArrayList<Pojazd> getPojazdyList() {
        return pojazdyList;
    }

    /**
     * @param pojazdyList the pojazdyList to set
     */
    public void setPojazdyList(ArrayList<Pojazd> pojazdyList) {
        this.pojazdyList = pojazdyList;
    }

    /**
     * @return the wypozycajaceList
     */
    public ArrayList<Wypozycajacy> getWypozycajaceList() {
        return wypozycajaceList;
    }

    /**
     * @param wypozycajaceList the wypozycajaceList to set
     */
    public void setWypozycajaceList(ArrayList<Wypozycajacy> wypozycajaceList) {
        this.wypozycajaceList = wypozycajaceList;
    }

    /**
     * @return the wyjazdyList
     */
    public ArrayList<Wyjazd> getWyjazdyList() {
        return wyjazdyList;
    }

    /**
     * @param wyjazdyList the wyjazdyList to set
     */
    public void setWyjazdyList(ArrayList<Wyjazd> wyjazdyList) {
        this.wyjazdyList = wyjazdyList;
    }

    /**
     * @return the przyjazdyList
     */
    public ArrayList<Przyjazd> getPrzyjazdyList() {
        return przyjazdyList;
    }

    /**
     * @param przyjazdyList the przyjazdyList to set
     */
    public void setPrzyjazdyList(ArrayList<Przyjazd> przyjazdyList) {
        this.przyjazdyList = przyjazdyList;
    }

    /**
     * @return the stanyList
     */
    public ArrayList<Stan> getStanyList() {
        return stanyList;
    }

    /**
     * @param stanyList the stanyList to set
     */
    public void setStanyList(ArrayList<Stan> stanyList) {
        this.stanyList = stanyList;
    }
    
}
