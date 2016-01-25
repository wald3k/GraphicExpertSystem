/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.okna;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pytania.Quiz;
import wyniki.Analizator;

/**
 *
 * @author Freeman
 */
public class ResultsJFrame extends javax.swing.JFrame {

    private JFrame parentJFrame; // ¿eby mo¿na by³o siê odwo³aæ do G³ównego Menu
    Quiz quiz;
    Analizator analizator;
    
    /**
     * Creates new form SaverJForm
     */
    //public OPrgramieJFrame(String title, PopulationData popDat , GUIPlotsService plotService, int chartNumber, boolean[] filter) {
      public ResultsJFrame(JFrame parentFrame, String str) {
        super("Wyniki");
        parentJFrame = parentFrame;

        ResultsiJPanel resultsiJPanel = new ResultsiJPanel(parentJFrame, this);
        resultsiJPanel.setWyniki(str);
       
        this.getContentPane().add(resultsiJPanel);
        
        /*
        if(chartNumber==3){
            JPanel gensavJP = new SaveGenerationJPanel(popDat,plotService);
            JPanel plotsacJP = new SavePlotJPanel("Save population chart:", popDat, plotService.getPopulationChartPanel().getChart());
            
            this.getContentPane().add(gensavJP, BorderLayout.PAGE_START);
            this.getContentPane().add(plotsacJP, BorderLayout.CENTER);
            this.getContentPane().add(gnuplotJP, BorderLayout.PAGE_END);
            
        }
        if(chartNumber==2){
            JPanel gensavJP = new SaveGenerationJPanel(popDat,plotService);
            JPanel plotsacJP = new SavePlotJPanel("Save generation chart:", popDat, plotService.getGenerationChartPanel().getChart());
            
            this.getContentPane().add(gensavJP, BorderLayout.PAGE_START);
            this.getContentPane().add(plotsacJP, BorderLayout.CENTER);
            this.getContentPane().add(gnuplotJP, BorderLayout.PAGE_END);
        }
        if(chartNumber==1){
            JPanel plotsacJP = new SavePlotJPanel("Save individual chart:",popDat,plotService.getIndividualChartPanel().getChart());
            
            this.getContentPane().add(plotsacJP, BorderLayout.CENTER);
            this.getContentPane().add(gnuplotJP, BorderLayout.AFTER_LAST_LINE);
        }
        if(chartNumber==0){
            JPanel plotsacJP = new SavePlotJPanel("Save Timeslap chart:",popDat,plotService.getTimeslapChartPanel().getChart());
            
            this.getContentPane().add(plotsacJP, BorderLayout.CENTER);
            this.getContentPane().add(gnuplotJP, BorderLayout.AFTER_LAST_LINE);
        }
        */
        
        
        
        
       
        
        //4. Size the frame.
        this.pack();
        this.setVisible(true);
    }

    /**
     * @return the parentJFrame
     */
    public JFrame getParentJFrame() {
        return parentJFrame;
    }

    /**
     * @param parentJFrame the parentJFrame to set
     */
    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    
}
