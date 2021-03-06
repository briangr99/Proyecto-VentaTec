/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Paquetes e importaciones - vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
package Interfaces;
import Manejadores.Manejador_InicioSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
// Paquetes e importaciones - ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
/**
 *
 * @author INOVATEC
 */
public class Interfaz_InicioSesion extends javax.swing.JFrame {
    Manejador_InicioSesion   iniciar;
    /**
     * Creates new form ventana_Login
     */
    public Interfaz_InicioSesion() {
        initComponents();  
        setLocationRelativeTo(this);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lbl_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion.");
        setBackground(new java.awt.Color(223, 223, 223));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png")).getImage());

        pnLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnLogin.setForeground(new java.awt.Color(66, 65, 70));
        pnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pnLogin.setLayout(null);

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setBorder(null);
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        pnLogin.add(txtUser);
        txtUser.setBounds(83, 158, 260, 25);

        lblPassword.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("Contraseña:");
        pnLogin.add(lblPassword);
        lblPassword.setBounds(80, 210, 110, 24);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        pnLogin.add(txtPassword);
        txtPassword.setBounds(83, 238, 260, 25);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setDoubleBuffered(true);
        pnLogin.add(jSeparator1);
        jSeparator1.setBounds(83, 268, 260, 2);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setDoubleBuffered(true);
        pnLogin.add(jSeparator2);
        jSeparator2.setBounds(83, 188, 260, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png"))); // NOI18N
        pnLogin.add(jLabel1);
        jLabel1.setBounds(0, 0, 102, 112);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/password2_45px.png"))); // NOI18N
        pnLogin.add(jLabel2);
        jLabel2.setBounds(30, 220, 45, 45);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/UserName45px.png"))); // NOI18N
        pnLogin.add(jLabel3);
        jLabel3.setBounds(30, 150, 45, 45);

        lblUser1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(204, 204, 204));
        lblUser1.setText("Usuario:");
        pnLogin.add(lblUser1);
        lblUser1.setBounds(80, 130, 120, 24);

        btnLogin.setBackground(new java.awt.Color(78, 193, 188));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/Login2.png"))); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnLogin.add(btnLogin);
        btnLogin.setBounds(160, 290, 100, 50);

        btn_Salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/bonito_1.png"))); // NOI18N
        btn_Salir.setName("btn_Usuarios"); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        pnLogin.add(btn_Salir);
        btn_Salir.setBounds(330, 310, 50, 40);

        lblUser2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(204, 204, 204));
        lblUser2.setText("Ultramarinos");
        pnLogin.add(lblUser2);
        lblUser2.setBounds(100, 10, 120, 30);

        lblUser3.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        lblUser3.setForeground(new java.awt.Color(204, 204, 204));
        lblUser3.setText("\"Los Ayala\"");
        pnLogin.add(lblUser3);
        lblUser3.setBounds(110, 40, 100, 30);

        lbl_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background_InicioSesion.png"))); // NOI18N
        pnLogin.add(lbl_Background);
        lbl_Background.setBounds(0, -10, 400, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Funciones de la interfaz-vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
     */  
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        iniciar = new Manejador_InicioSesion(txtUser.getText(),new String(txtPassword.getPassword()),this);
        if(iniciar.Estatus()){this.dispose();}
    }//GEN-LAST:event_btnLoginActionPerformed
    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            iniciar = new Manejador_InicioSesion(txtUser.getText(),new String(txtPassword.getPassword()),this);
            if(iniciar.Estatus()){this.dispose();}
        }
    }//GEN-LAST:event_txtPasswordKeyPressed
    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            iniciar = new Manejador_InicioSesion(txtUser.getText(),new String(txtPassword.getPassword()),this);
            if(iniciar.Estatus()){this.dispose();}
        }
    }//GEN-LAST:event_txtUserKeyPressed
    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.btn_Salir.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
               System.exit(0);
           } 
        });
    }//GEN-LAST:event_btn_SalirActionPerformed
    /**
     * Funciones de la interfaz-^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
     */  
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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz_InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lbl_Background;
    public javax.swing.JPanel pnLogin;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
