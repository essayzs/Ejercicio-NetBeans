package co.edu.unicolombo.is.pb.EstebanMoreloP;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;


public class guia23 extends javax.swing.JFrame {

    JLabel etiTexto;
    JLabel etiZona;
    
    public guia23() {
        initComponents();
        CreacionVentana();
    }

    public void CreacionVentana(){
        
        this.setTitle("Programacion de eventos del raton");
        this.setSize(400,400);
        this.setLocation(100,100);
        
        etiTexto = new JLabel();
        etiTexto.setText("---");
        etiTexto.setBounds(50,10,300,20);
        this.getContentPane().add(etiTexto);
        
        etiZona = new JLabel();
        etiZona.setText("");
        etiZona.setOpaque(true);
        etiZona.setBackground(Color.red);
        etiZona.setBounds(50,50,300,250);
        this.getContentPane().add(etiZona);
        
         etiTexto.addMouseListener(new MouseAdapter() {

	public void mouseEntered(MouseEvent evt) {
            etiTextoMouseEntered(evt);
	}

	public void mouseExited(MouseEvent evt) {
            etiTextoMouseExited(evt);
	}

	public void mousePressed(MouseEvent evt) {
            etiTextoMousePressed(evt);
	}
            });
        }
    
            private void etiTextoMouseEntered(MouseEvent evt) {
                etiTexto.setText("El raton acaba de entrar");
            }

            private void etiTextoMouseExited(MouseEvent evt) {
                etiTexto.setText("El raton salio");

            }

            private void etiTextoMousePressed(MouseEvent evt) {
                etiTexto.setText("Se acaba de pulsar un boton del raton");
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
            java.util.logging.Logger.getLogger(guia23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia23.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia23().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
