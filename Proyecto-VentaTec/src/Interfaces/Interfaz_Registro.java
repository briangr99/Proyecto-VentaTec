/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modulos.ConexionBD;

/**
 *
 * @author Inovatec
 */



public class Interfaz_Registro extends javax.swing.JInternalFrame {
    ConexionBD con = new ConexionBD();
    /**
     * Creates new form Interfaz_Registro
     */
    public Interfaz_Registro() {
        initComponents();
        this.setTitle("Registro");
       //this.setLocationRelativeTo(null);
    }

    public void ini(){
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

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubT = new javax.swing.JLabel();
        jspTitulo = new javax.swing.JSeparator();
        lblSubT1 = new javax.swing.JLabel();
        lblID_Pro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jspNombre = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jspDescripcion = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        jspPrecio = new javax.swing.JSeparator();
        txtCosto = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        jspCosto = new javax.swing.JSeparator();
        lblCategoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jspStock = new javax.swing.JSeparator();
        lblPresentacion = new javax.swing.JLabel();
        cmbPresentacion = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        cmbProvedor = new javax.swing.JComboBox();
        lblNombre1 = new javax.swing.JLabel();
        lblProvedor = new javax.swing.JLabel();
        txtID_Producto = new javax.swing.JTextField();
        jspID_Prod = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(223, 223, 223));
        jPanel1.setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(66, 65, 70));
        lblTitulo.setText("Campos Obligatorios *");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(130, 410, 210, 30);

        lblSubT.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblSubT.setForeground(new java.awt.Color(66, 65, 70));
        lblSubT.setText("Registrar Nuevo Producto");
        jPanel1.add(lblSubT);
        lblSubT.setBounds(20, 10, 320, 30);

        jspTitulo.setBackground(new java.awt.Color(99, 99, 101));
        jspTitulo.setForeground(new java.awt.Color(99, 99, 101));
        jspTitulo.setDoubleBuffered(true);
        jspTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jspTitulo.setMinimumSize(new java.awt.Dimension(650, 5));
        jspTitulo.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel1.add(jspTitulo);
        jspTitulo.setBounds(0, 40, 620, 10);

        lblSubT1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblSubT1.setForeground(new java.awt.Color(66, 65, 70));
        lblSubT1.setText("Producto:");
        jPanel1.add(lblSubT1);
        lblSubT1.setBounds(40, 50, 90, 30);

        lblID_Pro.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblID_Pro.setForeground(new java.awt.Color(66, 65, 70));
        lblID_Pro.setText("Codigo Barra: *");
        jPanel1.add(lblID_Pro);
        lblID_Pro.setBounds(130, 80, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/PUPKING.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 50, 101, 94);

        btnGuardar.setBackground(new java.awt.Color(78, 193, 188));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/Guardar.png"))); // NOI18N
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        jPanel1.add(btnGuardar);
        btnGuardar.setBounds(530, 0, 90, 40);

        jspNombre.setBackground(new java.awt.Color(99, 99, 101));
        jspNombre.setForeground(new java.awt.Color(99, 99, 101));
        jspNombre.setDoubleBuffered(true);
        jPanel1.add(jspNombre);
        jspNombre.setBounds(270, 170, 120, 20);

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setBorder(null);
        txtNombre.setOpaque(false);
        txtNombre.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        jPanel1.add(txtNombre);
        txtNombre.setBounds(270, 150, 120, 22);

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(102, 102, 102));
        txtDescripcion.setBorder(null);
        txtDescripcion.setOpaque(false);
        txtDescripcion.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        jPanel1.add(txtDescripcion);
        txtDescripcion.setBounds(230, 180, 240, 22);

        lblDescripcion.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(66, 65, 70));
        lblDescripcion.setText("Descripción:");
        jPanel1.add(lblDescripcion);
        lblDescripcion.setBounds(130, 180, 110, 30);

        jspDescripcion.setBackground(new java.awt.Color(99, 99, 101));
        jspDescripcion.setForeground(new java.awt.Color(99, 99, 101));
        jspDescripcion.setDoubleBuffered(true);
        jPanel1.add(jspDescripcion);
        jspDescripcion.setBounds(230, 200, 240, 20);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecio.setBorder(null);
        txtPrecio.setOpaque(false);
        txtPrecio.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(240, 220, 80, 22);

        lblPrecio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(66, 65, 70));
        lblPrecio.setText("*Precio:          $");
        jPanel1.add(lblPrecio);
        lblPrecio.setBounds(130, 220, 110, 30);

        jspPrecio.setBackground(new java.awt.Color(99, 99, 101));
        jspPrecio.setForeground(new java.awt.Color(99, 99, 101));
        jspPrecio.setDoubleBuffered(true);
        jPanel1.add(jspPrecio);
        jspPrecio.setBounds(240, 240, 80, 20);

        txtCosto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(102, 102, 102));
        txtCosto.setBorder(null);
        txtCosto.setOpaque(false);
        txtCosto.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCosto);
        txtCosto.setBounds(240, 250, 220, 22);

        lblCosto.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(66, 65, 70));
        lblCosto.setText("*Costo:           $");
        jPanel1.add(lblCosto);
        lblCosto.setBounds(130, 250, 110, 30);

        jspCosto.setBackground(new java.awt.Color(99, 99, 101));
        jspCosto.setForeground(new java.awt.Color(99, 99, 101));
        jspCosto.setDoubleBuffered(true);
        jPanel1.add(jspCosto);
        jspCosto.setBounds(240, 270, 80, 20);

        lblCategoria.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(66, 65, 70));
        lblCategoria.setText("*Categoria del Producto: ");
        jPanel1.add(lblCategoria);
        lblCategoria.setBounds(130, 280, 180, 40);

        cmbCategoria.setOpaque(false);
        jPanel1.add(cmbCategoria);
        cmbCategoria.setBounds(310, 290, 150, 20);

        lblStock.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(66, 65, 70));
        lblStock.setText("*Cantidad:");
        jPanel1.add(lblStock);
        lblStock.setBounds(130, 320, 80, 30);

        txtStock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtStock.setForeground(new java.awt.Color(102, 102, 102));
        txtStock.setBorder(null);
        txtStock.setOpaque(false);
        txtStock.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        jPanel1.add(txtStock);
        txtStock.setBounds(210, 320, 120, 22);

        jspStock.setBackground(new java.awt.Color(99, 99, 101));
        jspStock.setForeground(new java.awt.Color(99, 99, 101));
        jspStock.setDoubleBuffered(true);
        jPanel1.add(jspStock);
        jspStock.setBounds(210, 340, 120, 20);

        lblPresentacion.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblPresentacion.setForeground(new java.awt.Color(66, 65, 70));
        lblPresentacion.setText("*Presentación: ");
        jPanel1.add(lblPresentacion);
        lblPresentacion.setBounds(130, 360, 180, 40);

        cmbPresentacion.setOpaque(false);
        jPanel1.add(cmbPresentacion);
        cmbPresentacion.setBounds(250, 370, 210, 20);

        btnRegresar.setBackground(new java.awt.Color(255, 153, 0));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/regreso-NegroF.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnRegresar);
        btnRegresar.setBounds(430, 460, 160, 45);

        jPanel1.add(cmbProvedor);
        cmbProvedor.setBounds(240, 130, 120, 20);

        lblNombre1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(66, 65, 70));
        lblNombre1.setText("*Nombre Producto: ");
        jPanel1.add(lblNombre1);
        lblNombre1.setBounds(130, 150, 150, 30);

        lblProvedor.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblProvedor.setForeground(new java.awt.Color(66, 65, 70));
        lblProvedor.setText("*Proveedor: *");
        jPanel1.add(lblProvedor);
        lblProvedor.setBounds(130, 120, 100, 30);

        txtID_Producto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtID_Producto.setForeground(new java.awt.Color(102, 102, 102));
        txtID_Producto.setBorder(null);
        txtID_Producto.setOpaque(false);
        txtID_Producto.setSelectedTextColor(new java.awt.Color(66, 65, 70));
        jPanel1.add(txtID_Producto);
        txtID_Producto.setBounds(240, 82, 120, 22);

        jspID_Prod.setBackground(new java.awt.Color(99, 99, 101));
        jspID_Prod.setForeground(new java.awt.Color(99, 99, 101));
        jspID_Prod.setDoubleBuffered(true);
        jPanel1.add(jspID_Prod);
        jspID_Prod.setBounds(240, 100, 120, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Registro().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JComboBox<String> cmbCategoria;
    public javax.swing.JComboBox<String> cmbPresentacion;
    public javax.swing.JComboBox cmbProvedor;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jspCosto;
    private javax.swing.JSeparator jspDescripcion;
    private javax.swing.JSeparator jspID_Prod;
    private javax.swing.JSeparator jspNombre;
    private javax.swing.JSeparator jspPrecio;
    private javax.swing.JSeparator jspStock;
    private javax.swing.JSeparator jspTitulo;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblID_Pro;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPresentacion;
    private javax.swing.JLabel lblProvedor;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblSubT;
    private javax.swing.JLabel lblSubT1;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtCosto;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtID_Producto;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
