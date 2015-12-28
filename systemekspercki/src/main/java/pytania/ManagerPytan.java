/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pytania;

import com.sun.xml.internal.bind.v2.TODO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author waldi
 */
public class ManagerPytan {
    //TODO powinien brac z pliku jakies dane!
    public void dodajPytanieDoBazy(){
                EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
                
                Pytanie pytanie = new Pytanie(1);
                pytanie.setTresc("Czy jesteœ zainteresowany sculptingiem?");
                pytanie.setKategoria("pktOcena3d");
                Odpowiedz odp1= new Odpowiedz(pytanie.getIdPytania(),"tak");
                Odpowiedz odp2= new Odpowiedz(pytanie.getIdPytania(),"nie");
                List<Odpowiedz> lista = new ArrayList<>();
                lista.add(odp1);
                lista.add(odp2);
                pytanie.setListaOdpowiedzi(lista);               
               
                
                entityManager.getTransaction().begin();
                entityManager.persist(pytanie);      
                entityManager.persist(odp1);      
                entityManager.persist(odp2);      

                entityManager.getTransaction().commit(); 
                
		entityManager.close();
		entityManagerFactory.close();
    }
    
}
