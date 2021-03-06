package Interfaces;

import java.awt.Color;
import java.awt.dnd.DropTarget;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;

/**
 *
 * @author user
 */

public class Interfaz_Venta extends javax.swing.JFrame implements Runnable {

    public Interfaz_Venta() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);

        lblFecha.setText(fechaSystem());
        h1 = new Thread(this);
        h1.start();
        resize(1435, 731);
        cargarimagen();
        panel1.setBackground(new Color(223, 223, 223));
        panel2.setBackground(new Color(0, 229, 238));
        panel3.setBackground(new Color(0, 229, 238));
        jpn_ComandosDeslizantesInferior.setBackground(new Color(0, 229, 238));
        jpn_InformacionDeslizanteSuperior.setBackground(new Color(0, 229, 238));
        panelsup.setBackground(new Color(0, 229, 238));
    }

    private void cargarimagen() {
        CargarImagen d = new CargarImagen(lbl_Promocion);
        new DropTarget(panel1, d);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_UsuarioValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgv_Productos = new javax.swing.JTable();
        panel2 = new javax.swing.JPanel();
        lbl_Total = new javax.swing.JLabel();
        lbl_TotalValor = new javax.swing.JLabel();
        lbl_NumeroDeArticulos = new javax.swing.JLabel();
        lbl_FolioVenta = new javax.swing.JLabel();
        lbl_NombreP = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        jpn_Fecha = new javax.swing.JPanel();
        lbl_Fecha = new javax.swing.JLabel();
        lbl_Hora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jpn_InformacionDeslizanteSuperior = new javax.swing.JPanel();
        panelsup = new javax.swing.JPanel();
        labelsup = new javax.swing.JLabel();
        jpn_ComandosDeslizantesInferior = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbl_NumeroDeArticulosValor = new javax.swing.JLabel();
        lbl_NombreProducto = new javax.swing.JLabel();
        lbl_FolioVentaValor = new javax.swing.JLabel();
        txt_BuscarProducto = new javax.swing.JTextField();
        lbl_Codigo = new javax.swing.JLabel();
        lbl_Cantidad = new javax.swing.JLabel();
        txt_Cantidad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jpn_Botones = new javax.swing.JPanel();
        btn_Cobrar = new javax.swing.JButton();
        btn_BuscarProducto = new javax.swing.JButton();
        btn_Quitar = new javax.swing.JButton();
        btn_AplicarDescuento = new javax.swing.JButton();
        btn_devolver = new javax.swing.JButton();
        lbl_IconoEmpresa = new javax.swing.JLabel();
        lbl_Promocion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_regresar = new javax.swing.JButton();
        lbl_FolioVenta1 = new javax.swing.JLabel();
        lbl_FolioVentaAnterior = new javax.swing.JLabel();
        lbl_FolioVentaValor2 = new javax.swing.JLabel();
        lbl_FolioVenta2 = new javax.swing.JLabel();

        setTitle("Ventas!");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icon_Empresa_Transparente.png")).getImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel1.setLayout(null);

        lbl_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Usuario.setText("ATIENDE:");
        panel1.add(lbl_Usuario);
        lbl_Usuario.setBounds(160, 20, 79, 22);

        lbl_UsuarioValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_UsuarioValor.setText("LUIS MIGUEL HERNANDEZ");
        panel1.add(lbl_UsuarioValor);
        lbl_UsuarioValor.setBounds(245, 20, 270, 22);

        dgv_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cant.", "Precio Unitario", "Importe", "Oferta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dgv_Productos);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(380, 295, 932, 220);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        panel1.add(panel2);
        panel2.setBounds(1426, 1569, 44, 14);

        lbl_Total.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_Total.setText("TOTAL:$");
        panel1.add(lbl_Total);
        lbl_Total.setBounds(30, 40, 140, 44);

        lbl_TotalValor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_TotalValor.setText("0.0");
        panel1.add(lbl_TotalValor);
        lbl_TotalValor.setBounds(180, 50, 300, 29);

        lbl_NumeroDeArticulos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_NumeroDeArticulos.setText("Numero de Articulos:");
        panel1.add(lbl_NumeroDeArticulos);
        lbl_NumeroDeArticulos.setBounds(20, 90, 223, 22);

        lbl_FolioVenta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_FolioVenta.setText("Folio Venta:");
        panel1.add(lbl_FolioVenta);
        lbl_FolioVenta.setBounds(20, 150, 134, 22);

        lbl_NombreP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_NombreP.setText("Nombre Producto:");
        panel1.add(lbl_NombreP);
        lbl_NombreP.setBounds(20, 120, 193, 22);

        txt_Codigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel1.add(txt_Codigo);
        txt_Codigo.setBounds(460, 250, 188, 35);

        jpn_Fecha.setOpaque(false);

        lbl_Fecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_Fecha.setText("FECHA:");

        lbl_Hora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_Hora.setText("HORA:");

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jpn_FechaLayout = new javax.swing.GroupLayout(jpn_Fecha);
        jpn_Fecha.setLayout(jpn_FechaLayout);
        jpn_FechaLayout.setHorizontalGroup(
            jpn_FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_FechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpn_FechaLayout.createSequentialGroup()
                .addComponent(lbl_Fecha)
                .addGap(18, 18, 18)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpn_FechaLayout.setVerticalGroup(
            jpn_FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_FechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpn_FechaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jpn_FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        panel1.add(jpn_Fecha);
        jpn_Fecha.setBounds(1020, 60, 375, 115);

        jpn_InformacionDeslizanteSuperior.setBackground(new java.awt.Color(51, 255, 51));

        panelsup.setBackground(new java.awt.Color(255, 153, 153));

        labelsup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelsup.setText("BIENVENIDOS A MINI SUPER AYALA");

        javax.swing.GroupLayout panelsupLayout = new javax.swing.GroupLayout(panelsup);
        panelsup.setLayout(panelsupLayout);
        panelsupLayout.setHorizontalGroup(
            panelsupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsupLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(labelsup, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(979, Short.MAX_VALUE))
        );
        panelsupLayout.setVerticalGroup(
            panelsupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelsup))
        );

        javax.swing.GroupLayout jpn_InformacionDeslizanteSuperiorLayout = new javax.swing.GroupLayout(jpn_InformacionDeslizanteSuperior);
        jpn_InformacionDeslizanteSuperior.setLayout(jpn_InformacionDeslizanteSuperiorLayout);
        jpn_InformacionDeslizanteSuperiorLayout.setHorizontalGroup(
            jpn_InformacionDeslizanteSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_InformacionDeslizanteSuperiorLayout.setVerticalGroup(
            jpn_InformacionDeslizanteSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_InformacionDeslizanteSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelsup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel1.add(jpn_InformacionDeslizanteSuperior);
        jpn_InformacionDeslizanteSuperior.setBounds(0, 0, 1470, 17);

        jpn_ComandosDeslizantesInferior.setBackground(new java.awt.Color(51, 255, 51));

        jLabel9.setText("(Q) = REGRESAR               (F5)= BUSCAR PRODUCTO          (+)=COBRAR      (ALT+C) QUITAR PRODUCTO          (ALT+A)= APLICAR DESCUENTO");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
        );

        javax.swing.GroupLayout jpn_ComandosDeslizantesInferiorLayout = new javax.swing.GroupLayout(jpn_ComandosDeslizantesInferior);
        jpn_ComandosDeslizantesInferior.setLayout(jpn_ComandosDeslizantesInferiorLayout);
        jpn_ComandosDeslizantesInferiorLayout.setHorizontalGroup(
            jpn_ComandosDeslizantesInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_ComandosDeslizantesInferiorLayout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jpn_ComandosDeslizantesInferiorLayout.setVerticalGroup(
            jpn_ComandosDeslizantesInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_ComandosDeslizantesInferiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel1.add(jpn_ComandosDeslizantesInferior);
        jpn_ComandosDeslizantesInferior.setBounds(10, 750, 1430, 14);

        lbl_NumeroDeArticulosValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_NumeroDeArticulosValor.setText("0");
        panel1.add(lbl_NumeroDeArticulosValor);
        lbl_NumeroDeArticulosValor.setBounds(250, 90, 93, 20);

        lbl_NombreProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel1.add(lbl_NombreProducto);
        lbl_NombreProducto.setBounds(220, 120, 220, 30);

        lbl_FolioVentaValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel1.add(lbl_FolioVentaValor);
        lbl_FolioVentaValor.setBounds(150, 150, 110, 22);

        txt_BuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_BuscarProducto.setText("Buscar producto");
        panel1.add(txt_BuscarProducto);
        txt_BuscarProducto.setBounds(380, 200, 930, 35);

        lbl_Codigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_Codigo.setText("Codigo:");
        panel1.add(lbl_Codigo);
        lbl_Codigo.setBounds(380, 250, 79, 29);

        lbl_Cantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_Cantidad.setText("Cantidad:");
        panel1.add(lbl_Cantidad);
        lbl_Cantidad.setBounds(670, 250, 100, 29);

        txt_Cantidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_Cantidad.setText("1");
        panel1.add(txt_Cantidad);
        txt_Cantidad.setBounds(770, 250, 188, 35);
        panel1.add(jLabel16);
        jLabel16.setBounds(1450, 1182, 0, 0);

        btn_Cobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/icon_Cobrar.png"))); // NOI18N
        btn_Cobrar.setMnemonic('t');

        btn_BuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/icon_BuscarProducto.png"))); // NOI18N

        btn_Quitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/icon_Quitar.png"))); // NOI18N
        btn_Quitar.setMnemonic('c');

        btn_AplicarDescuento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/icon_Descuento.png"))); // NOI18N
        btn_AplicarDescuento.setMnemonic('a');

        btn_devolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/icon_DevolverProducto.png"))); // NOI18N
        btn_devolver.setMnemonic('m');

        javax.swing.GroupLayout jpn_BotonesLayout = new javax.swing.GroupLayout(jpn_Botones);
        jpn_Botones.setLayout(jpn_BotonesLayout);
        jpn_BotonesLayout.setHorizontalGroup(
            jpn_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_Quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AplicarDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpn_BotonesLayout.setVerticalGroup(
            jpn_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_BotonesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpn_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpn_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_AplicarDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpn_BotonesLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(btn_Cobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpn_BotonesLayout.createSequentialGroup()
                        .addComponent(btn_Quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jpn_BotonesLayout.createSequentialGroup()
                        .addGroup(jpn_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel1.add(jpn_Botones);
        jpn_Botones.setBounds(380, 530, 932, 200);

        lbl_IconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/icon_Empresa.png"))); // NOI18N
        panel1.add(lbl_IconoEmpresa);
        lbl_IconoEmpresa.setBounds(520, 20, 240, 177);

        lbl_Promocion.setBackground(new java.awt.Color(102, 255, 51));
        lbl_Promocion.setForeground(new java.awt.Color(102, 255, 51));
        lbl_Promocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/12.png"))); // NOI18N
        lbl_Promocion.setText("                       Arrastra la promoción del día aquí");
        lbl_Promocion.setToolTipText("");
        lbl_Promocion.setMaximumSize(new java.awt.Dimension(344, 344));
        lbl_Promocion.setMinimumSize(new java.awt.Dimension(344, 344));
        lbl_Promocion.setPreferredSize(new java.awt.Dimension(344, 344));
        panel1.add(lbl_Promocion);
        lbl_Promocion.setBounds(10, 230, 349, 344);

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos_Venta/Q (2)_1.png"))); // NOI18N
        btn_regresar.setMnemonic('q');

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(jPanel1);
        jPanel1.setBounds(70, 590, 180, 130);

        lbl_FolioVenta1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_FolioVenta1.setText("Folio Anterior:");
        panel1.add(lbl_FolioVenta1);
        lbl_FolioVenta1.setBounds(20, 180, 150, 22);

        lbl_FolioVentaAnterior.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel1.add(lbl_FolioVentaAnterior);
        lbl_FolioVentaAnterior.setBounds(170, 180, 110, 22);

        lbl_FolioVentaValor2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panel1.add(lbl_FolioVentaValor2);
        lbl_FolioVentaValor2.setBounds(170, 180, 110, 22);

        lbl_FolioVenta2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_FolioVenta2.setText("Folio Anterior:");
        panel1.add(lbl_FolioVenta2);
        lbl_FolioVenta2.setBounds(20, 180, 150, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       if (showConfirmDialog(rootPane, "¿Desea salir del sistema?",
            "Salir del sistema", YES_NO_OPTION) == YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_formWindowClosing

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Venta().setVisible(true);
            }
        });
    }

    String H, M, S, AMPM;
    Calendar calendario;
    Thread h1, h2;

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        int x = 1500;
        int y = panel3.getLocation().y;
        int y2 = panelsup.getLocation().y;
        while (ct == h1) {
            calcula();
            lblHora.setText(H + ":" + M + ":" + S + " " + AMPM);
            if (x <= -10) {
                x = 1500;
                panel3.setLocation(x, y);
                panelsup.setLocation(x, y2);
            }
            x =x-80;
            panel3.setLocation(x, y);
            panelsup.setLocation(x, y2);

            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
            }
        }
    }

    private void calcula() {
        Calendar calendar = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendar.setTime(fechaHoraActual);
        AMPM = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (AMPM.equals("AM")) {
            H = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? ""
                    + calendar.get(Calendar.HOUR_OF_DAY) : "0"
                    + calendar.get(Calendar.HOUR_OF_DAY);
        } else {
            int h = calendar.get(Calendar.HOUR_OF_DAY) - 12;
            H = h > 9 ? "" + h : "0" + h;
        }
        M = calendar.get(Calendar.MINUTE) > 9 ? ""
                + calendar.get(Calendar.MINUTE) : "0"
                + calendar.get(Calendar.MINUTE);
        S = calendar.get(Calendar.SECOND) > 9 ? ""
                + calendar.get(Calendar.SECOND) : "0"
                + calendar.get(Calendar.SECOND);

    }

    //obtener la hora del SYSTEM VENVATEC :vVLSVKDFBJVBJSDBHNVSDJB
    private static String fechaSystem() {
        Date fecha = new Date();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd/MM/YYYY");
        return formatoF.format(fecha);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_AplicarDescuento;
    public javax.swing.JButton btn_BuscarProducto;
    public javax.swing.JButton btn_Cobrar;
    public javax.swing.JButton btn_Quitar;
    public javax.swing.JButton btn_devolver;
    public javax.swing.JButton btn_regresar;
    public javax.swing.JTable dgv_Productos;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jpn_Botones;
    public javax.swing.JPanel jpn_ComandosDeslizantesInferior;
    public javax.swing.JPanel jpn_Fecha;
    private javax.swing.JPanel jpn_InformacionDeslizanteSuperior;
    public javax.swing.JLabel labelsup;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblHora;
    public javax.swing.JLabel lbl_Cantidad;
    public javax.swing.JLabel lbl_Codigo;
    public javax.swing.JLabel lbl_Fecha;
    public javax.swing.JLabel lbl_FolioVenta;
    public javax.swing.JLabel lbl_FolioVenta1;
    public javax.swing.JLabel lbl_FolioVenta2;
    public javax.swing.JLabel lbl_FolioVentaAnterior;
    public javax.swing.JLabel lbl_FolioVentaValor;
    public javax.swing.JLabel lbl_FolioVentaValor2;
    public javax.swing.JLabel lbl_Hora;
    public javax.swing.JLabel lbl_IconoEmpresa;
    public javax.swing.JLabel lbl_NombreP;
    public javax.swing.JLabel lbl_NombreProducto;
    public javax.swing.JLabel lbl_NumeroDeArticulos;
    public javax.swing.JLabel lbl_NumeroDeArticulosValor;
    public javax.swing.JLabel lbl_Promocion;
    public javax.swing.JLabel lbl_Total;
    public javax.swing.JLabel lbl_TotalValor;
    private javax.swing.JLabel lbl_Usuario;
    public javax.swing.JLabel lbl_UsuarioValor;
    public java.awt.Panel panel1;
    private javax.swing.JPanel panel2;
    public javax.swing.JPanel panel3;
    public javax.swing.JPanel panelsup;
    public javax.swing.JTextField txt_BuscarProducto;
    public javax.swing.JTextField txt_Cantidad;
    public javax.swing.JTextField txt_Codigo;
    // End of variables declaration//GEN-END:variables
}
