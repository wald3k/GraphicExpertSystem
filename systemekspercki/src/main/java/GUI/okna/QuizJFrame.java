/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.okna;

import java.awt.event.WindowEvent;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pytania.Odpowiedz;
import pytania.Pytanie;
import pytania.Quiz;
import wyniki.Analizator;

/**
 *
 * @author Freeman
 */
public class QuizJFrame extends javax.swing.JFrame {
    
    private Quiz quiz;
    private int ilePytan;
    private List<Pytanie> listaPytan;
    private Analizator analizator;
    private int aktualnePytanie=0;
    private JFrame parent;
    //int wybor;
    
    //QuestionYNJPanel questionPanel; 
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    /**
     * Creates new form QuizJFrame
     */
    public QuizJFrame(Quiz q, JFrame parent) {
        super("Quiz");
        this.parent = parent;
        
        quiz = q;
        ilePytan = q.zwrocLiczbePytanZBazy();
        listaPytan = q.zwrocListePytanZBazy();
        analizator = new Analizator(); 
        analizator.wczytajProgramyDoListyWynikow();
        
        entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        entityManager = entityManagerFactory.createEntityManager();
        
        //questionPanel = new QuestionYNJPanel();
        
        //mainPanel1 =  questionPanel;
        
        
        //mainPanel1.add(questionPanel);
        initComponents();
        
        //this.pack();
        //this.setVisible(true);
        
        this.pack();
        this.repaint();
        this.wyswietlPytanie(this.aktualnePytanie);
        
    }
    
    public void wyswietlPytanie(int numer){
        
        //((QuestionYNJPanel)mainPanel1).setTrescPytania(listaPytan.get(numer).getTresc());
        //((QuestionYNJPanel)mainPanel1).setTrescOdp1(listaPytan.get(numer).getListaOdpowiedzi().get(0).getTresc());
        //((QuestionYNJPanel)mainPanel1).setTrescOdp2(listaPytan.get(numer).getListaOdpowiedzi().get(1).getTresc());;
        questionYNJPanel1.setNrPytania(numer+1);
        questionYNJPanel1.setTrescPytania(listaPytan.get(numer).getTresc());
        questionYNJPanel1.setTrescOdp1(listaPytan.get(numer).getListaOdpowiedzi().get(0).getTresc());
        questionYNJPanel1.setTrescOdp2(listaPytan.get(numer).getListaOdpowiedzi().get(1).getTresc());
        //questionPanel.setVisible(true);
        //questionPanel.repaint();
        
       // System.out.println("wyswietl pytanie");
        
        
//        for(Pytanie p: listaPytan){
//            
//         
//            //System.out.println(p.getIdPytania()+". "+p.getTresc());
//            if(quiz.pobierzOdpowiedzNaPytanie(p)){
//                analizator.policzWynikiDlaXPytania(p.getIdPytania());
//            } 
//            
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        questionYNJPanel1 = new GUI.okna.QuestionYNJPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jButton1.setText("Poprzednie Pytanie");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jButton2.setText("Nast�pne Pytanie");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Powr�t do menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(questionYNJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(200, 200, 200)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionYNJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.aktualnePytanie++;
        
        if(aktualnePytanie<=ilePytan){ //normalne pytanie
            if(aktualnePytanie==ilePytan)jButton2.setText("Zobacz wyniki!");
            
            Pytanie p =  listaPytan.get(aktualnePytanie-1);
            List<Odpowiedz> listaOdpowiedzi =  p.getListaOdpowiedzi();
            
            this.entityManager.getTransaction().begin();
            p.setZaznaczonaOdpowiedz(listaOdpowiedzi.get(questionYNJPanel1.getOdpValue()));        
            this.entityManager.getTransaction().commit();
            analizator.policzWynikiDlaXPytania(p.getIdPytania());
      
            //System.out.println(aktualnePytanie);
            this.wyswietlPytanie(this.aktualnePytanie-1);
            if(!jButton1.isEnabled()) jButton1.setEnabled(true);      
        }
        
        
        else if(aktualnePytanie>ilePytan){//przechodziy do wynik�w
            Pytanie p =  listaPytan.get(aktualnePytanie-2);
            List<Odpowiedz> listaOdpowiedzi =  p.getListaOdpowiedzi();
            
            this.entityManager.getTransaction().begin();
            p.setZaznaczonaOdpowiedz(listaOdpowiedzi.get(questionYNJPanel1.getOdpValue()));        
            this.entityManager.getTransaction().commit();
            //analizator.policzWynikiDlaXPytania(p.getIdPytania());
            
            
            //this.setVisible(false);
        
            ResultsJFrame oknoWynikow = new ResultsJFrame(parent,analizator.policzWynikiDlaXPytaniaStr(p.getIdPytania()));
            
            //oknoWynikow.pack();
            oknoWynikow.setVisible(true);
            this.setVisible(false);
  
        }

     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.aktualnePytanie--;
        System.out.println(aktualnePytanie);
        this.wyswietlPytanie(this.aktualnePytanie);
        if(aktualnePytanie<=0) jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        parent.setVisible(true);
        this.setVisible(false);
        this.quiz.close();
        //this.dispatchEvent(new WindowEvent(parent, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private GUI.okna.QuestionYNJPanel questionYNJPanel1;
    // End of variables declaration//GEN-END:variables
}
