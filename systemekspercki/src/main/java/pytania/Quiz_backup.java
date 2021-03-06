//package pytania;
//
//import java.math.BigInteger;
//import java.util.List;
//import java.util.Scanner;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//import javax.persistence.TypedQuery;
//import program.Program;
//import wyniki.Analizator;
//import wyniki.Wynik;
//
///**
// *
// * @author Freeman
// */
//public class Quiz {
//
//    private EntityManagerFactory entityManagerFactory;
//    private EntityManager entityManager;
//
//    public Quiz() {
//        this.entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
//        this.entityManager = entityManagerFactory.createEntityManager();
//        System.out.println("Witam w Asystencie wyboru oprogramowania do edycji grafiki.");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Czy zacz�� ankiet�? Y/N");
//        String wybor = sc.nextLine();
//        if (wybor.equals("y") || wybor.equals("Y")) {
//            rozpocznijQuiz();
//            zwrocLiczbePytanZBazy();
//        } else {
//            System.out.println("Wychodz� z programu!");
//            System.exit(0);
//        }
//    }
//
//    public void close() {//konczenie quizu i robienie porzadkow
//        this.entityManager.close();
//        this.entityManagerFactory.close();
//    }
//
//    public void rozpocznijQuiz() {
//        int ilePytan = zwrocLiczbePytanZBazy();
//        List<Pytanie> listaPytan = zwrocListePytanZBazy();
//        Analizator analizator = new Analizator();
//        analizator.wczytajProgramyDoListyWynikow();        
//        for(Pytanie p: listaPytan){
//            System.out.println(p.getIdPytania()+". "+p.getTresc());
//            if(pobierzOdpowiedzNaPytanie(p)){
//                analizator.policzWynikiDlaXPytania(p.getIdPytania());
//            } 
//            
//        }
//    }
//
//    public int zwrocLiczbePytanZBazy() {
//        int ilePytan;
//        BigInteger temp;
//        //TypedQuery<int> query = entityManager.createQuery("SELECT max(id) FROM Pytanie ", Pytanie.class);
//        String queryString = "SELECT Count(*) FROM Pytanie";
//        Query query = entityManager.createNativeQuery(queryString);
//        temp = (BigInteger)query.getSingleResult();
//        ilePytan = temp.intValue();
//        System.out.println("W bazie jest: " + ilePytan + " pytan");
//        return ilePytan;
//    }
//    public List<Pytanie> zwrocListePytanZBazy(){
//        List<Pytanie> lista;
//        TypedQuery<Pytanie> query = entityManager.createQuery("SELECT p FROM Pytanie p", Pytanie.class);
//        lista = query.getResultList();
//        return lista;
//    }
//    public boolean pobierzOdpowiedzNaPytanie(Pytanie p){
//       List<Odpowiedz> listaOdpowiedzi =  p.getListaOdpowiedzi();
//       int licznik = 1;
//       for(Odpowiedz odp:listaOdpowiedzi){
//           System.out.println(licznik+": "+odp.getTresc());
//           licznik++;
//       } 
//       while(true){
//        System.out.println("Wybierz odpowiedz: "+1+"-"+(licznik-1));
//        Scanner sc = new Scanner(System.in);       
//        int wybor = sc.nextInt();
//        if(wybor < 1 || wybor > licznik-1){
//            System.out.println("Nie ma takiej odpowiedzi, sproboj jeszcze raz");
//            continue;
//        }
//        else{
//            this.entityManager.getTransaction().begin();
//            p.setZaznaczonaOdpowiedz(listaOdpowiedzi.get(wybor-1));        
//            this.entityManager.getTransaction().commit();
//            return true; 
//        }               
//       }        
//    }
//}
