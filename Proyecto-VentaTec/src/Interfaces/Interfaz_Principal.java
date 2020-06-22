/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Manejadores.*;
import Modulos.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author InovaTec
 */
public class Interfaz_Principal extends javax.swing.JFrame implements Runnable{
    public char Tipo_Usuario;
    public Interfaz_Inventario INN = new Interfaz_Inventario();
    public Interfaz_Documentacion IDD = new Interfaz_Documentacion();
    public Interfaz_Venta IVV = new Interfaz_Venta();
    public Interfaz_Registro IRR = new Interfaz_Registro();
        
        
    /**
     * Creates new form Principal
     */
    public Interfaz_Principal(){
        IniCom();
        lblFecha.setText(fechaSystem());
        h1=new Thread(this);
        h1.start();
    }
    
    public void IniCom(){
        initComponents();
        this.setSize(1259, 700);
        
        this.getContentPane().setBackground(new Color(223, 223, 223));
        Jpanel_Botones.setBackground(new Color(223, 223 ,223));
        //JPanel_Principal.setBackground(new Color(177,216,211));
        //JPanel_Principal.setBackground(new Color(99,208,205));
        JPanel_Principal.setBackground(new Color(223, 223, 223));
        jPanel1.setBackground(new Color(223, 223, 223));
        /*99; 208; 205*/
        Ventana_JPanelPrincipal.add(INN);
        Ventana_JPanelPrincipal.add(IRR);
        Ventana_JPanelPrincipal.add(IDD);
        //Ventana_JPanelPrincipal.add(IVV);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_Botones = new javax.swing.JPanel();
        btn_VentanaDocumentos = new javax.swing.JButton();
        btn_AbrirCaja = new javax.swing.JButton();
        btn_VentanaRegistrarProducto = new javax.swing.JButton();
        btn_CerrarSesion = new javax.swing.JButton();
        btn_VentanaInventario = new javax.swing.JButton();
        btn_VentanaNuevaVenta = new javax.swing.JButton();
        btn_CerrarCaja = new javax.swing.JButton();
        btn_CrearUsuario = new javax.swing.JButton();
        Ventana_JPanelPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        JPanel_Principal = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lbl_IconoEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VentaTec - Abarrotes \"Los Ayala\"");
        setBackground(new java.awt.Color(177, 216, 211));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png")).getImage());
        getContentPane().setLayout(null);

        Jpanel_Botones.setBackground(new java.awt.Color(51, 204, 0));
        Jpanel_Botones.setForeground(new java.awt.Color(102, 255, 102));

        btn_VentanaDocumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Documentos.png"))); // NOI18N
        btn_VentanaDocumentos.setText("Documentos");
        btn_VentanaDocumentos.setName("btn_Rendimiento"); // NOI18N

        btn_AbrirCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/CAJAGUARDAR_2.png"))); // NOI18N
        btn_AbrirCaja.setName("btn_Usuarios"); // NOI18N

        btn_VentanaRegistrarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_RegistrarProducto.png"))); // NOI18N
        btn_VentanaRegistrarProducto.setText("Registrar Producto");
        btn_VentanaRegistrarProducto.setName("btn_RegistrarProducto"); // NOI18N
        btn_VentanaRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentanaRegistrarProductoActionPerformed(evt);
            }
        });

        btn_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Salir.png"))); // NOI18N
        btn_CerrarSesion.setText("Cerrar Sesión");
        btn_CerrarSesion.setToolTipText("Salir");
        btn_CerrarSesion.setName("btn_CerrarSesion"); // NOI18N
        btn_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarSesionActionPerformed(evt);
            }
        });

        btn_VentanaInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_Inventario.png"))); // NOI18N
        btn_VentanaInventario.setText("Inventario");
        btn_VentanaInventario.setToolTipText("Facturas & Recibos");
        btn_VentanaInventario.setName("btn_Recibos"); // NOI18N

        btn_VentanaNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/icon_NuevaVenta.png"))); // NOI18N
        btn_VentanaNuevaVenta.setText("Nueva Venta!");
        btn_VentanaNuevaVenta.setToolTipText("");
        btn_VentanaNuevaVenta.setName("btn_NuevaVenta"); // NOI18N
        btn_VentanaNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VentanaNuevaVentaActionPerformed(evt);
            }
        });

        btn_CerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/CERRARCAJA.png"))); // NOI18N
        btn_CerrarCaja.setName("btn_Usuarios"); // NOI18N

        btn_CrearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/inicioseses.png"))); // NOI18N
        btn_CrearUsuario.setText("Crear Usuario");
        btn_CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Jpanel_BotonesLayout = new javax.swing.GroupLayout(Jpanel_Botones);
        Jpanel_Botones.setLayout(Jpanel_BotonesLayout);
        Jpanel_BotonesLayout.setHorizontalGroup(
            Jpanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Jpanel_BotonesLayout.createSequentialGroup()
                        .addComponent(btn_AbrirCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_CerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_VentanaRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_VentanaDocumentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_VentanaInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_VentanaNuevaVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        Jpanel_BotonesLayout.setVerticalGroup(
            Jpanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_AbrirCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(btn_VentanaNuevaVenta)
                .addGap(1, 1, 1)
                .addComponent(btn_VentanaRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btn_VentanaDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_VentanaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_CrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(226, 226, 226))
        );

        getContentPane().add(Jpanel_Botones);
        Jpanel_Botones.setBounds(10, 0, 220, 640);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        JPanel_Principal.setBackground(new java.awt.Color(0, 255, 0));
        JPanel_Principal.setLayout(null);

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel_Principal.add(lblFecha);
        lblFecha.setBounds(820, 600, 160, 29);

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel_Principal.add(lblHora);
        lblHora.setBounds(820, 550, 160, 29);

        lbl_IconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_InterfazPrincipal/background.jpg"))); // NOI18N
        JPanel_Principal.add(lbl_IconoEmpresa);
        lbl_IconoEmpresa.setBounds(0, 0, 1010, 730);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JPanel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        Ventana_JPanelPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Ventana_JPanelPrincipalLayout = new javax.swing.GroupLayout(Ventana_JPanelPrincipal);
        Ventana_JPanelPrincipal.setLayout(Ventana_JPanelPrincipalLayout);
        Ventana_JPanelPrincipalLayout.setHorizontalGroup(
            Ventana_JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Ventana_JPanelPrincipalLayout.setVerticalGroup(
            Ventana_JPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ventana_JPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Ventana_JPanelPrincipal);
        Ventana_JPanelPrincipal.setBounds(240, 0, 1010, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CrearUsuarioActionPerformed

    private void btn_VentanaNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentanaNuevaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VentanaNuevaVentaActionPerformed

    private void btn_VentanaRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VentanaRegistrarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_VentanaRegistrarProductoActionPerformed

    private void btn_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Principal ppp = new Interfaz_Principal();
                ppp.setVisible(true);
                //ppp.IniCom();
            }
        });
    }
    
    
    
    String H,M,S,AMPM;
    Calendar  calendario;
    Thread h1;
    
    
    public void run() {
        Thread ct=Thread.currentThread();
        while(ct==h1){
           calcula();
           lblHora.setText(H+":"+M+":"+S + " "+AMPM);
           JPanel_Principal.repaint();
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){}
        }
    }
    
    
    private void calcula() {
        Calendar calendar=new GregorianCalendar();
        Date fechaHoraActual=new Date();
        calendar.setTime(fechaHoraActual);
        AMPM=calendar.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(AMPM.equals("AM")){
            H=calendar.get(Calendar.HOUR_OF_DAY)>9?""+
              calendar.get(Calendar.HOUR_OF_DAY):"0"+
              calendar.get(Calendar.HOUR_OF_DAY);
        }else{
            int h=calendar.get(Calendar.HOUR_OF_DAY)-12;
            H=h>9?""+h:"0"+h;
       }
        M=calendar.get(Calendar.MINUTE)>9?""+
          calendar.get(Calendar.MINUTE):"0"+
          calendar.get(Calendar.MINUTE);
        S=calendar.get(Calendar.SECOND)>9?""+
          calendar.get(Calendar.SECOND):"0"+
          calendar.get(Calendar.SECOND);
    
    }
    
    
     //obtener la hora del SYSTEM VENVATEC :vVLSVKDFBJVBJSDBHNVSDJB
     private static String fechaSystem(){
      Date fecha=new Date();
      SimpleDateFormat formatoF= new SimpleDateFormat("dd/MM/YYYY");
      return formatoF.format(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel JPanel_Principal;
    private javax.swing.JPanel Jpanel_Botones;
    public javax.swing.JDesktopPane Ventana_JPanelPrincipal;
    public javax.swing.JButton btn_AbrirCaja;
    public javax.swing.JButton btn_CerrarCaja;
    public javax.swing.JButton btn_CerrarSesion;
    public javax.swing.JButton btn_CrearUsuario;
    public javax.swing.JButton btn_VentanaDocumentos;
    public javax.swing.JButton btn_VentanaInventario;
    public javax.swing.JButton btn_VentanaNuevaVenta;
    public javax.swing.JButton btn_VentanaRegistrarProducto;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    public javax.swing.JLabel lbl_IconoEmpresa;
    // End of variables declaration//GEN-END:variables
}
