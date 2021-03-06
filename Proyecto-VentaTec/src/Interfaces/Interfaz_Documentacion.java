package Interfaces;

/**
 *
 * @author INOVATEC
 */
public class Interfaz_Documentacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Interfaz_Documentacion
     */
    public Interfaz_Documentacion() {
        this.setSize(649, 498);
        this.setLocation(100,50);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumento = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        btnImpTicket = new javax.swing.JButton();
        btnPDF = new javax.swing.JButton();
        btnEnviarM = new javax.swing.JButton();
        pnlInformacion = new javax.swing.JPanel();
        lblTP2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTP3 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblUser4 = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblUser6 = new javax.swing.JLabel();
        lblFechaV = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pnlBotonInformacion = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        btnInfoAdicional = new javax.swing.JButton();
        lblUser5 = new javax.swing.JLabel();
        pnlBusqueda = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();
        pnlBotonMenu = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnRegresar = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Documentación");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png"))); // NOI18N

        jPanel1.setLayout(null);

        pnlTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabla.setLayout(null);

        tblDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Ticket", "ID_Venta", "Usuario", "Producto", "Cantidad_Producto", "Descuento", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDocumento);
        if (tblDocumento.getColumnModel().getColumnCount() > 0) {
            tblDocumento.getColumnModel().getColumn(4).setResizable(false);
            tblDocumento.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlTabla.add(jScrollPane1);
        jScrollPane1.setBounds(20, 0, 650, 310);

        jToolBar2.setRollover(true);

        btnImpTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/impresion.png"))); // NOI18N
        btnImpTicket.setText("Imprime Ticket");
        jToolBar2.add(btnImpTicket);

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/pdf.png"))); // NOI18N
        btnPDF.setText("PDF");
        jToolBar2.add(btnPDF);

        btnEnviarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/correo.png"))); // NOI18N
        btnEnviarM.setText("Enviar por Email");
        jToolBar2.add(btnEnviarM);

        pnlTabla.add(jToolBar2);
        jToolBar2.setBounds(10, 330, 650, 70);

        jPanel1.add(pnlTabla);
        pnlTabla.setBounds(0, 110, 670, 410);

        pnlInformacion.setBackground(new java.awt.Color(255, 255, 255));
        pnlInformacion.setLayout(null);

        lblTP2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblTP2.setText("Total:");
        pnlInformacion.add(lblTP2);
        lblTP2.setBounds(10, 10, 100, 19);

        lblTotal.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("$0.00");
        pnlInformacion.add(lblTotal);
        lblTotal.setBounds(0, 29, 200, 40);

        lblTP3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblTP3.setText("SubTotal");
        pnlInformacion.add(lblTP3);
        lblTP3.setBounds(10, 70, 50, 16);

        lblUsuario.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("PRUEBA");
        pnlInformacion.add(lblUsuario);
        lblUsuario.setBounds(60, 130, 140, 20);

        lblSubTotal.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubTotal.setText("$0.00");
        pnlInformacion.add(lblSubTotal);
        lblSubTotal.setBounds(0, 86, 200, 24);

        lblUser4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblUser4.setForeground(new java.awt.Color(102, 102, 102));
        lblUser4.setText("IVA:");
        pnlInformacion.add(lblUser4);
        lblUser4.setBounds(10, 160, 30, 16);

        lblIva.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblIva.setForeground(new java.awt.Color(102, 102, 102));
        lblIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIva.setText("$0.00");
        pnlInformacion.add(lblIva);
        lblIva.setBounds(40, 160, 160, 20);

        lblUser6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblUser6.setForeground(new java.awt.Color(102, 102, 102));
        lblUser6.setText("Fecha Venta:");
        pnlInformacion.add(lblUser6);
        lblUser6.setBounds(10, 190, 80, 16);

        lblFechaV.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblFechaV.setForeground(new java.awt.Color(102, 102, 102));
        lblFechaV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFechaV.setText("15/01/2020");
        pnlInformacion.add(lblFechaV);
        lblFechaV.setBounds(90, 190, 110, 20);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setDoubleBuffered(true);
        pnlInformacion.add(jSeparator2);
        jSeparator2.setBounds(10, 210, 190, 10);

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setDoubleBuffered(true);
        pnlInformacion.add(jSeparator3);
        jSeparator3.setBounds(10, 150, 190, 10);

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setDoubleBuffered(true);
        pnlInformacion.add(jSeparator4);
        jSeparator4.setBounds(10, 180, 190, 10);

        pnlBotonInformacion.setLayout(null);

        jToolBar3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar3.setRollover(true);
        jToolBar3.setAlignmentX(0.5F);

        btnInfoAdicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/pago.png"))); // NOI18N
        btnInfoAdicional.setText("Informacion adicional");
        btnInfoAdicional.setFocusable(false);
        btnInfoAdicional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfoAdicional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btnInfoAdicional);

        pnlBotonInformacion.add(jToolBar3);
        jToolBar3.setBounds(40, 0, 120, 160);

        pnlInformacion.add(pnlBotonInformacion);
        pnlBotonInformacion.setBounds(10, 220, 190, 230);

        lblUser5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblUser5.setForeground(new java.awt.Color(102, 102, 102));
        lblUser5.setText("Usuario:");
        pnlInformacion.add(lblUser5);
        lblUser5.setBounds(10, 130, 50, 16);

        jPanel1.add(pnlInformacion);
        pnlInformacion.setBounds(680, 60, 210, 460);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/buscar.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/lista-de-verificacion.png"))); // NOI18N

        lblTicket.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblTicket.setForeground(new java.awt.Color(102, 102, 102));
        lblTicket.setText("00000");

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBusquedaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlBusqueda);
        pnlBusqueda.setBounds(0, 60, 670, 50);

        pnlBotonMenu.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/Back.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        jToolBar1.add(btnRegresar);

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Inventario/update.png"))); // NOI18N
        btnupdate.setBorderPainted(false);
        btnupdate.setContentAreaFilled(false);
        btnupdate.setFocusable(false);
        btnupdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnupdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jToolBar1.add(btnupdate);

        javax.swing.GroupLayout pnlBotonMenuLayout = new javax.swing.GroupLayout(pnlBotonMenu);
        pnlBotonMenu.setLayout(pnlBotonMenuLayout);
        pnlBotonMenuLayout.setHorizontalGroup(
            pnlBotonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBotonMenuLayout.setVerticalGroup(
            pnlBotonMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonMenuLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlBotonMenu);
        pnlBotonMenu.setBounds(0, 0, 890, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Documentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Documentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEnviarM;
    public javax.swing.JButton btnImpTicket;
    public javax.swing.JButton btnInfoAdicional;
    public javax.swing.JButton btnPDF;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    public javax.swing.JLabel lblFechaV;
    public javax.swing.JLabel lblIva;
    public javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTP2;
    private javax.swing.JLabel lblTP3;
    public javax.swing.JLabel lblTicket;
    public javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JLabel lblUser5;
    private javax.swing.JLabel lblUser6;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBotonInformacion;
    private javax.swing.JPanel pnlBotonMenu;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlTabla;
    public javax.swing.JTable tblDocumento;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
