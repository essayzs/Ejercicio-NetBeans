
package co.edu.unicolombo.is.pb.EstebanMoreloP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class guia26 extends javax.swing.JFrame {

    JButton Vbotones[];
    public guia26() {
        initComponents();
        CreacionVentana();
        this.setLocationRelativeTo(null);
    }

     public void CreacionVentana(){
        
        this.setTitle("Ejemplo de vectores y eventos");
        this.setSize(600,200);
        
        String vtexto[]= {"Aceptar", "Cancelar", "Aplicar", "Cerrar","Salir"};
        
        int i;
        
        for (i = 0; i < Vbotones.length; i++) {
            Vbotones[i] = new JButton();
            Vbotones[i].setText(vtexto[i]);
            Vbotones[i].setBounds(10+i*100, 100, 90, 20);
            this.getContentPane().add(Vbotones[i]);    
        }
        
         for (int j = 0; Vbotones.length < 10; j++) {
             Vbotones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                botonesActionPerformed(evt);
            }
          });
        }
     }
     private void botonesActionPerformed(ActionEvent evt) {
         JButton botonPulsado = (JButton) evt.getSource();
         JOptionPane.showMessageDialog(null, "Haz pulsado el boton " + botonPulsado.getText());
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(guia26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia26.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia26().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
