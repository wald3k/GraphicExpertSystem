/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.okna;

//import MenuPackage.DataHolder.PopulationData;
//import MenuPackage.FileManager.FileCreator;
//import MenuPackage.MenuForm;
//import MenuPackage.SPlots.GUIPlotsService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Freeman
 */
public class SaveGenerationJPanel extends javax.swing.JPanel {
    JFrame parentJFrame;
    /**
     * Creates new form SaveGenerationJPanel
     */
    public SaveGenerationJPanel(String tekstOpdowiedzi, ButtonGroup bg) {
        bg.add(odpowiedzRadioBtn);
        odpowiedzTA.setText(tekstOpdowiedzi);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        odpowiedzTA = new javax.swing.JTextArea();
        odpowiedzRadioBtn = new javax.swing.JRadioButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setPreferredSize(new java.awt.Dimension(400, 80));

        odpowiedzTA.setColumns(20);
        odpowiedzTA.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        odpowiedzTA.setRows(5);
        odpowiedzTA.setText("Tutaj jest tre�� odpowiedzi.");
        jScrollPane1.setViewportView(odpowiedzTA);

        odpowiedzRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        odpowiedzRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odpowiedzRadioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(odpowiedzRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(odpowiedzRadioBtn)
                .addGap(0, 7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void odpowiedzRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odpowiedzRadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odpowiedzRadioBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton odpowiedzRadioBtn;
    private javax.swing.JTextArea odpowiedzTA;
    // End of variables declaration//GEN-END:variables
}
