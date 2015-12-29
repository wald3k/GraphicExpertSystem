package zarzadzanieEncjami;

import java.util.ArrayList;
import java.util.List;
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
    public EManager(){
         this.entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
         this.entityManager = entityManagerFactory.createEntityManager();    
         this.entityManager.getTransaction().begin();
         
         listaProgramow = new ArrayList<Program>();
         listaKategorii = new ArrayList<Kategoria>();
    }
    public void close(){
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        this.entityManagerFactory.close();
    }
    public void dodajProgramyDoBazy(EntityManager entityManager) {      
        dodajProgramDoBazy("Blender",0,"Windows/Mac/Linux",2,8,2000,3560000,820000,"opis","link");
        dodajProgramDoBazy("SketchUP",695,"Windows",4,8,500,1370000,1010000,"opis","link");
        dodajProgramDoBazy("SolidWorks",1295,"Windows",4,8,500,985000,606000,"opis","link");
        dodajProgramDoBazy("AutoCad",1772,"Windows",2,4,6000,2180000,1620000,"opis","link");
        dodajProgramDoBazy("AutoCadLT",382,"Windows",2,3,4000,475000,478000,"opis","link");
        dodajProgramDoBazy("Maya",1700,"Windows/Mac/Linux",4,8,4000,3590000,1910000,"opis","link");
        dodajProgramDoBazy("3ds Max",1700,"Windows",4,8,6000,3570000,74400,"opis","link");
        dodajProgramDoBazy("Inventor",3544,"Windows/Mac",8,16,100000,1370000,1270000,"opis","link");
        dodajProgramDoBazy("Tinkercad",3544,"Windows/Mac-Linux",2,4,0,96600,112000,"Aplikacja przegl¹darkowa","link");
        dodajProgramDoBazy("Mudbox",120,"Windows/Mac/Linux",4,8,1000,540000,317,"Do sculptingu","link");
    }
    public void dodajProgramDoBazy(String nazwa, int cena,String systemy,
            int min_ram,int zal_ram, int hdd, int l_tutoriali,
            int l_ofert_pracy,String opis, String link){
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
    public void dodajKategorieDoBazy(EntityManager entityManager ){
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
    public void dodajRankingDoBazy(EntityManager entityManager){
        for(Program p: listaProgramow){
            for(Kategoria k: listaKategorii){            
                int licznik =0;
                Ranking ranking = new Ranking();
                if(k.getId()%2==0){
                    ranking.setPunkty(10);
                }                    
                else{
                    ranking.setPunkty(20);
                }
                ranking.setProgram(p);
                ranking.setKategoria(k);
                entityManager.persist(ranking);
                licznik +=1;
            }
        }
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
    public void dodajPytaniaDoBazy(EntityManager entityManager){        
        dodajPytanieDoBazy("Czy potrzebujesz programu do grafiki 3d?",1,"tak","nie");
        dodajPytanieDoBazy("Czy potrzebujesz programu do grafiki Sculpt?",2,"tak","nie");
        dodajPytanieDoBazy("Czy jesteœ gotów przeznaczyæ na program wiêcej ni¿ 500$?",3,"tak","nie");
        dodajPytanieDoBazy("Czy dopuszczasz licencjê czasow¹",4,"tak","nie");
        dodajPytanieDoBazy("Czy mia³eœ wczeœniej stycznoœæ z oprogramowaniem do grafiki",5,"tak","nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z programu w systemie Windows",6,"tak","nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z programu w systemie Mac OS",7,"tak","nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z programu w systemie Linux",8,"tak","nie");
        dodajPytanieDoBazy("Podaj minimaln¹ Twoim zdaniem iloœæ ramu jak¹ powinien wymagaæ program",9,"tak","nie");
        dodajPytanieDoBazy("Podaj maksymaln¹ Twoim zdaniem iloœæ ramu jak¹ powinien wymagaæ program",10,"tak","nie");
        dodajPytanieDoBazy("Czy posiadasz przynajmniej 5gb wolnego miejsca na dysku?",11,"tak","nie");
        dodajPytanieDoBazy("Czy zaakceptowa³byœ uproszczony interfejs wzglêdem funkcjonalnoœci?",12,"tak","nie");
        dodajPytanieDoBazy("Czy bêdziesz korzysta³ z tutoriali?",13,"tak","nie");
        dodajPytanieDoBazy("Czy zamierzasz pracowaæ jako grafik 3d?",14,"tak","nie");
        
    }
    public void dodajPytanieDoBazy(String tresc,int kategoria,String odp1,String odp2){
        Pytanie pytanie1 = new Pytanie();
        pytanie1.setKategoria(kategoria);
        pytanie1.setTresc(tresc);
        List<Odpowiedz> lista1 = new ArrayList<Odpowiedz>();
        Odpowiedz o1 = new Odpowiedz(odp1);
        Odpowiedz o2 = new Odpowiedz(odp2);
        lista1.add(o1);
        lista1.add(o2);
        
        entityManager.persist(pytanie1);
        entityManager.persist(o1);
        entityManager.persist(o2);
    }
        
    
}
