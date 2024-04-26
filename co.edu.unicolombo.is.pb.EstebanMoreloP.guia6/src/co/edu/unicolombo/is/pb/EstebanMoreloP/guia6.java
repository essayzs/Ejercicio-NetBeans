
package co.edu.unicolombo.is.pb.EstebanMoreloP;

import javax.swing.DefaultComboBoxModel;

public class guia6 extends javax.swing.JFrame {

    /**
     * Creates new form guia6
     */
    public guia6() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboNumeros = new javax.swing.JComboBox<>();
        btnPares = new javax.swing.JButton();
        btnImpares = new javax.swing.JButton();
        etiResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNumerosActionPerformed(evt);
            }
        });

        btnPares.setText("Pares");
        btnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParesActionPerformed(evt);
            }
        });

        btnImpares.setText("Impares");
        btnImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImparesActionPerformed(evt);
            }
        });

        etiResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etiResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImpares)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPares)
                    .addComponent(btnImpares))
                .addGap(97, 97, 97)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParesActionPerformed
        // TODO add your handling code here:
        int i;
       
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();

        for (i=0;i<10;i+=2) {
           modelo.addElement("Nº "+i);
        }
        cboNumeros.setModel(modelo);

    }//GEN-LAST:event_btnParesActionPerformed

    private void btnImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImparesActionPerformed
        // TODO add your handling code here:
        int i;
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();

        for (i=1;i<10;i+=2) {
           modelo.addElement("Nº "+i);
        }

        cboNumeros.setModel(modelo);

    }//GEN-LAST:event_btnImparesActionPerformed

    private void cboNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumerosActionPerformed
        // TODO add your handling code here:
        etiResultado.setText(cboNumeros.getSelectedItem().toString());
    }//GEN-LAST:event_cboNumerosActionPerformed

    
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
            java.util.logging.Logger.getLogger(guia6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpares;
    private javax.swing.JButton btnPares;
    private javax.swing.JComboBox<String> cboNumeros;
    private javax.swing.JLabel etiResultado;
    // End of variables declaration//GEN-END:variables
}
