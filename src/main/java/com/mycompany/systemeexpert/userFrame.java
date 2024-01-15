/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.systemeexpert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;

/**
 *
 * @author elhou
 */
public class userFrame extends javax.swing.JFrame {
    
    String key;
    String value;
 
    User user =new User();
    HashMap<String,String> snapshot = new HashMap<String,String>();
    public userFrame(User u,HashMap<String,String> map) {
        initComponents();
        user = u;
        snapshot = map;
        afficherRegle();
        
       
    }

    public userFrame() {
        initComponents();
        afficherRegle();
        
    }
    
    
    public void afficherRegle(){
        if(snapshot.isEmpty()){
            NewRegleJFrame frame = new NewRegleJFrame();
            frame.setVisible(true);
            this.dispose();
        
        }
        else{
            
            Map.Entry<String,String> entry = snapshot.entrySet().iterator().next();
            key= entry.getKey();
            value=entry.getValue();
            RegleLabel.setText(key);
            this.setVisible(true);
            
        }
    
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegleLabel = new javax.swing.JLabel();
        OuiButton = new javax.swing.JButton();
        NonButton = new javax.swing.JButton();
        FaitLabel = new javax.swing.JLabel();
        deconnecterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        RegleLabel.setToolTipText("");

        OuiButton.setText("Oui");
        OuiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OuiButtonActionPerformed(evt);
            }
        });

        NonButton.setText("Non");
        NonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NonButtonActionPerformed(evt);
            }
        });

        deconnecterButton.setText("Se deconnecter");
        deconnecterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnecterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(OuiButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NonButton)
                .addGap(259, 259, 259))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(RegleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(FaitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deconnecterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(deconnecterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(RegleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OuiButton)
                    .addComponent(NonButton))
                .addGap(70, 70, 70)
                .addComponent(FaitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OuiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OuiButtonActionPerformed
        
        FaitLabel.setText(value);
        
    }//GEN-LAST:event_OuiButtonActionPerformed

    private void NonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NonButtonActionPerformed
        
        snapshot.remove(key, value);
        userFrame frame = new userFrame(user,snapshot);
        this.dispose();
        
    }//GEN-LAST:event_NonButtonActionPerformed

    private void deconnecterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnecterButtonActionPerformed
        
        LoginFrame fram = new LoginFrame();
        fram.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deconnecterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FaitLabel;
    private javax.swing.JButton NonButton;
    private javax.swing.JButton OuiButton;
    private javax.swing.JLabel RegleLabel;
    private javax.swing.JButton deconnecterButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}