package Manejadores;

import Interfaces.Interfaz_Principal;
import Interfaces.Interfaz_Venta;
import Interfaces.SubInterfaz_Venta_BuscarProducto;
import Interfaces.Sub_Venta;
import MailyOtros.ventaException;
import Modulos.ConexionBD;
import Modulos.Modulo_Principal;
import Modulos.Modulo_Venta;
import Modulos.Modulo_SubVenta;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS INC
 */
public class Manejador_Ventas{
    //---Declaracion de Variables-----------//
    private Interfaz_Venta IV;
    private SubInterfaz_Venta_BuscarProducto IV_BP;
    private Modulo_Venta MV;
    private ConexionBD CBD;
    private DefaultTableModel DTM;
    private String TipoUsu;
    private TextAutoCompleter TAC;
    private SubInterfaz_Venta_BuscarProducto SIVBP;
    private ListSelectionModel SM;
    private Interfaces.Sub_Venta SUV;
    private Modulo_SubVenta MSUV;
    private Manejador_SubVenta MASUV;
    //---Declaracion de Variables-----------//
    //------Inicio de Interfaz Venta-----------//
    public Manejador_Ventas(Interfaz_Venta IV1, Modulo_Venta MV1, String T) {
        //--------Inicializacion de variables------------//
        this.TipoUsu = T;
        this.IV = IV1;
        this.MV = MV1;
        CBD = new ConexionBD();
        DTM = (DefaultTableModel) IV.dgv_Productos.getModel();
        SM = IV.dgv_Productos.getSelectionModel();
        //--------Inicializacion de variables------------//
        //--------Listener Key Listener------------//
        this.IV.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                char c = ke.getKeyChar();
                if(c == KeyEvent.VK_PLUS){
                    IV.btn_Cobrar.doClick();
                }
                if(c == KeyEvent.VK_F5){
                    IV.btn_BuscarProducto.doClick();
                }
                if(c == KeyEvent.VK_ALT && c == KeyEvent.VK_C){
                    IV.btn_Quitar.doClick();
                }
                if(c == KeyEvent.VK_Q){
                    IV.btn_regresar.doClick();
                }
            }
        });
        this.IV.txt_Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if(!(c >= 48 && c <= 57)){
                    ke.consume();
                }else if(IV.txt_Codigo.getText().length() == 13){
                    ke.consume();
                }
            }
            @Override
            public void keyReleased(KeyEvent ke) {
                if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                    CBD.openConexion();
                    String A[] = CBD.searchProduct2("[ID PRODUCTO]",IV.txt_Codigo.getText());
                    Object B[] = new Object[6];     
                    try{
                        for (int i = 0; i < A.length; i++) {
                            B = A[i].split(",");
                            B[2] = IV.txt_Cantidad.getText();                            
                            DTM.addRow(B);
                        }
                    }
                    catch(Exception e){System.out.println(e.getMessage());}
                    CBD.closeConexion();
                    if(IV.txt_Codigo.getText()==""){
                    //DTM.setRowCount(0);
                    }
                }
            }
        });

        this.IV.txt_Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if(!(c >= 48 && c <= 57)){
                    ke.consume();
                }else if(IV.txt_Codigo.getText().length() == 4){
                    ke.consume();
                }
            }
        });
        //--------Listener Key Listener------------//
        //--------Action Listener Performed------------//
        this.IV.btn_AplicarDescuento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               
             if (IV.dgv_Productos.getSelectedRow() >= 0) { 
               String cad=JOptionPane.showInputDialog(IV, "Coloca el descuento del producto");               
                
               try{
                    Integer.parseInt(cad);
                    int row = IV.dgv_Productos.getSelectedRow();
                    DTM.setValueAt("0." + cad, row, 5);
                    float a =Float.parseFloat(DTM.getValueAt(row, 3)+"")- (Float.parseFloat(DTM.getValueAt(row, 3)+"") * (Float.parseFloat(DTM.getValueAt(row, 5)+"")));
                    DTM.setValueAt(a, row, 4);
                }catch(Exception e){ showMessageDialog(IV, "Solo numeros");
                    }
            }
                else { showMessageDialog(IV, "Es necesario seleccionar un registro");
        }
        }
        });
        this.IV.btn_BuscarProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                IniciaSub();
            }
        });
        this.IV.btn_Cobrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (IV.dgv_Productos.getRowCount() > 0) {
                MSUV = new Modulo_SubVenta();                 
                String cad = JOptionPane.showInputDialog(IV,"Coloque el Efectivo");
                if(MASUV.validaInput(cad)){    
                    MSUV.setEfectivo(Double.parseDouble(cad));
                    SUV = new Sub_Venta();
                    MASUV = new Manejador_SubVenta(SUV, MSUV, IV);
                    SUV.setVisible(true);
                }
                
            }
        else {
            showMessageDialog(IV, "Es necesario ingresar productos registro");
            IV.txt_Codigo.requestFocus();
        }
        }
            
        });
        
        this.IV.btn_Quitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (IV.dgv_Productos.getSelectedRow() >= 0) {
                eliminaTabla();
                }
                else {
            showMessageDialog(IV, "Es necesario seleccionar un registro");
            }
         }
        });
        this.IV.btn_regresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            
            
            if (showConfirmDialog(IV, "¿Desea salir de la venta?",
            "Salir del sistema", YES_NO_OPTION) == YES_OPTION) {
            
                IV.dispose();
                Interfaz_Principal IP = new Interfaz_Principal();
                Modulo_Principal MP = new Modulo_Principal();
                Manejador_Principal MAP = new Manejador_Principal(IP, MP, TipoUsu);
                IP.setVisible(true);
            }
            
            
            }
        });
        //--------Action Listener Performed------------//
    }
    //-------------Fin del Constructor---------------//
    //--------Funciones Void-----------------//
    public void eliminaTabla(){
        //----Selecciona en numero de renglon de las seleccines es tabla----//
        int sel[] = IV.dgv_Productos.getSelectedRows();
        //----Elimina los renglones de las tablas-----/
        if(sel.length == 0){JOptionPane.showMessageDialog(IV,"Selecciona una columna a eliminar");return;}
        for(int i = 0;i < sel.length; i++){
            DTM.removeRow(sel[i]);
        }
    }// Fin elimina Tabla

    public void busquedarapida() {
        CBD.openConexion();
        //-----Busca el coincidente que inicia con nombreProducto-----//
        String nombreProducto = IV.txt_BuscarProducto.getText();
        String A[] = CBD.searchInTable("PRODUCTOS","[NOMBRE PRODUCTO]",nombreProducto);
        //-----Busca el coincidente que inicia con nombreProducto-----//
        //-----Agrega la lista de coincidencias a la variable autocompletar----//
        TAC.addItems(A);
        //-----Agrega la lista de coincidencias a la variable autocompletar----//
        CBD.closeConexion();
    }// Fin busqueda rapida
    
    //----Inicializa interfaz Sub Venta----//
    public void IniciaSub(){
        //----Inicializa variables-----//
        SIVBP = new SubInterfaz_Venta_BuscarProducto();
        DefaultTableModel ddd = (DefaultTableModel) SIVBP.dgv_Productos.getModel();
        //----Inicializa variables-----//
        //----Action Listener Performed----//
        SIVBP.btnCan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                SIVBP.dispose();
            }
        });
        //----Action Listener Performed----//
        //----Listener Key Listener----//
        SIVBP.txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            //------Agrega a la tabla el registro con el TXTCode----//
            public void keyReleased(KeyEvent ke) {
                if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                    ddd.setRowCount(0); //---Elimina tab;a---//
                    CBD.openConexion();
                    //----Busca producto segun id ------//
                    String A[] = CBD.searchProduct("[ID PRODUCTO]",SIVBP.txtCode.getText());
                    Object B[] = new Object[5];     
                    try{
                        //-------Agrega a tabla SubVentaBuscarProducto------//
                        for (int i = 0; i < A.length; i++) {                
                            B = A[i].split(",");
                            ddd.addRow(B);
                        }
                        //-------Agrega a tabla SubVentaBuscarProducto------//
                    }
                    catch(Exception e){System.out.println(e.getMessage());}
                    CBD.closeConexion();
                    //-------Elimina la tabla------//
                    if(SIVBP.txtCode.getText()==""){
                        ddd.setRowCount(0);
                    }
                    //-------Elimina la tabla------//
                }
            }
        });
        //----Listener Key Listener----//
    }// Fin Inicio Sub
    
    public void llenartabla() {
        CBD.openConexion();
        //----Busca producto segun id ------//
        String A[] = CBD.searchProduct("[ID PRODUCTO]",IV.txt_Codigo.getText());
        Object B[] = new Object[5];     
        try{
            //-------Agrega a tabla SubVentaBuscarProducto------//
            for (int i = 0; i < A.length; i++) {                
                B = A[i].split(",");
                DTM.addRow(B);
            }
            //-------Agrega a tabla SubVentaBuscarProducto------//
        }
        catch(Exception e){System.out.println(e.getMessage());}
        CBD.closeConexion();
    }// Fin llenarTabla
    
    public void compraNueva() {
        String A[] = null;
        
        /*  float suma; 
   
    for(int r=0;r<IV.dgv_Productos.getRowCount();r++)
    {
                  suma=Integer.parseFloat(DTM.getValueAt(r,).toString())+Integer.parseInt(txtCantidad.getText());
                  modelo.setValueAt(suma,r,2);
                  modelo.setValueAt(suma*Float.parseFloat(A[1]),r,3);
                  return;
              }*/
        
        Object O[] = new Object[6];
        O[0] = A[0];
        O[1] = A[1];
        O[2] = A[2];
        O[3] = IV.txt_Cantidad.getText();        
        O[5] = A[5];
        O[6] = A[6];
        float subtotal = 0;
        float iva=0;
        float total=0;
        float importe = Integer.parseInt(IV.txt_Cantidad.getText()) * Integer.parseInt(A[4]);
        O[4] = importe;
        DTM.addRow(O);
        IV.txt_Cantidad.setText("");
        subtotal = subtotal + importe;        
        iva = (float) (subtotal * 0.16);
        IV.lbl_IVA.setText(iva+ "");
        total = subtotal+iva;
        IV.lbl_TotalValor.setText(total + "");
        
        //Verificación de entrada de datos para txt_Codigo y txt_Presentación
        InputVerifier fieldVerifier = new InputVerifier() {
        @Override
        public boolean verify(JComponent input) {
            JTextField temp = (JTextField)input;
            try {
                int number = Integer.parseInt(temp.getText());
                return true;
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Sólo numeros!");
            }
            return false;
        }
        };
        IV.txt_Codigo.setInputVerifier(fieldVerifier);
        
        //--------Limpia los textos de Interfaz Venta-------//
        IV.lbl_TotalValor.setText("");
        IV.lbl_Promocion.setText("");
        IV.lbl_NumeroDeArticulosValor.setText("");
        IV.lbl_FolioVentaValor.setText("");
        IV.lbl_CambioVentaValor.setText("");
        IV.lbl_IVA.setText("");
        IV.txt_BuscarProducto.setText("");
        IV.txt_Cantidad.setText("");
        IV.txt_Codigo.setText("");
        //--------Limpia los textos de Interfaz Venta-------//
    }// Fin compraNueva
    
    public void validartxtCaracteresBG() throws ventaException {
        //valida los txt para que no tengan caracteres invalidos y 
        //que no tengan espacios excepto el nombre por que se separan en dos nombres por eso para el nombre tiene la de invalidonom donde no agrego el espacio

        String invalido = "¬~`^!#$%&/()=¡*¨[]:@;*|°|$!!'*¨**]{.-¨¨><''**;:_-¡¡?=~`^~^^¬";
        String invalidonom = "¬~`^!#$%&/()=¡*¨[]:@;*|°|$!!*¨**]{.-¨¨><''''**;:_-'¡¡?=~`^~^^";
        String numeros = "0123456789";
        String letras = "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLLÑZXCVBNM";
        String cad = IV.txt_BuscarProducto.getText();
        String cad2 = IV.txt_Cantidad.getText();
        String cad3 = IV.txt_Codigo.getText();
        for (int i = 0; i < cad.length(); i++) {
            if (invalidonom.indexOf(cad.substring(i, i + 1)) != -1) {
                IV.txt_BuscarProducto.requestFocus();
                throw new ventaException("Campo Buscar Producto contiene carácteres inválidos");
            }
        }
        for (int i = 0; i < cad.length(); i++) {
            if (numeros.indexOf(cad.substring(i, i + 1)) != -1) {
                IV.txt_BuscarProducto.requestFocus();
                throw new ventaException("Campo Buscar Producto contiene números");
            }
        }
        for (int o = 0; o < cad2.length(); o++) {
            if (invalido.indexOf(cad2.substring(o, o + 1)) != -1) {
                IV.txt_Cantidad.requestFocus();
                throw new ventaException("Campo Cantidad contiene carácteres inválidos");
            }
        }
        for (int o = 0; o < cad2.length(); o++) {
            if (letras.indexOf(cad2.substring(o, o + 1)) != -1) {
                IV.txt_Cantidad.requestFocus();
                throw new ventaException("Campo Cantidad contiene letras");
            }
        }
        for (int o = 0; o < cad3.length(); o++) {
            if (invalido.indexOf(cad3.substring(o, o + 1)) != -1) {
                IV.txt_Codigo.requestFocus();
                throw new ventaException("Campo Codigo contiene carácteres inválidos");
            }
        }
        for (int o = 0; o < cad3.length(); o++) {
            if (letras.indexOf(cad3.substring(o, o + 1)) != -1) {
                IV.txt_Codigo.requestFocus();
                throw new ventaException("Campo Codigo contiene letras");
            }
        }
    }// Fin Validar Txt Brayan
    //--------Funciones Void-----------------//
}