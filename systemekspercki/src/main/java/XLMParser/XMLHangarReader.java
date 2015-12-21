/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package XLMParser;

import DBModel.model.Pojazd;
import DBModel.model.Wyjazd;
import DBModel.model.Wypozycajacy;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;




<Pytania>
    <pytanie>
            <id>INT</id>
            <typ>INT</typ>//0-czy radio button, 1-check box, 2-suwak, 3- wykres 
            <waznosc_pytania>BOOELAN</waznosc_pytania>//czy to pytanie jest dla Ciebie wa¿ne
            <tresc>STRING</tresc>   //treœæ pytania
            <odpowiedzi>    // LISTA ODPOWIEDZI

                <odpowiedz>
                    <tresc>STRING</tresc>   //treœæ odpowiedzi
                    <kryteria>  //LISTA KRYTERIÓW
                        <kryterium>
                            <id>INT</id>
                            <punkty>DOUBLE</punkty>
                        </kryterium>
                        <kryterium>
                            ...
                        </kryterium>
                    </kryteria>
                </odpowiedz>
                <odpowiedz>
                    ...
                </odpowiedz>
                

            </odpowiedzi>
    </pytanie>
    <pytanie>
        ...
    </pytanie>
</Pytania>














/**
 *
 * @author Freeman
 */
public class XMLHangarReader {
    
    //konstruktor
    public XMLHangarReader(){
    }
    
    public void readXML(String filePath) throws FileNotFoundException{
        
        try{
            File XMLFile = new File(filePath);
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(XMLFile);
            
            doc.getDocumentElement().normalize();
            
            System.out.println("Root element: "+doc.getDocumentElement().getNodeName());
            
            NodeList bigNod = doc.getElementsByTagName("Wypozyczajace");
            
            NodeList nList = bigNod.item(0).getChildNodes();
            
            
            System.out.println("----------------------------");
            
            for(int i=0 ; i<nList.getLength() ; i++){
                
                Node nod = nList.item(i);
                
                System.out.println("\nCurrent Element :"+nod.getNodeName());
                
                if(nod.getNodeType() == Node.ELEMENT_NODE){
                    Element elem = (Element)nod;
                    
                    //System.out.println("id : " + elem.getAttribute("id"));
                    System.out.println("id : " + elem.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Stopien : " + elem.getElementsByTagName("stopien").item(0).getTextContent());
                    System.out.println("Imie : " + elem.getElementsByTagName("imie").item(0).getTextContent());
                    System.out.println("Nazwisko : " + elem.getElementsByTagName("nazwisko").item(0).getTextContent());
                    //System.out.println("Salary : " + elem.getElementsByTagName("salary").item(0).getTextContent());
                    
                }
                
            }
            
        } catch(Exception e){
            System.out.println("CoÅ› sie spsuÅ‚o w readXML() :-( ");
            e.printStackTrace();
        }
        
    }
    
    
    public ArrayList<Wypozycajacy> extractWypozycajace(String filePath) throws FileNotFoundException{


        ArrayList<Wypozycajacy> wypList = new ArrayList<>();

        NodeList bigNod = this.initializeStaff(filePath, "Wypozyczajace");

        if(bigNod.getLength()>0){
            NodeList nList = bigNod.item(0).getChildNodes();


            //System.out.println("----------------------------");

            for(int i=0 ; i<nList.getLength() ; i++){

                Node nod = nList.item(i);

                //System.out.println("\nCurrent Element :"+nod.getNodeName());

                if(nod.getNodeType() == Node.ELEMENT_NODE){
                    Element elem = (Element)nod;

                    int id = Integer.parseInt(elem.getElementsByTagName("id").item(0).getTextContent());
                    String stopien = elem.getElementsByTagName("stopien").item(0).getTextContent();
                    String imie = elem.getElementsByTagName("imie").item(0).getTextContent();
                    String nazwisko = elem.getElementsByTagName("nazwisko").item(0).getTextContent();

                    Wypozycajacy wyp = new Wypozycajacy(id,stopien,imie,nazwisko);

                    //System.out.println("id : " + elem.getAttribute("id"));
                    //System.out.println("id : " + elem.getElementsByTagName("id").item(0).getTextContent());
                    //System.out.println("Stopien : " + elem.getElementsByTagName("stopien").item(0).getTextContent());
                    //System.out.println("Imie : " + elem.getElementsByTagName("imie").item(0).getTextContent());
                    //System.out.println("Nazwisko : " + elem.getElementsByTagName("nazwisko").item(0).getTextContent());
                    //System.out.println("Salary : " + elem.getElementsByTagName("salary").item(0).getTextContent());

                    wypList.add(wyp);
                }

            }

        return wypList;
        }
        else{
            return null;
        }
    }
    
    public ArrayList<Pojazd> extractPojazdy(String filePath) throws FileNotFoundException{

        ArrayList<Pojazd> pojazdList = new ArrayList<>();



        NodeList bigNod = this.initializeStaff(filePath, "Pojazdy");

        if(bigNod.getLength()>0){
            NodeList nList = bigNod.item(0).getChildNodes();

            for(int i=0 ; i<nList.getLength() ; i++){

                Node nod = nList.item(i);

                if(nod.getNodeType() == Node.ELEMENT_NODE){
                    Element elem = (Element)nod;

                    int id = Integer.parseInt(elem.getElementsByTagName("id").item(0).getTextContent());
                    String typ = elem.getElementsByTagName("typ").item(0).getTextContent();
                    String nazwa = elem.getElementsByTagName("nazwa").item(0).getTextContent();
                    
                    Pojazd pojazd = new Pojazd(id,typ,nazwa);

                    pojazdList.add(pojazd);
                }

            }

        return pojazdList;
        }
        else{
            return null;
        }
    }
    
    public ArrayList<Wyjazd> extractWyjazdy(String filePath) throws FileNotFoundException{

        ArrayList<Wyjazd> wyjazdList = new ArrayList<>();



        NodeList bigNod = this.initializeStaff(filePath, "Wyjazdy");

        if(bigNod.getLength()>0){
            NodeList nList = bigNod.item(0).getChildNodes();

            for(int i=0 ; i<nList.getLength() ; i++){

                Node nod = nList.item(i);

                if(nod.getNodeType() == Node.ELEMENT_NODE){
                    Element elem = (Element)nod;

                    int id = Integer.parseInt(elem.getElementsByTagName("id").item(0).getTextContent());
                    int idPojazd = Integer.parseInt(elem.getElementsByTagName("idPojazd").item(0).getTextContent());
                    int idWypozyczajacy = Integer.parseInt(elem.getElementsByTagName("idWypozyczajacy").item(0).getTextContent());
                    String data = elem.getElementsByTagName("data").item(0).getTextContent();
                    
                    Wyjazd wyjazd = new Wyjazd(id,idPojazd,idWypozyczajacy,data);

                    wyjazdList.add(wyjazd);
                }

            }

        return wyjazdList;
        }
        else{
            return null;
        }
    }
    
    
    private NodeList initializeStaff(String filePath, String tag){
        try{
            File XMLFile = new File(filePath);
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(XMLFile);

            doc.getDocumentElement().normalize();

            //System.out.println("Root element: "+doc.getDocumentElement().getNodeName());

            return doc.getElementsByTagName(tag);
            
        } catch(Exception e){
            System.out.println("CoÅ› sie spsuÅ‚o w initializeStaff("+tag+") :-( ");
            e.printStackTrace();
            
            return null;
        }
    }
    
    
}
