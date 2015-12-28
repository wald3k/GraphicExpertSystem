package zarzadzanieEncjami;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import program.Program;
import pytania.Kategoria;
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
      
        Program program1 = new Program();        
        program1.setNazwa("3ds Max");
        program1.setCena(1700);
        program1.setOpisProgramu("Jeden z najpopularniejszych programów. Bardzo szeroki zasób materia³ów efukacyjnych. \nBardzo dobra dokumentacja");
        program1.setLiczba_tutoriali(3570000);
        program1.setLiczba_ofert_pracy(744000);    
        
        Program program2 = new Program();        
        program2.setNazwa("Maya");
        program2.setCena(1701);
        program2.setOpisProgramu("Maya, drugi najpopuparniejszy program.");
        program2.setLiczba_tutoriali(2000000);
        program2.setLiczba_ofert_pracy(7321340);  
        
        listaProgramow.add(program1);
        listaProgramow.add(program2);
        entityManager.persist(program1);
        entityManager.persist(program2);
              
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
    

}
