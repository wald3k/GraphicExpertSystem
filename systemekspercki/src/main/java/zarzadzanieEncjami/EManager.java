package zarzadzanieEncjami;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import program.Program;
import pytania.Kategoria;
import pytania.Odpowiedz;
import pytania.Pytanie;
import pytania.Ranking;

public class EManager {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private List<Program> listaProgramow;
    private List<Kategoria> listaKategorii;

    public EManager() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        this.entityManager = entityManagerFactory.createEntityManager();
        this.entityManager.getTransaction().begin();

        listaProgramow = new ArrayList<Program>();
        listaKategorii = new ArrayList<Kategoria>();
    }

    public void close() {
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        this.entityManagerFactory.close();
    }

    public void dodajProgramyDoBazy(EntityManager entityManager) {
        dodajProgramDoBazy("Blender", 0, "Windows/Mac/Linux", 2, 8, 2000, 3560000, 820000, "Blender jest bezp³atnym narzêdziem do tworzenia grafiki trójwymiarowej, zarówno statycznej, jak i animacji. Jest narzêdziem niezwyk³ym, z jednej strony minimalne rozmiary i dostêpnoœæ za darmo, a z drugiej autentyczna konkurencyjnoœæ do takich pakietów jak 3DS MAX.", "https://www.blender.org/");
        dodajProgramDoBazy("SketchUP", 695, "Windows", 4, 8, 500, 1370000, 1010000, "SketchUp to profesjonalne oprogramowanie, s³u¿¹ce do modelowania trójwymiarowych obiektów – domów, statków kosmicznych, rzeŸb itp.", "http://www.sketchup.com/");
        dodajProgramDoBazy("SolidWorks", 1295, "Windows", 4, 8, 500, 985000, 606000, "SolidWorks Corp. oferuje kompletne oprogramowanie 3D wraz z narzêdziami, które pozwol¹ Ci projektowaæ, przeprowadzaæ symulacjê 3d.", "http://www.solidworks.com/");
        dodajProgramDoBazy("AutoCad", 1772, "Windows", 2, 4, 6000, 2180000, 1620000, "AutoCAD to legenda i najwa¿niejsza pozycja na rynku aplikacji do projektowania 2D/3D oraz tworzenia dokumentacji.", "http://www.autodesk.pl/products/autocad/overview/");
        dodajProgramDoBazy("AutoCadLT", 382, "Windows", 2, 3, 4000, 475000, 478000, "AutoCAD LT 2016 jest ograniczon¹ funkcjonalnie wersj¹ legendarnego programu do komputerowego wspomagania projektowania AutoCAD.", "http://www.autodesk.pl/products/autocad-lt/overview/");
        dodajProgramDoBazy("Maya", 1700, "Windows/Mac/Linux", 4, 8, 4000, 3590000, 1910000, "Maya to znakomity pakiet narzêdzi przeznaczony do modelowania, symulacji, animacji i renderowania grafiki 3D, wykorzystywany do tworzenia efektów specjalnych w filmach, trójwymiarowych modeli i obiektów w grach komputerowych, a tak¿e animacji flash itp.", "http://www.autodesk.com/products/maya/overview/");
        dodajProgramDoBazy("3ds Max", 1700, "Windows", 4, 8, 6000, 3570000, 74400, "3ds max jest jednym z najlepszych i najbardziej rozpowszechnionych programów do tworzenia grafiki trójwymiarowej, renderowania, animowania czy modelowania 3D. ", "http://www.autodesk.pl/products/3ds-max/overview/");
        dodajProgramDoBazy("Inventor", 3544, "Windows/Mac", 8, 16, 100000, 1370000, 1270000, "Inventor – program komputerowy typu CAD tworzony i rozpowszechniany przez firmê Autodesk. Jest to typ modelera bry³owego s³u¿¹cy do zamodelowania projektowanego urz¹dzenia jako modelu 3D. Na podstawie tego modelu mo¿liwe jest wykonanie rysunków wykonawczych, z³o¿eniowych, pogl¹dowych i innych.", "http://www.autodesk.pl/products/inventor/overview/");
        dodajProgramDoBazy("Tinkercad", 3544, "Windows/Mac/Linux", 2, 4, 0, 96600, 112000, "Aplikacja przegl¹darkowa do tworzenia modeli CAD.", "http://www.tinkercad.com/");
        dodajProgramDoBazy("Mudbox", 120, "Windows/Mac/Linux", 4, 8, 1000, 540000, 317, "Mudbox to zaawansowana aplikacja do rzeŸbienia trójwymiarowych modeli poprzez rêczne deformowanie siatki, a tak¿e malowanie ich lub uk³adanie na nich tekstur. Technika ta przypomina formowanie prawdziwego materia³u plastycznego i malowanie pêdzlem efektów pracy. ", "http://www.autodesk.com/products/mudbox/overview/");
        dodajProgramDoBazy("Zbrush", 795, "Windows/Mac", 6, 16, 100000, 1250000, 699000, "Zbrush to zaawansowana aplikacja do rzeŸbienia trójwymiarowych modeli", "http://pixologic.com/zbrush/features/overview/");
        dodajProgramDoBazy("Cinema4D", 3695, "Windows/Mac", 4, 8, 7000, 1910000, 495000, "Cinema 4D to profesjonalny pakiet do tworzenia wizualizacji oraz animacji 3D", "http://www.maxon.net/");
        dodajProgramDoBazy("123D Design", 3695, "Windows/Mac", 2, 3, 1500, 140000, 311000, "Autodesk 123D - darmowy program dla chc¹cych rozpocz¹æ zabawê z drukiem 3d.", "http://www.123dapp.com/design/");
        dodajProgramDoBazy("Wings 3D", 0, "Windows/Mac/Linux", 2, 4, 500, 84000, 86500, "Wszystkie obiekty stworzone przy jego pomocy powstaj¹ na bazie prostych przestrzennych figur geometrycznych (szeœcian, tetraedr, walec, sfera, itp.), które stopniowo s¹ rozbudowywane. ", "www.wings3d.com/");
        dodajProgramDoBazy("LightWave", 695, "Windows/Mac", 2, 4, 2000, 1340000, 432000, "LightWave 3D to zestaw profesjonalnych narzêdzi do modelowania, renderingu i animacji trójwymiarowych scen i efektów, których olbrzymie mo¿liwoœci zosta³y niejednokrotnie wykorzystane przez twórców wielu popularnych produkcji kinowych.", "http://www.lightwave3d.com/");
        dodajProgramDoBazy("Modo", 1084, "Windows/Mac/Linux", 4, 8, 10000, 2140000, 483000, "opis", "http://www.thefoundry.co.uk/products/modo/");
        dodajProgramDoBazy("Rhinoceros", 1695, "Windows/Mac", 4, 8, 600, 341000, 450000, "Rhinoceros (znany równie¿ jako Rhino) to rozbudowane oprogramowanie do projektowania oraz modelowania obiektów trójwymiarowych", "http://www.rhino3d.com/");
        dodajProgramDoBazy("Sculptris", 0, "Windows/Mac", 1, 4, 1000, 87500, 106000, " Sculptris to darmowy program rozwijany w firmie Pixologic, znanej jako wydawca cenionego przez artystów i filmowców programu ZBrush.", "http://pixologic.com/sculptris/");
        dodajProgramDoBazy("FreeCAD", 0, "Windows/Mac/Linux", 1, 2, 1000, 405000, 106000, "Stosunkowo prosty ale darmowy program do projektowania CAD wraz z doœæ rozbudowanym modu³em symulacji ruchu.", "http://www.freecadweb.org/");

    }

    public void dodajProgramDoBazy(String nazwa, int cena, String systemy,
            int min_ram, int zal_ram, int hdd, int l_tutoriali,
            int l_ofert_pracy, String opis, String link) {
        Program program1 = new Program();
        program1.setNazwa(nazwa);
        program1.setCena(cena);
        program1.setSystemy(systemy);
        program1.setMin_ram(min_ram);
        program1.setZal_ram(zal_ram);
        program1.setHdd(hdd);
        program1.setLiczba_tutoriali(l_tutoriali);
        program1.setLiczba_ofert_pracy(l_ofert_pracy);
        program1.setOpisProgramu(opis);
        program1.setLink(link);
        listaProgramow.add(program1);
        entityManager.persist(program1);
    }

    public void dodajKategorieDoBazy(EntityManager entityManager) {
        Kategoria kategoria1 = new Kategoria();
        kategoria1.setNazwa("3d");
        Kategoria kategoria2 = new Kategoria();
        kategoria2.setNazwa("sculpt");
        Kategoria kategoria3 = new Kategoria();
        kategoria3.setNazwa("cena");
        Kategoria kategoria4 = new Kategoria();
        kategoria4.setNazwa("licencja");
        Kategoria kategoria5 = new Kategoria();
        kategoria5.setNazwa("trudnoscNauki");
        Kategoria kategoria6 = new Kategoria();
        kategoria6.setNazwa("windows");
        Kategoria kategoria7 = new Kategoria();
        kategoria7.setNazwa("mac");
        Kategoria kategoria8 = new Kategoria();
        kategoria8.setNazwa("linux");
        Kategoria kategoria9 = new Kategoria();
        kategoria9.setNazwa("ramMin");
        Kategoria kategoria10 = new Kategoria();
        kategoria10.setNazwa("ramZal");
        Kategoria kategoria11 = new Kategoria();
        kategoria11.setNazwa("hdd");
        Kategoria kategoria12 = new Kategoria();
        kategoria12.setNazwa("interfejs");
        Kategoria kategoria13 = new Kategoria();
        kategoria13.setNazwa("tutoriale");
        Kategoria kategoria14 = new Kategoria();
        kategoria14.setNazwa("praca");

        listaKategorii.add(kategoria1);
        listaKategorii.add(kategoria2);
        listaKategorii.add(kategoria3);
        listaKategorii.add(kategoria4);
        listaKategorii.add(kategoria5);
        listaKategorii.add(kategoria6);
        listaKategorii.add(kategoria7);
        listaKategorii.add(kategoria8);
        listaKategorii.add(kategoria9);
        listaKategorii.add(kategoria10);
        listaKategorii.add(kategoria11);
        listaKategorii.add(kategoria12);
        listaKategorii.add(kategoria13);
        listaKategorii.add(kategoria14);
        entityManager.persist(kategoria1);
        entityManager.persist(kategoria2);
        entityManager.persist(kategoria3);
        entityManager.persist(kategoria4);
        entityManager.persist(kategoria5);
        entityManager.persist(kategoria6);
        entityManager.persist(kategoria7);
        entityManager.persist(kategoria8);
        entityManager.persist(kategoria9);
        entityManager.persist(kategoria10);
        entityManager.persist(kategoria11);
        entityManager.persist(kategoria12);
        entityManager.persist(kategoria13);
        entityManager.persist(kategoria14);

        System.out.println("Zakonczono wgrywanie kategorii");

    }

    public void dodajRankingDoBazy(EntityManager entityManager) {

        int licznik = 1;
        for (Program p : listaProgramow) {      
            int ktoraKategoria = 1;
            Scanner sc = null;
            try {
                sc = new Scanner(new File("src/ranking programow/"+licznik+".txt"));
                String nazwaProgramu = sc.nextLine();
                System.out.println("nazwa pliku: "+licznik+" Nazwa program:  " + nazwaProgramu);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] wyrazy = line.split("\t");
                System.out.println(wyrazy[0]);
                Ranking ranking = new Ranking();
                Kategoria k = entityManager.find(Kategoria.class, ktoraKategoria);
                ranking.setProgram(p);
                ranking.setKategoria(k);
                ranking.setPunkty(Integer.parseInt(wyrazy[1]));
                entityManager.persist(ranking);   
                ktoraKategoria++;
                
            }          
            licznik++;   
        }
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void dodajPytaniaDoBazy(EntityManager entityManager) {
        dodajPytanieDoBazy("Czy potrzebujesz programu do grafiki 3d?", 1, "tak", "nie");
        dodajPytanieDoBazy("Czy potrzebujesz programu do grafiki Sculpt?", 2, "tak", "nie");
        dodajPytanieDoBazy("Czy jesteœ gotów przeznaczyæ na program wiêcej ni¿ 500$?", 3, "tak", "nie");
        dodajPytanieDoBazy("Czy dopuszczasz licencjê czasow¹", 4, "tak", "nie");
        dodajPytanieDoBazy("Czy mia³eœ wczeœniej stycznoœæ z oprogramowaniem do grafiki", 5, "tak", "nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z programu w systemie Windows", 6, "tak", "nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z programu w systemie Mac OS", 7, "tak", "nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z programu w systemie Linux", 8, "tak", "nie");
        dodajPytanieDoBazy("Podaj minimaln¹ Twoim zdaniem iloœæ ramu jak¹ powinien wymagaæ program", 9, "tak", "nie");
        dodajPytanieDoBazy("Podaj maksymaln¹ Twoim zdaniem iloœæ ramu jak¹ powinien wymagaæ program", 10, "tak", "nie");
        dodajPytanieDoBazy("Czy posiadasz przynajmniej 5gb wolnego miejsca na dysku?", 11, "tak", "nie");
        dodajPytanieDoBazy("Czy zaakceptowa³byœ uproszczony interfejs wzglêdem funkcjonalnoœci?", 12, "tak", "nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z tutoriali?", 13, "tak", "nie");
        dodajPytanieDoBazy("Czy zamierzasz pracowaæ jako grafik 3d?", 14, "tak", "nie");

        Pytanie tempPytanie = this.entityManager.find(Pytanie.class, 4);
        tempPytanie.setZaznaczonaOdpowiedz(this.entityManager.find(Odpowiedz.class, 10));

    }

    public void dodajPytanieDoBazy(String tresc, int kategoria, String odp1, String odp2) {
        Pytanie pytanie1 = new Pytanie();
        pytanie1.setKategoria(kategoria);
        pytanie1.setTresc(tresc);
        List<Odpowiedz> lista1 = new ArrayList<Odpowiedz>();
        Odpowiedz o1 = new Odpowiedz(odp1);
        Odpowiedz o2 = new Odpowiedz(odp2);
        lista1.add(o1);
        lista1.add(o2);
        pytanie1.setListaOdpowiedzi(lista1);
        entityManager.persist(pytanie1);
        entityManager.persist(o1);
        entityManager.persist(o2);
    }

    public List<Program> getListaProgramow() {
        return listaProgramow;
    }
}
