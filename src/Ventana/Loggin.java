/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author kidiwnjt
 */
public class Loggin extends javax.swing.JFrame {

    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        this.setLocationRelativeTo(null);//Centrar La ventana al iniciar la interfaf
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        loginfg = new javax.swing.JLabel();
        jLabel1contraseña = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1secion = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(java.awt.SystemColor.activeCaption);
        Salir.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        Salir.setText("Exit");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 70, 30));

        loginfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usr2.png"))); // NOI18N
        getContentPane().add(loginfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel1contraseña.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel1contraseña.setForeground(new java.awt.Color(1, 6, 8));
        jLabel1contraseña.setText("Password:");
        getContentPane().add(jLabel1contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 30));

        jPasswordField1.setBackground(new java.awt.Color(4, 0, 185));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 20));

        jButton1secion.setBackground(java.awt.SystemColor.activeCaption);
        jButton1secion.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jButton1secion.setText("Log in");
        getContentPane().add(jButton1secion, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 341, 70, 30));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fond.jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 258, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // Botton de salir del programa
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton jButton1secion;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel1contraseña;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel loginfg;
    // End of variables declaration//GEN-END:variables
}
