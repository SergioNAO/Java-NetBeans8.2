/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Acceso
     */
    public Acceso() {
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

        BTNIngresar = new javax.swing.JButton();
        TFUsuario = new javax.swing.JTextField();
        TFContraseña = new javax.swing.JPasswordField();
        etiUsuario = new javax.swing.JLabel();
        etiContraseña = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 500, 500));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Acceoso al Sistema"); // NOI18N
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNIngresar.setText("Ingresar");
        BTNIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 100, -1));
        getContentPane().add(TFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 230, 30));
        getContentPane().add(TFContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 230, 30));

        etiUsuario.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        etiUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiUsuario.setText("Usuario:");
        getContentPane().add(etiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 100, 30));

        etiContraseña.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        etiContraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiContraseña.setText("Contraseña:");
        getContentPane().add(etiContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Acceso/Descargar Pack Wallpaper Gratis Abstractos (330).jpg"))); // NOI18N
        Fondo.setText("Ingresar");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 592, 388));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIngresarActionPerformed
        // TODO add your handling code here:
        String Usuario="Sergio";
        String Contra="12345";
        
        String pass = new String(TFContraseña.getPassword());
        
        if(TFUsuario.getText().equals(Usuario) && pass.equals(Contra) ){
        Sistema ax = new Sistema();
        ax.setVisible(true);
        dispose();
        }
        else{
        JOptionPane.showMessageDialog(this,"Usuario o Contraseña Incorrecta");
        
        }
        
        
    }//GEN-LAST:event_BTNIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNIngresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField TFContraseña;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JLabel etiContraseña;
    private javax.swing.JLabel etiUsuario;
    // End of variables declaration//GEN-END:variables
}
