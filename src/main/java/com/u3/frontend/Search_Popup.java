package com.u3.frontend;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import com.u3.model.Model;

/**
 * The purpose of this class is to offer an interface through which user can look through 
 * the results of their search and select the POI of their choice
 * @author Sadiyah Sajjad
 */
public class Search_Popup extends javax.swing.JFrame {

    private Model model; 
    private ArrayList<String> matchingPOIs;

    /**
     * Creates new form Search_Popup
     */
    public Search_Popup(Model model, ArrayList<String> matchingPOIs) {
        this.model = model;
        this.matchingPOIs = matchingPOIs;
        initComponents(); 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        Search_Results = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        View_Button = new javax.swing.JButton();

        Search_Results.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search_Results.setText("Search Results: ");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = matchingPOIs;
            public int getSize() { return strings.size(); }
            public String getElementAt(int i) { return strings.get(i); }
        });
        jScrollPane1.setViewportView(jList1);

        View_Button.setText("View");
        View_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Main_PanelLayout = new javax.swing.GroupLayout(Main_Panel);
        Main_Panel.setLayout(Main_PanelLayout);
        Main_PanelLayout.setHorizontalGroup(
            Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_PanelLayout.createSequentialGroup()
                        .addComponent(Search_Results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_PanelLayout.createSequentialGroup()
                        .addGroup(Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(View_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        Main_PanelLayout.setVerticalGroup(
            Main_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Search_Results)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(View_Button)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /** 
     * This method is called when the "View" button is clicked. 
     * It retrieves the selected item from a JList and outputs it to the console.
     * @param evt An ActionEvent object that represents the event that triggered the method call.
     */
    private void View_ButtonActionPerformed(ActionEvent evt) {
        // Get the selected item from the JList
        String selected = jList1.getSelectedValue();
        
        // Output the selected item to the console
        System.out.println("Selected item: " + selected);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search_Popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /* 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Popup(model).setVisible(true);
            }
        });
        */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JLabel Search_Results;
    private javax.swing.JButton View_Button;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
