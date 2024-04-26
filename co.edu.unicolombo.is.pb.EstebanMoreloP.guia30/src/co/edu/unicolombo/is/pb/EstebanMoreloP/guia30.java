package co.edu.unicolombo.is.pb.EstebanMoreloP;

import javax.swing.JOptionPane;


public class guia30 extends javax.swing.JFrame {

    SalaCine Central;
    SalaCine vo;
    public guia30() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Central = new SalaCine();
        vo = new SalaCine();
        
        Central.setAforo(500);
        Central.setEntrada(8.0);
        
        vo.setAforo(80);
        vo.setEntrada(6.0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCentralNueva = new javax.swing.JButton();
        btnCentralOcupacion = new javax.swing.JButton();
        btnCentralVaciar = new javax.swing.JButton();
        btnCentralIngresos = new javax.swing.JButton();
        etiCentralPelicula = new javax.swing.JLabel();
        btnCentralCambiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelVOriginal = new javax.swing.JPanel();
        btnOriginalNueva = new javax.swing.JButton();
        btnOriginalOcupacion = new javax.swing.JButton();
        btnOriginalVaciar = new javax.swing.JButton();
        btnOriginalIngresos = new javax.swing.JButton();
        etiOriginalPelicula = new javax.swing.JLabel();
        btnOriginalCambiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresosTotales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCentral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pelicula: ");

        btnCentralNueva.setText("Nueva Venta");
        btnCentralNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralNuevaActionPerformed(evt);
            }
        });

        btnCentralOcupacion.setText("% Ocupacion");
        btnCentralOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralOcupacionActionPerformed(evt);
            }
        });

        btnCentralVaciar.setText("Vaciar");
        btnCentralVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralVaciarActionPerformed(evt);
            }
        });

        btnCentralIngresos.setText("Ingresos");
        btnCentralIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralIngresosActionPerformed(evt);
            }
        });

        etiCentralPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCentralCambiar.setText("Cambiar");
        btnCentralCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralCambiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel3.setText("SALA CENTRAL");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnCentralNueva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnCentralOcupacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnCentralVaciar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCentralIngresos))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCentralCambiar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCentralCambiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentralNueva)
                    .addComponent(btnCentralOcupacion)
                    .addComponent(btnCentralVaciar)
                    .addComponent(btnCentralIngresos))
                .addGap(35, 35, 35))
        );

        panelVOriginal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOriginalNueva.setText("Nueva Venta");
        btnOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalNuevaActionPerformed(evt);
            }
        });

        btnOriginalOcupacion.setText("% Ocupacion");
        btnOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalOcupacionActionPerformed(evt);
            }
        });

        btnOriginalVaciar.setText("Vaciar");
        btnOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalVaciarActionPerformed(evt);
            }
        });

        btnOriginalIngresos.setText("Ingresos");
        btnOriginalIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalIngresosActionPerformed(evt);
            }
        });

        etiOriginalPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOriginalCambiar.setText("Cambiar");

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel5.setText("SALA VERSION ORIGINAL");

        jLabel6.setText("Pelicula: ");

        javax.swing.GroupLayout panelVOriginalLayout = new javax.swing.GroupLayout(panelVOriginal);
        panelVOriginal.setLayout(panelVOriginalLayout);
        panelVOriginalLayout.setHorizontalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(btnOriginalNueva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVOriginalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnOriginalOcupacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnOriginalVaciar)
                                .addGap(18, 18, 18)
                                .addComponent(btnOriginalIngresos))
                            .addGroup(panelVOriginalLayout.createSequentialGroup()
                                .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOriginalCambiar)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelVOriginalLayout.setVerticalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(etiOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnOriginalCambiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOriginalNueva)
                    .addComponent(btnOriginalOcupacion)
                    .addComponent(btnOriginalVaciar)
                    .addComponent(btnOriginalIngresos))
                .addGap(35, 35, 35))
        );

        btnIngresosTotales.setText("Ingresos Totales");
        btnIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelVOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIngresosTotales)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnIngresosTotales)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalNuevaActionPerformed
        // TODO add your handling code here:
        
        String titulo;
        
        titulo = JOptionPane.showInputDialog("Introduce el titulo de la movie: ");
        vo.setPelicula(titulo);
        etiOriginalPelicula.setText(titulo);
    }//GEN-LAST:event_btnOriginalNuevaActionPerformed

    private void btnOriginalIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalIngresosActionPerformed
        // TODO add your handling code here:
        
        String info;
        
        info = "Ingresos de la sala: " + vo.getIngresos() + " Pesos";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalIngresosActionPerformed

    private void btnCentralCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralCambiarActionPerformed
        // TODO add your handling code here:
        
        String titulo;
        
        titulo = JOptionPane.showInputDialog("Introduce el titulo de la movie: ");
        Central.setPelicula(titulo);
        etiCentralPelicula.setText(titulo);
    }//GEN-LAST:event_btnCentralCambiarActionPerformed

    private void btnCentralNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralNuevaActionPerformed
        // TODO add your handling code here:
        Central.entraUno();
    }//GEN-LAST:event_btnCentralNuevaActionPerformed

    private void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalOcupacionActionPerformed
        // TODO add your handling code here:
        
        String info;
        
        info = "Sala Central\n";
        info = info + "Pelicula: " + vo.getPelicula() + "\n";
        info = info + "Aforo: " + vo.getAforo()+ "\n";
        info = info + "Ocupádas: " + vo.getOcupadas()+ "\n";
        info = info + "Libres: " + vo.getLibres()+ "\n";
        info = info + "Porcentaje Ocupacion: " + vo.getPorcentaje()+ "\n";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalOcupacionActionPerformed

    private void btnCentralOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralOcupacionActionPerformed
        // TODO add your handling code here:
        
        String info;
        
        info = "Sala Central\n";
        info = info + "Pelicula: " + Central.getPelicula() + "\n";
        info = info + "Aforo: " + Central.getAforo()+ "\n";
        info = info + "Ocupádas: " + Central.getOcupadas()+ "\n";
        info = info + "Libres: " + Central.getLibres()+ "\n";
        info = info + "Porcentaje Ocupacion: " + Central.getPorcentaje()+ "\n";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralOcupacionActionPerformed

    private void btnCentralVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralVaciarActionPerformed
        // TODO add your handling code here:
        
        Central.Vaciar();
        etiCentralPelicula.setText("");
    }//GEN-LAST:event_btnCentralVaciarActionPerformed

    private void btnCentralIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralIngresosActionPerformed
        // TODO add your handling code here:
        
        String info;
        
        info = "Ingresos de la sala: " + Central.getIngresos() + " Pesos";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralIngresosActionPerformed

    private void btnOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalVaciarActionPerformed
        // TODO add your handling code here:
        
        vo.Vaciar();
        etiOriginalPelicula.setText("");
    }//GEN-LAST:event_btnOriginalVaciarActionPerformed

    private void btnIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosTotalesActionPerformed
        // TODO add your handling code here:
        
        int sum= (int) (Central.getIngresos() + vo.getIngresos());
        
        JOptionPane.showMessageDialog(null, "El total de los ingresos es: " + sum);
    }//GEN-LAST:event_btnIngresosTotalesActionPerformed


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
            java.util.logging.Logger.getLogger(guia30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia30().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentralCambiar;
    private javax.swing.JButton btnCentralIngresos;
    private javax.swing.JButton btnCentralNueva;
    private javax.swing.JButton btnCentralOcupacion;
    private javax.swing.JButton btnCentralVaciar;
    private javax.swing.JButton btnIngresosTotales;
    private javax.swing.JButton btnOriginalCambiar;
    private javax.swing.JButton btnOriginalIngresos;
    private javax.swing.JButton btnOriginalNueva;
    private javax.swing.JButton btnOriginalOcupacion;
    private javax.swing.JButton btnOriginalVaciar;
    private javax.swing.JLabel etiCentralPelicula;
    private javax.swing.JLabel etiOriginalPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelVOriginal;
    // End of variables declaration//GEN-END:variables
}
