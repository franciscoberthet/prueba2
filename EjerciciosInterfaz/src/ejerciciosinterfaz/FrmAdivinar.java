/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosinterfaz;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author alumno
 */
public class FrmAdivinar extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdivinar
     */
    public FrmAdivinar() {
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

        txtNumero = new javax.swing.JTextField();
        txtIntentos = new javax.swing.JTextField();
        btnComenzar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumero.setText("Ingrese un numero");
        txtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumeroMouseClicked(evt);
            }
        });
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroKeyReleased(evt);
            }
        });

        txtIntentos.setEditable(false);
        txtIntentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntentos.setText("Intentos");
        txtIntentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntentosActionPerformed(evt);
            }
        });

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnVerificar.setText("Adivinar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jLabel1.setText("          ");

        jLabel2.setText("     ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(txtIntentos)
                        .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnComenzar)
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMouseClicked
        // TODO add your handling code here:
        txtNumero.setText("");
        
    }//GEN-LAST:event_txtNumeroMouseClicked

    private void txtIntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntentosActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        // TODO add your handling code here:
        numeroSecreto = ThreadLocalRandom.current().nextInt(1, 100+1);
        intentos = 1;
 //       txtIntentos.setText(String.valueOf(numeroSecreto));
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        numeroIngresado =Integer.parseInt(txtNumero.getText());
       if (numeroIngresado == numeroSecreto){
           jLabel1.setText("Ganaste!");
           txtIntentos.setText(String.valueOf(intentos));
       }
       
       else {
           intentos++;
           if (numeroIngresado < numeroSecreto){
           jLabel1.setText("Falta");
           }
           if (numeroIngresado > numeroSecreto){
           jLabel1.setText("Te pasaste");
           }
       }
           
     //   if (Integer.getInteger(txtNumero.getText()) == numeroSecreto){
   //         jLabel1.setText("Ganaste!");
   //     }
     //   else jLabel1.setText("No ganaste");
        
        
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyReleased
         // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyReleased

    /**
     * @param args the command line arguments
     */
    private String input;
    
    private int numeroIngresado;
    private int numeroSecreto;
    private int intentos = 1;
    
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
            java.util.logging.Logger.getLogger(FrmAdivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdivinar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtIntentos;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
