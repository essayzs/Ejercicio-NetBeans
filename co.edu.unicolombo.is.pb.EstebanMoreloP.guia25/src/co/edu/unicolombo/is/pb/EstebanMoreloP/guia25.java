package co.edu.unicolombo.is.pb.EstebanMoreloP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class guia25 extends javax.swing.JFrame {
    
    JCheckBox vcuadros[];
    JButton btnAceptar;
    
    public guia25() {
        initComponents();
        CreacionVentana();
        this.setLocationRelativeTo(null);
    }
    
    public void CreacionVentana(){
        
        this.setTitle("Ejemplo de vector de componentes");
        this.setSize(300,600);
        
        vcuadros = new JCheckBox[10];
        
        String vtexto[]= {"rojo", "azul", "blanco", "naranja",
        "amarillo", "gris", "morado", "cafe", "verde", "rosa"};
        
        int i;
        
        for (i = 0; i < vcuadros.length; i++) {
            vcuadros[i] = new JCheckBox();
            vcuadros[i].setText(vtexto[i]);
            vcuadros[i].setBounds(10, 10+30*i,  100, 20);
            this.getContentPane().add(vcuadros[i]);
        }
        
        btnAceptar = new JButton();
        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(10, 360, 100, 20);
        this.getContentPane().add(btnAceptar);
        
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
          });
    }
    private void btnAceptarActionPerformed(ActionEvent evt) {
        int cont=0;
        
        for (int i = 0; i < vcuadros.length; i++) {
            if (vcuadros[i].isSelected()) {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay" + cont + "cuadros seleccionados");
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
            java.util.logging.Logger.getLogger(guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
