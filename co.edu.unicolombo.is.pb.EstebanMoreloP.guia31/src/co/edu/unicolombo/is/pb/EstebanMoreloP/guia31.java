package co.edu.unicolombo.is.pb.EstebanMoreloP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class guia31 extends javax.swing.JFrame {
    
    BotonContador btnBotonA;
    BotonContador btnBotonB;
    BotonContador btnBotonC;

    public guia31() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void CreacionVentana() {
        
        btnBotonA = new BotonContador();
        btnBotonA.setText("Boton A");
        btnBotonA.setBounds(10,10,100,30);
        this.getContentPane().add(btnBotonA);
        
        btnBotonB = new BotonContador();
        btnBotonB.setText("Boton B");
        btnBotonB.setBounds(110,10,100,30);
        this.getContentPane().add(btnBotonA);
        
        btnBotonC = new BotonContador();
        btnBotonC.setText("Boton C");
        btnBotonC.setBounds(50,10,100,30);
        this.getContentPane().add(btnBotonA);
        
        btnBotonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonA(evt);
            }
  
        });    
                
        btnBotonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonB(evt);
            }
   
        });

        btnBotonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonC(evt);
            }
    
        });     

    }
    
    private void PulsacionBotonA(ActionEvent evt) {
        btnBotonA.incrementa();
            }
    
     private void PulsacionBotonB(ActionEvent evt) {
        btnBotonB.incrementa();
            }
     
      private void PulsacionBotonC(ActionEvent evt) {
        btnBotonC.incrementa();
            }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerPulsaciones = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerPulsaciones.setText("Ver Pulsaciones");
        btnVerPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPulsacionesActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reset");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerPulsaciones)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPulsaciones)
                    .addComponent(btnReiniciar))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPulsacionesActionPerformed
        // TODO add your handling code here:
        String info;
        
        info = "El boton A se a pulsado: " + btnBotonA.getPulsaciones() + "\n";
        info = info + "El boton B se a pulsado: " + btnBotonB.getPulsaciones() + "\n";
        info = info + "El boton C se a pulsado: " + btnBotonC.getPulsaciones() + "\n";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnVerPulsacionesActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        btnBotonA.reiniciar();
        btnBotonB.reiniciar();
        btnBotonC.reiniciar();

    }//GEN-LAST:event_btnReiniciarActionPerformed


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
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPulsaciones;
    // End of variables declaration//GEN-END:variables
}
