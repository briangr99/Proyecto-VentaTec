/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;


import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import Interfaces.Interfaz_Documentacion;
import Interfaces.Interfaz_Principal;
import Modulos.ConexionBD;
import MailyOtros.MailException;
import Modulos.Modulo_Documentos;
import Modulos.Modulo_Ticket;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS INC
 */
public class Manejador_Documentacion{
    //-----------Declaracion de Variables--------------//
    private Interfaz_Documentacion ID;
    private Interfaz_Principal IP;
    private Modulo_Documentos MD;
    private Modulo_Ticket MT;
    private ConexionBD CBD;
    private DefaultTableModel DTM;
    private ListSelectionModel SM;
    //-----------Declaracion de Variables--------------//
    //--------Iniciar Interfaz Documentos-----------//
    public Manejador_Documentacion(Interfaz_Documentacion ID1, Modulo_Documentos MD1) {
        //----------INICIALIZACION Variables----------------//
        this.ID = ID1;
        this.MD = MD1;
        DTM = (DefaultTableModel) ID.tblDocumento.getModel();
        SM = ID.tblDocumento.getSelectionModel();
        CBD = new ConexionBD();
        rellenaTabla();
        //----------INICIALIZACION Variables----------------//
        //----------Action Listener Performed---------------//
        this.ID.tblDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            //-----------Actualiza todos los TXT con info de la tabla----------//
            public void mouseClicked(MouseEvent me) {
                int row = ID.tblDocumento.getSelectedRow();
                ID.lblTicket.setText(DTM.getValueAt(row, 0) + "");
            }
            public void mouseReleased(MouseEvent me) {
                if(!(rellenalbl())){
                    System.out.println("Ticket no encontrado " + ID.lblTicket);
                }
            }
            //-----------Actualiza todos los TXT con info de la tabla----------//
        });
        this.ID.btnBuscar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String cad = ID.txtBuscar.getText();
                if(!(cad.equals(""))){
                    BuscarTicket(cad);
                }else{
                    JOptionPane.showMessageDialog(ID, "El texto de busqueda esta vacio");
                }
            }
        });
        this.ID.btnImpTicket.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Integer.parseInt(ID.lblTicket.getText())==0){
                    ImpTicket();
                }else{JOptionPane.showMessageDialog(ID, "Busque un ticket para poder usar esta funcion");}
            }
        });
        this.ID.btnInfoAdicional.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Integer.parseInt(ID.lblTicket.getText())==0){
                    ImpTicket();
                }else{JOptionPane.showMessageDialog(ID, "Busque un ticket para poder usar esta funcion");}
            }
        });
        this.ID.btnPDF.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                HacerPDF();
            }
        });
        this.ID.btnEnviarM.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String cad = JOptionPane.showInputDialog("Coloca tu correo");
                if(!(cad == null)){
                    String B[] = cad.split("@");
                    String A[] = cad.split(".");
                    if(B.length == 2){
                        if(A.length ==2 || A.length == 3){
                            EnviarMail(cad);
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(ID, "Correo mal escrito");
                }
            }
        });
        this.ID.btnRegresar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ID.setVisible(false);
                ID.setEnabled(false);
            }
        });
        //----------Action Listener Performed---------------//
        this.ID.btnupdate.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent ae) {
                DTM.setRowCount(0);
                rellenaTabla();
                JOptionPane.showMessageDialog(ID,"La tabla se ha actualizado");
            }
        });
    }
    //-------------Fin de constructor-----------//
    //-------------------------Funciones void---------------//
    public void rellenaTabla(){
        CBD.openConexion();
        String S[] = CBD.getTicket(); //Llamada a get Ticket
        String S2[] = new String[8];
        try{
            //------Rellena la tabla Documentacion----------//
            for (int i = 0;i < S.length;i++){
                S2 = S[i].split(",");
                DTM.addRow(S2);
            }
            //------Rellena la tabla Documentacion----------//
        }
        catch(Exception e){System.out.println(e.getMessage());}
        CBD.closeConexion();
    }// Fin RellenaTabla
    
    public void ImpTicket(){
        CBD.openConexion();
        //--------Inicializacion variables----------//
        MT = new Modulo_Ticket();
        int ROW = ID.tblDocumento.getSelectedRow();
        int TICKET = Integer.parseInt(ID.lblTicket.getText());
        String S[] = CBD.getTicketID(TICKET);
        //--------Inicializacion variables----------//
        //-----------Rellena Ticket------------//
        for(int i=0;i < S.length; i++){
            MT.AddItem(S[4] + "", S[3] + "", S[6] + "");
        }
        MT.AddTotal("", MT.DibujarLinea(29));
        MT.AddTotal("", MT.DarEspacio());
        MT.AddTotal("SUBTOTAL", ID.lblSubTotal.getText());
        MT.AddTotal("IVA", ID.lblIva.getText());
        MT.AddTotal("TOTAL", ID.lblTotal.getText());
        MT.AddTotal("FECHA", ID.lblFechaV.getText());
        MT.AddTotal("", MT.DarEspacio());
        //-----------Rellena Ticket------------//
        //-----------Imprime Ticket------------//
        MT.ImprimirTicket();
        CBD.closeConexion();
        JOptionPane.showMessageDialog(ID, "El Documento se a impreso");
    }// Fin impTicket
    
    private void HacerPDF() {
        String nombredearchivo2 = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documento txt", "txt"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documento pdf", "pdf"));
        
        int seleccion = fileChooser.showSaveDialog(ID);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            String archivo = (fileChooser.getFileFilter().getDescription());
            String filtro = "." + archivo.substring(archivo.length() - 3);
            if(filtro.equals(".les")){filtro = "";}
            nombredearchivo2 = fileChooser.getSelectedFile().getName();
            System.out.println(fileChooser.getSelectedFile().getAbsolutePath() + filtro);
            if(nombredearchivo2!=""){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath() + filtro);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        //Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (int i = 0; i < ID.tblDocumento.getRowCount(); i++) {
                        for (int j = 0; j < ID.tblDocumento.getColumnCount(); j++) {
                            bw.write(ID.tblDocumento.getValueAt(i, j).toString() + "/");
                        }
                        bw.newLine();
                    }
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(ID, "El archivo ha sido guardado correctamente con el nombre de " + nombredearchivo2);
                } catch (IOException ex) {
                    //Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                return;
            }
        }
    }// Fin Hacer PDF
    //-------------------------Funciones void---------------//
    //-------------------------Funciones Return---------------//
    public boolean rellenalbl(){
        String IDV = ID.lblTicket.getText();
        CBD.openConexion();
        String info = CBD.getInfoTick(IDV);
        if(!(info.equals(""))){
            String B[] = new String[5];
            String F[] = new String[3];
            B = info.split(",");
            ID.lblTotal.setText(B[0]);
            ID.lblSubTotal.setText(B[1]);
            ID.lblIva.setText(B[2]);
            F = B[3].split("-");
            ID.lblFechaV.setText(F[2] + "/" + F[1] + "/" + F[0]);
            ID.lblUsuario.setText(B[4]);
            CBD.closeConexion();
            return true;
        }
        CBD.closeConexion();
        return false;
    }
    public int BuscarTicket(String cad){
        CBD.openConexion();
        //-------Inicializa variables---------//
        String G[] = new String[DTM.getRowCount()];
        String B = cad;
        //-------Inicializa variables---------//
        //-------Busca ticket a ticket en la tabla---------//
        for (int i = 0;i < DTM.getRowCount();i++){
            if(B.equals(DTM.getValueAt(i,0) + "")){
                SM.setSelectionInterval(i, i + 1);
                CBD.closeConexion();
                return 0;
            }
        }
        //-------Busca ticket a ticket en la tabla---------//
        JOptionPane.showMessageDialog(ID, "Ticket no encontrado","Busca Ticket",JOptionPane.INFORMATION_MESSAGE);
        CBD.closeConexion();
        return 1;
    }// Fin BuscarTicket
    
    public boolean EnviarMail(String cad){
        try{
            if(DTM.getRowCount()==0){
                throw new MailException("No existen registros");
            }else{
                
                String To = cad;
              // String To="briangr99@gmail.com"; 
               String me = "";
                   /*for(int i=0;i < ID.tblDocumento.getRowCount();i++){
                       for(int j=0;j < ID.tblDocumento.getColumnCount();j++){
                       me = me + ID.tblDocumento.getValueAt(i, j).toString()+" ";    
                   }
                       me=me+"\n";
                   }
                   */me="Buenas tarde Maestra";

                    Properties props = new Properties();
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.port", "587");

                    Session session;
                    session = Session.getInstance(props,
                            new javax.mail.Authenticator() {
                                @Override
                                protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication("ultramarinosayala2020@gmail.com", "losayalaultra");
                                }
                            });

                    try {

                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("ultramarinosayala2020@gmail.com"));
                        message.setRecipients(Message.RecipientType.TO,
                                InternetAddress.parse(To));
                        message.setSubject("Lista de archivos");

                        message.setText(me);

                        Transport.send(message);
                        JOptionPane.showMessageDialog(ID, "Los registros han sido enviados a "+To);

                    } catch (MessagingException e) {
                        throw new RuntimeException(e);
                    }
            }
        }
        catch(MailException e){
            System.out.println(e.getMessage());
        }
        return true;
    }// Fin EnviarMail
    //-------------------------Funciones Return---------------//
}
