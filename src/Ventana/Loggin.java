/*
 * 
 */
package Ventana;
import Ventana.Ventana2;
import Ventana.registroAdmin;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author kidiwnjt
 */
public class Loggin extends javax.swing.JFrame {
    private Component Confirmacion;
    private String password;
    private String usr3;
    private String contras3;
    String usa;
    String Contraseña;

    //public Loggin(String Usuario, String contraseña) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
   // }
    
    
    
    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        this.setLocationRelativeTo(null);//Centrar La ventana al iniciar la interfaf
     //   jPasswordField.setFocusable(true);
    }
    @Override
     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/taller.png"));
        return retValue;
    }

    /**
    .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginfg = new javax.swing.JLabel();
        txtpasword = new javax.swing.JPasswordField();
        jLabel1contraseña = new javax.swing.JLabel();
        jButton1secion = new javax.swing.JButton();
        regis = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        entrar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoPeque.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        loginfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Avatar4(1).png"))); // NOI18N
        jPanel1.add(loginfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtpasword.setBackground(new java.awt.Color(254, 254, 254));
        txtpasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 150, 20));

        jLabel1contraseña.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel1contraseña.setForeground(new java.awt.Color(1, 6, 8));
        jLabel1contraseña.setText("Password:");
        jPanel1.add(jLabel1contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 80, -1));

        jButton1secion.setBackground(new java.awt.Color(254, 254, 254));
        jButton1secion.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        jButton1secion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unlock.png"))); // NOI18N
        jButton1secion.setBorderPainted(false);
        jButton1secion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1secionActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1secion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 50, 50));

        regis.setBackground(new java.awt.Color(254, 254, 254));
        regis.setForeground(new java.awt.Color(254, 254, 254));
        regis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registrer.png"))); // NOI18N
        regis.setBorderPainted(false);
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });
        jPanel1.add(regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 60, 50));

        Salir.setBackground(new java.awt.Color(241, 245, 248));
        Salir.setFont(new java.awt.Font("Likhan", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion(1).png"))); // NOI18N
        Salir.setBorderPainted(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 50, 50));
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 362, 130, 30));

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("User name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // Botton de salir del programa
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed
/**
 * 
 * @param Evalua como se encuentra la contraseña Actualmente
 */
    private void jButton1secionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1secionActionPerformed
        // si la contraseña esta invalida no puede accesar
        // si esta vacio tampoco puede accesar
        Registro_log tm = new Registro_log();
        contras3=tm.getContraseña();
        usr3=tm.getUsuario();
        if(tm.getUsuario().equals("")){
            JOptionPane.showMessageDialog(this,"Error \nNo se encuentra nadie registrado en la base de datos");
            txtpasword.setFocusable(true);
        }else{
        if(contras3.equals(txtpasword.getText()) || usr3.equals(entrar.getText())){
            Ventana2 st = new Ventana2();
            st.setVisible(true);
            this.dispose();
        }else if(txtpasword.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Contraseña Vacia \nIngese nuevamente");
            txtpasword.setFocusable(true);
        }else if( txtpasword.getText().compareTo(password)!=0){
            JOptionPane.showMessageDialog(this,"Contraseña Incorrecta \nIngese nuevamente");
            txtpasword.setFocusable(true);
        }
    }//GEN-LAST:event_jButton1secionActionPerformed
    }
    private void txtpaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaswordActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        // TODO add your handling code here:
        registroAdmin st = new registroAdmin();
            st.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_regisActionPerformed

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
    private javax.swing.JTextField entrar;
    private javax.swing.JButton jButton1secion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1contraseña;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginfg;
    private javax.swing.JButton regis;
    private javax.swing.JPasswordField txtpasword;
    // End of variables declaration//GEN-END:variables

    
}
