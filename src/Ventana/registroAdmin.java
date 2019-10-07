/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;
import Ventana.Loggin;
import javax.swing.JOptionPane;


/**
 *
 * @author kidiwnjt
 */

public class registroAdmin extends javax.swing.JFrame {
    String usuario;
    String Contraseña;
    /**
     * Constructor General1
     */
  public registroAdmin() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        }
    /**
     *Constructor2 para obtener los datos del usr y password
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contra2 = new javax.swing.JTextField();
        usr1 = new javax.swing.JTextField();
        contra1 = new javax.swing.JTextField();
        cancel = new rojerusan.RSButtonIconI();
        regis = new rojerusan.RSButtonIconI();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoPeque.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Confimar Contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setText("Nombre de Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        contra2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contra2KeyTyped(evt);
            }
        });
        jPanel1.add(contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 190, 30));

        usr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr1ActionPerformed(evt);
            }
        });
        usr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usr1KeyTyped(evt);
            }
        });
        jPanel1.add(usr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, 30));

        contra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contra1KeyTyped(evt);
            }
        });
        jPanel1.add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, 30));

        cancel.setBackground(new java.awt.Color(254, 254, 254));
        cancel.setForeground(new java.awt.Color(117, 117, 117));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        cancel.setText("        Cancelar");
        cancel.setColorHover(new java.awt.Color(255, 22, 0));
        cancel.setColorText(new java.awt.Color(1, 1, 1));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, -1));

        regis.setBackground(new java.awt.Color(254, 254, 254));
        regis.setForeground(new java.awt.Color(117, 117, 117));
        regis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/document.png"))); // NOI18N
        regis.setText("         Registrar");
        regis.setColorHover(new java.awt.Color(0, 255, 16));
        regis.setColorText(new java.awt.Color(1, 1, 1));
        regis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });
        jPanel1.add(regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public registroAdmin(String us, String con) {
     this.usuario= us;
     this.Contraseña= con;
     }
 
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        /**
         * Devuelve ala Ventana del Login
         */
        Loggin volver = new Loggin();
            volver.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelActionPerformed
/**
 * 
 * @param Guarda los datos del Usuario para luego Utilizarlos
 */
    private void saca(){
         Registro_log tm = new Registro_log();
         
    }
    /**
     * Evalua Los textos que se encuentra en el 
     * @param evt 
     */
    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        if(contra1.getText().equals("") && contra2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Espacio Vacia \nIngese nuevamente");
            contra1.setFocusable(true);
        }else{
            if (contra1.getText().equals(contra2.getText())){
             //Devolver ala ventana del Loggin para luego iniciar secion.
             
             JOptionPane.showMessageDialog(null,"Cuenta Creada con Exito",null,
                                    JOptionPane.ERROR_MESSAGE);
             registroAdmin Admin= new registroAdmin( usr1.getText(),  contra2.getText());
             
             Registro_log tm = new Registro_log();
             tm.setUsuario(usr1.getText().trim());
             tm.setContraseña(contra2.getText().trim());
             
             Loggin envio = new Loggin();
             //envio.datos(usuario,Contraseña);
             envio.setVisible(true);
             this.dispose();
        
       
           }else{
           JOptionPane.showMessageDialog(null,"Diferentes \n Ambas deben ser iguales",null,
                                    JOptionPane.ERROR_MESSAGE);
            contra1.setFocusable(true);
            }       
        }
        
         
         
    }//GEN-LAST:event_regisActionPerformed

    private void usr1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usr1KeyTyped
        // Solamente se pueden escribir letras
        char evalua = evt.getKeyChar();
        if((evalua<'a'|| evalua>'z')&&(evalua<'A')|evalua>'Z')evt.consume();
        
    }//GEN-LAST:event_usr1KeyTyped

    private void contra1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contra1KeyTyped
        // unicamente Letras se pueden escribir
        char evalua = evt.getKeyChar();
        if((evalua<'a'|| evalua>'z')&&(evalua<'A')|evalua>'Z')evt.consume();
    }//GEN-LAST:event_contra1KeyTyped

    private void contra2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contra2KeyTyped
        // unicamente lectras se pueden escribir
        char evalua = evt.getKeyChar();
        if((evalua<'a'|| evalua>'z')&&(evalua<'A')|evalua>'Z')evt.consume();
    }//GEN-LAST:event_contra2KeyTyped

    private void usr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usr1ActionPerformed

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
            java.util.logging.Logger.getLogger(registroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI cancel;
    private javax.swing.JTextField contra1;
    private javax.swing.JTextField contra2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSButtonIconI regis;
    private javax.swing.JTextField usr1;
    // End of variables declaration//GEN-END:variables
}
