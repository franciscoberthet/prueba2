/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxempleado;

/**
 *
 * @author alumno
 */
public class Empleado extends javax.swing.JFrame {

    /**
     * Creates new form Empleado
     */
    private String nombre; private String apellido; private String edad; private String dni; private String cargo;
    private String sexo; private String[] intereses = new String[5]  ; private String[] vectorCargos = {"Limpieza","Administrativo","Gerente","Supervisor"};
    private int j = 0;
    public Empleado() {
        initComponents();
        
        for (int i= 0 ; i < 4 ; i++){
            cmbCargo.addItem(vectorCargos[i]);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        rbTrans = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        chqCine = new javax.swing.JCheckBox();
        chqDeportes = new javax.swing.JCheckBox();
        chqMusica = new javax.swing.JCheckBox();
        chqArte = new javax.swing.JCheckBox();
        chqOtros = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEdadKeyReleased(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
        });

        cmbCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCargoItemStateChanged(evt);
            }
        });
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Edad:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI:");

        jLabel5.setText("Cargo:");

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFemenino);
        rbFemenino.setText("Femenino");
        rbFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeninoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTrans);
        rbTrans.setText("Trans");
        rbTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTransActionPerformed(evt);
            }
        });

        jLabel6.setText("Sexo:");

        chqCine.setText("Cine");
        chqCine.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chqCineStateChanged(evt);
            }
        });
        chqCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chqCineActionPerformed(evt);
            }
        });

        chqDeportes.setText("Deportes");
        chqDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chqDeportesActionPerformed(evt);
            }
        });

        chqMusica.setText("Musica");
        chqMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chqMusicaActionPerformed(evt);
            }
        });

        chqArte.setText("Arte");
        chqArte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chqArteActionPerformed(evt);
            }
        });

        chqOtros.setText("Otros");
        chqOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chqOtrosActionPerformed(evt);
            }
        });

        jLabel7.setText("Intereses:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbCargo, 0, 216, Short.MAX_VALUE)
                                .addComponent(txtDni)
                                .addComponent(txtEdad)
                                .addComponent(txtApellido)
                                .addComponent(txtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemenino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chqOtros)
                                    .addComponent(chqArte)
                                    .addComponent(chqMusica)
                                    .addComponent(chqDeportes)
                                    .addComponent(chqCine)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btnAceptar)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino)
                    .addComponent(rbTrans)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chqCine)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chqDeportes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chqMusica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chqArte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chqOtros)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
        if (txtEdad == null){
            edad = "";
        }
    }//GEN-LAST:event_txtEdadActionPerformed

    private void rbFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeninoActionPerformed
           // TODO add your handling code here:
           sexo = rbFemenino.getText();
    }//GEN-LAST:event_rbFemeninoActionPerformed

    private void rbTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTransActionPerformed
        // TODO add your handling code here:
        sexo = rbTrans.getText();
    }//GEN-LAST:event_rbTransActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
       // apellido = txtApellido.getText();        // TODO add your handling code here:
      //  System.out.println(nombre + apellido);
        
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        nombre = txtNombre.getText();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        // TODO add your handling code here:
        apellido = txtApellido.getText();
        
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyReleased
        // TODO add your handling code here:
        edad = String.valueOf(txtEdad.getText());
        System.out.println(edad);
    }//GEN-LAST:event_txtEdadKeyReleased

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        // TODO add your handling code here:
        dni = String.valueOf(txtDni.getText());
        System.out.println(dni);
    }//GEN-LAST:event_txtDniKeyReleased

    private void cmbCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCargoItemStateChanged
        // TODO add your handling code here:
        cargo = String.valueOf(cmbCargo.getSelectedItem());
        System.out.println(cargo);
        System.out.println(sexo);
    }//GEN-LAST:event_cmbCargoItemStateChanged

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
        sexo = rbMasculino.getText();
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void chqCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chqCineActionPerformed
        // TODO add your handling code here:
        /*if (chqCine.isSelected() == true){
        intereses[j] = chqCine.getText();
        j++;
        }
        else {
            
        }
        System.out.println(intereses[j-1]);*/
              
    }//GEN-LAST:event_chqCineActionPerformed

    private void chqCineStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chqCineStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chqCineStateChanged

    private void chqDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chqDeportesActionPerformed
        // TODO add your handling code here:
         /*if (chqDeportes.isSelected() == true){
        intereses[j] = chqDeportes.getText();
        j++;
        }
        else {
            
        }
        System.out.println(intereses[j-1]);*/
    }//GEN-LAST:event_chqDeportesActionPerformed

    private void chqMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chqMusicaActionPerformed
        // TODO add your handling code here:
             /*if (chqMusica.isSelected() == true){
        intereses[j] = chqMusica.getText();
        j++;
        }
        else {
            
        }
        System.out.println(intereses[j-1]);*/
    }//GEN-LAST:event_chqMusicaActionPerformed

    private void chqArteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chqArteActionPerformed
        // TODO add your handling code here:
/*             if (chqArte.isSelected() == true){
        intereses[j] = chqArte.getText();
        j++;
        }
        else {
            
        }
        System.out.println(intereses[j-1]);*/
    }//GEN-LAST:event_chqArteActionPerformed

    private void chqOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chqOtrosActionPerformed
        // TODO add your handling code here:
    /*         if (chqOtros.isSelected() == true){
        intereses[j] = chqOtros.getText();
        j++;
        }
        else {
            
        }
        System.out.println(intereses[j-1]);*/
    }//GEN-LAST:event_chqOtrosActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        sb.append(nombre+"\n");
        sb.append(apellido+"\n");
        sb.append(edad+"\n");
        sb.append(dni+"\n");
        sb.append(cargo+"\n");
        sb.append(sexo+"\n");
        if (chqCine.isSelected() == true){
            sb.append(chqCine.getText()+"\n");
        }
        if (chqDeportes.isSelected() == true){
            sb.append(chqDeportes.getText()+"\n");
        }
        if (chqMusica.isSelected() == true){
            sb.append(chqMusica.getText()+"\n");
        }
        if (chqArte.isSelected() == true){
            sb.append(chqArte.getText()+"\n");
        }
        if (chqOtros.isSelected() == true){
            sb.append(chqOtros.getText()+"\n");
        }
        txtArea.setText(sb.toString());
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chqArte;
    private javax.swing.JCheckBox chqCine;
    private javax.swing.JCheckBox chqDeportes;
    private javax.swing.JCheckBox chqMusica;
    private javax.swing.JCheckBox chqOtros;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbTrans;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
