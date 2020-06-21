/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;
/**
 *
 * @author Enrique Miramontes
 */

//librerias 
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class ConexionBD {

//Declaracion de variables
Connection con ;//variable de conexion
Statement sentencia;//Esta variables nos servira para realizar una sentancia SQL
ResultSet resultado; //Esta variable guardara  el resultado de la sentencia SQL
PreparedStatement sp; //Esta variable se usara cuando se tienen que ejecutar varias veces  una sentancia SQL
CallableStatement ps; //PRARA LLAMAR A LOS PROCEDURES 

//------------------------------------------Constructor-----------------------------------------------------------------------------------
    public ConexionBD(){
        con = null;
    }//fin del constructor  
    
    
//------------------------------------Estable La conexion con la BD------------------------------------------------------
    public void openConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//se especifica el controlador de conexion a la BD
            String  url = "jdbc:sqlserver://localhost;databaseName=VENTATEC;user=ELSOL;password=DEMEXICO;";//direccion del servidor, le pasamos el puerto, la BD usuario y contraseña
            con = DriverManager.getConnection(url);
            System.out.println("Database Connected! :D");
        }catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            System.out.println("Failed Databse Conection :/ ");
        }//Fin del catch
         
    } //Fin openConexion
  
        
    //--------------------------------------Cierra La Conexion Con La BD------------------------------------------------------
    public void closeConexion(){
        try {con.close();System.out.println("Database disConected :'( ");}catch (SQLException ex){}    
    }//fin de la funcion closeConexion
    
    //-----------------------------------------Consultar Datos De La BD TipoUsuari--------------------------------------------------------
    public String consultaT(String campo, String dato){
        try {
            sp = con.prepareStatement("SELECT * FROM USUARIOS where [NOMBRE USUARIO] ='" + campo +"' AND CONTRASEÑA ='"+dato+"'");
            resultado = sp.executeQuery();
            if(resultado.next()) return resultado.getString(5);
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;
        }//Fin try catch
        return "";
    }//Fin Consulta

       
    //-----------------------------------------Consultar Datos De La BD Con String--------------------------------------------------------
    public boolean consulta(String tabla,String campo, String dato){
        try {
            sp = con.prepareStatement("SELECT * FROM "+ tabla + " where " + campo + " ='" + dato +" '");
            resultado = sp.executeQuery();
            if(resultado.next()) return true;
            else return false;
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;
            return false;
        }//Fin try catch
        
    }//Fin Consulta
    
    
    //---------------------------------------Consultar Datos De La BD Con Int--------------------------------------------------------------- 
    public boolean consulta(String tabla,String campo, int dato){       
        try {
            sp = con.prepareStatement("SELECT * FROM "+ tabla + " where " + campo + " =" + dato );
            resultado = sp.executeQuery();
            if(resultado.next()) return true;
            else return false;
            
        }catch (SQLException ex){
            showMessageDialog(null,ex);
            return false;
        }//Fin try catch
        
    }//Fin Consulta
    
    
    
    
//------------------------------------------------------Metodos Para Insertar BD------------------------------------------------------   
    
//--------------------------------Insertar en la table Pprodcutos--------------------------------------------------------------
    public void insertProduct(String id_Producto, int id_Proveedor,int id_Categoria,int id_Presentacion, String nombreProduct, String descripcion, float precio, float costo){
        try {
            sp = con.prepareStatement("INSERT INTO dbo.PRODUCTOS  VALUES(?,?,?,?,?,?,?,?)");
            sp.setString(1,id_Producto);
            sp.setInt(2, id_Proveedor);
            sp.setInt(3,id_Categoria);
            sp.setInt(4,id_Presentacion);
            sp.setString(5,nombreProduct);
            sp.setString(6,descripcion);
            sp.setFloat(7,precio);
            sp.setFloat(8,costo);
            sp.executeUpdate();
            sp.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }//Fin try catch
        
    }//Fin  inserProduct
    
    
    //----------------------------Inserta en la Tabla Entradas_Salidas De la BD-------------------------------------------------
    public void insertInOut(String id_producto,char tipo,int cantidad){
        try{
            
           sp = con.prepareStatement("INSERT INTO DBO.[ENTRADAS SALIDAS]([ID PRODUCTO],TIPO,CANTIDAD) VALUES(?,?,?)");
           sp.setString(1,id_producto);
           sp.setString(2,tipo + "");
           sp.setInt(3,cantidad);
           sp.executeUpdate();
        }catch(SQLException | NullPointerException ex){
                System.out.print(ex.getMessage());
        }//Fin try catch
    
    }//Fin inserInOut
    
    
    public void insertDetailsSale(int id_venta, String id_producto, int cantidad,float descuento,float subtotal){
    
    
    }
    
    //----------------------------Elimina en la base de datos-------------------------------------------------
    public void deleteDBProd(String campo,String dato){
        try{
           sp = con.prepareStatement("DELETE FROM PRODUCTOS where "+ campo +" = '"+ dato +"'");
           sp.executeUpdate();
        }catch(SQLException ex){
           System.out.println(ex.getMessage()); 
        }//Fin try catch
    }//Fin deleteTable
    
    
    
    
    //--------------------------------------Insertar En La Tabla Inventario BD-----------------------------------------------------
    public void insertInventory(String id_Product,int quantity){
        try{
           sp = con.prepareStatement("INSERT INTO DB0.INVENTARIO VALUES(?,?,?)");
           sp.setInt(1,1);
           sp.setString(2, id_Product);
           sp.setInt(3,quantity);
           sp.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }//Fin try catch
    
    }//Fin insertInventory
    
    
    
    
//-----------------------------------------Metodos para Actualizar BD------------------------------------------------------
    
    //------------------Ingrementa  la Cantidad del inventario---------------------------------------------------------------------------------
    public void updateInventoryE(String id_producto,int cantidad){
        try{
            sp = con.prepareStatement("UPDATE DB0.INVENTARIO SET STOCK = STOCK + " + cantidad +" where [ID PRODUCTOS] = '" + id_producto + "'" );
            sp.executeUpdate();
            sp.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }//Fin try catch
    
    }//Fin updateInventoryE
    
    //------------------Decrementa la catidad del Inventario--------------------------------------------------------------------
    public void updateInventoryS(String id_producto,int cantidad){
        try{
            sp = con.prepareStatement("UPDATE DB0.INVENTARIO SET STOCK = STOCK - " + cantidad +" where [ID PRODUCTOS] = '" + id_producto + "'" );
            sp.executeUpdate();
            sp.close();
        }catch(SQLException ex){ JOptionPane.showMessageDialog(null, ex);}
    
    }//Fin updateInventoryS
    
//------------------------------------------------Otros Metodos------------------------------------------------------------------------    
    
    //----------------Devuelve El número de filas que contiene la Variable Resulado----------------------------------------------------
    public int countRow(ResultSet r){
        try{
          int row = 0;
          while(r.next()){
            row++;
          } 
          return row;
        }catch(SQLException ex){
            System.out.println(ex);
            return 0;
        }
        
    }//Fin countRow
    
    //--------------------Devuelve un Arreglo con lo que contiene la varibel resultado---------------------------------------------------
    public String[] getTicket(){
        try{
            ps = con.prepareCall("{CALL PS_TICKET}");
            resultado = ps.executeQuery();            
            //PreparedStatement sp1 = con.prepareStatement("{CALL PS_TICKET}");
            //ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado);
            //Declaraacion de variables 
            int i =0;
            String A[] = new String[row];
            //Recorrer las filas que contiene Resultado
            while(resultado.next()){
                A[i] = resultado.getInt(1) + "," + resultado.getString(2) + "," + resultado.getInt(3) + "," +
                       resultado.getInt(4) + "," + resultado.getFloat(5) + "," + resultado.getFloat(6) + "," + 
                       resultado.getFloat(7);
                
                i++;
            }
            ps.close();
            resultado.close();
            return A; 
        }catch(SQLException e){
            return null;
        }//Fin try catch
   
    }//fin clase getTicket
    
    //--------------------Devuelve un Arreglo con lo que contiene la varibel resultado---------------------------------------------------
    public String[] getTicketID(int ID){
        try{
            ps = con.prepareCall("{CALL PS_TICKET_ID("+ID+")}");
            resultado = ps.executeQuery();
            PreparedStatement sp1 = con.prepareStatement("{CALL PS_TICKET_ID("+ID+")}");
            ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado1);
            //Declaraacion de variables 
            int i =0;
            String A[] = new String[row];
            //Recorrer las filas que contiene Resultado
            while(resultado.next()){
                A[i] = resultado.getInt(1) + "," + resultado.getString(2) + "," + resultado.getInt(3) + "," +
                       resultado.getInt(4) + "," + resultado.getFloat(5) + "," + resultado.getFloat(6) + "," + 
                       resultado.getFloat(7);
             
                i++;
            }
            ps.close();
            resultado.close();
            sp1.close();
            resultado1.close();
            return A; 
        }catch(SQLException e){
            return null;
        }//Fin try catch
   
    }//fin clase getTicketID
    
    //-------------------------Devuelve un Arreglo Con todos los datos de una tabla------------------------------------------------
    public String [] allCat(){
        try {
            sp = con.prepareStatement("SELECT   [NOMBRE CATEGORIA] FROM CATEGORIAS");
            resultado = sp.executeQuery();
           PreparedStatement sp1 = con.prepareStatement("SELECT  [NOMBRE CATEGORIA] FROM CATEGORIAS");
           ResultSet R = sp1.executeQuery();
            //Declaracion variables
            int i = 0;
            int tam =  countRow(R);
            String A[] = new String[tam];
            while(resultado.next()){
               A[i] = resultado.getString(1); //retorna el segundo campo(debe de ser string)
               System.out.println(A[i] + "");
               i++;
            }
            return A;
        }catch(SQLException ex){
            showMessageDialog(null,ex);
            return null;
        }//Fin try catch
    }
        
    public String [] allPre(){
        try {
            sp = con.prepareStatement("SELECT DISTINCT [TIPO PRESENTACION] FROM PRESENTACIONES");
            resultado = sp.executeQuery();
           PreparedStatement sp1 = con.prepareStatement("SELECT DISTINCT [TIPO PRESENTACION] FROM PRESENTACIONES");
           ResultSet R = sp1.executeQuery();
            //Declaracion variables
            int i = 0;
            int tam =  countRow(R);
            String A[] = new String[tam];
            while(resultado.next()){
               A[i] = resultado.getString(1); //retorna el segundo campo(debe de ser string)
               System.out.println(A[i] + "");
               i++;
            }
            return A;
        }catch(SQLException ex){
            showMessageDialog(null,ex);
            return null;
        }//Fin try catch
       
    }//Fin AllTableData
    
       public String [] allProvedor(){
        try {
            sp = con.prepareStatement("SELECT   [NOMBRE PROVEEDOR] FROM PROVEEDORES");
            resultado = sp.executeQuery();
           PreparedStatement sp1 = con.prepareStatement("SELECT  [NOMBRE PROVEEDOR] FROM  PROVEEDORES");
           ResultSet R = sp1.executeQuery();
            //Declaracion variables
            int i = 0;
            int tam =  countRow(R);
            String A[] = new String[tam];
            while(resultado.next()){
               A[i] = resultado.getString(1); //retorna el segundo campo(debe de ser string)
               System.out.println(A[i] + "");
               i++;
            }
            return A;
        }catch(SQLException ex){
            showMessageDialog(null,ex);
            return null;
        }//Fin try catch
    }
    
    
 public String[] searchInTable(String tabla,String campo, String dato){
        try {
            sp = con.prepareStatement("SELECT * FROM PRODUCTOS where " + campo + " like '" + dato +"%'");
            resultado = sp.executeQuery();
            PreparedStatement sp1 = con.prepareStatement("SELECT * FROM PRODUCTOS where " + campo + " like '" + dato +"%'");
            ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado1);            
            String A[] = new String[row];
            int i = 0;
            while(resultado.next()){
               A[i] = resultado.getString(5);
               i++;
               System.out.println(A[i]);
            }
            sp.close();
            resultado.close();
            sp1.close();
            resultado1.close();
            return A;
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;
            return null;
        }//Fin try catch
        
    }//Fin searchInTable
public String[] searchProduct(String campo, String dato){
        try {
            sp = con.prepareStatement("SELECT * FROM PRODUCTOS WHERE "+campo+" LIKE '"+dato+"%'");
            resultado = sp.executeQuery();
            PreparedStatement sp1 = con.prepareStatement("SELECT * FROM PRODUCTOS WHERE "+campo+" LIKE '"+dato+"%'");
            ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado1);
            String A[] = new String[row];
            int i = 0;
            while(resultado.next()){
               A[i] = resultado.getString(1) + "," + resultado.getString(5) + "," + resultado.getString(6) +"," +
                      resultado.getFloat(7) + "," + resultado.getFloat(8);
               i++;
            }
            sp.close();
            resultado.close();
            sp1.close();
            resultado1.close();
            return A;
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;            
            return null;
        }//Fin try catch
}
public String[] searchProduct2(String campo, String dato){
        try {
            sp = con.prepareStatement("SELECT * FROM PRODUCTOS WHERE "+campo+" = '"+dato+"'");
            resultado = sp.executeQuery();
            PreparedStatement sp1 = con.prepareStatement("SELECT * FROM PRODUCTOS WHERE "+campo+" = '"+dato+"'");
            ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado1);
            String A[] = new String[row];
            int i = 0;
            while(resultado.next()){
               A[i] = resultado.getString(1) + "," + resultado.getString(5) + "," + resultado.getString(6) +"," +
                      resultado.getFloat(7) + "," + resultado.getFloat(7) + ",0.0";
               i++;
            }
            sp.close();
            resultado.close();
            sp1.close();
            resultado1.close();
            return A;
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;            
            return null;
        }//Fin try catch
}
//-----------------------------------------------------------select--inventarios----------------
public String[] getInve(){
        try {
            sp = con.prepareStatement("{CALL PS_GETINVENTARIO}");
            resultado = sp.executeQuery();
            PreparedStatement sp1 = con.prepareStatement("{CALL PS_GETINVENTARIO}");
            ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado1);
            String A[] = new String[row];
            int i = 0;
            while(resultado.next()){
               A[i] = resultado.getString(1) + "," + resultado.getString(2) + "," + resultado.getFloat(3) +"," +
                      resultado.getFloat(4) + "," + resultado.getString(5)+","+resultado.getString(6)+","+
                      resultado.getString(7) + "," + resultado.getString(8);
               i++;
            }
            sp.close();
            resultado.close();
            sp1.close();
            resultado1.close();
            return A;
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;            
            return null;
        }//Fin try catch
    }//Fin searchProduct

//-----------------------------------------------------------select--inventarios----------------
public String[] getInveID(String id){
        try {
            sp = con.prepareStatement("{CALL PS_GETINVENTARIO_ID("+id+")}");
            resultado = sp.executeQuery();
            PreparedStatement sp1 = con.prepareStatement("{CALL PS_GETINVENTARIO_ID("+id+")}");
            ResultSet resultado1 = sp1.executeQuery();
            int row = countRow(resultado1);
            String A[] = new String[row];
            int i = 0;
            while(resultado.next()){
               A[i] = resultado.getString(1) + "," + resultado.getString(2) + "," + resultado.getFloat(3) +"," +
                      resultado.getFloat(4) + "," + resultado.getString(5)+","+resultado.getString(6)+","+
                      resultado.getString(7) + "," + resultado.getString(8);
               i++;
            }
            sp.close();
            resultado.close();
            sp1.close();
            resultado1.close();
            return A;
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            resultado = null;            
            return null;
        }//Fin try catch
    }//Fin searchProduct
    
public void UpdateInventario(String nombrep,String c,float venta,float costo,int cate,int p,String a){
        try{
            sp = con.prepareStatement("{CALL PS_UDPATE_INVENTARIO(?,?,?,?,?,?,?)}" );
            sp.setString(1, nombrep);
            sp.setString(2,c);
            sp.setFloat(3, venta);
            sp.setFloat(4, costo);
            sp.setInt(5, cate);
            sp.setInt(6, p);
            sp.setString(7, a);                        
            sp.executeUpdate();
            sp.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }//Fin try catch
    
    }
        
    
       public static void main(String arg[]){
           ConexionBD CBD = new ConexionBD();
           CBD.openConexion();
           
           CBD.insertInOut("1234",'E',5);
           
           CBD.closeConexion();
       }
       
       
}//Fin class 