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

/**
 *
 * @author Freeman
 */
public class OProgramieJFrame extends javax.swing.JFrame {

    private JFrame parentJFrame; // �eby mo�na by�o si� odwo�a� do G��wnego Menu
    /**
     * Creates new form SaverJForm
     */
    //public OPrgramieJFrame(String title, PopulationData popDat , GUIPlotsService plotService, int chartNumber, boolean[] filter) {
      public OProgramieJFrame(String title, JFrame parentFrame) {
        super(title);
        parentJFrame = parentFrame;
        JPanel oProgramieJP = new OProgramieJPanel("tytul", this);
       
        this.getContentPane().add(oProgramieJP);
        
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
