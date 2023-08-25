package unidad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class frmDos extends JFrame implements ActionListener{

    static JButton btnLeer, btnListar, btnNuevo;
    static JTextArea txtTablero;
    static JTextField txtUbicacion,txtHorario,txtNombre,txtPrecio;
    static JLabel lblCodigo;
    static String linea;
    static ArrayList<Lugares> laLista;
    public frmDos(){

        //configuración
        btnLeer = new JButton("Leer Archivo");
        btnLeer.setLocation(30,30);
        btnLeer.setSize(130,30);
        btnLeer.addActionListener(this);

        txtTablero = new JTextArea();
        txtTablero.setLocation(30,70);
        txtTablero.setSize(200,200);

        lblCodigo = new JLabel("Ingrese el lugar: 1.ubicacion, 2.horario, 3.nombre, 4.precio ");
        lblCodigo.setLocation(270,10);
        lblCodigo.setSize(350,90);

        txtUbicacion = new JTextField(10);
        txtUbicacion.setLocation(270,70);
        txtUbicacion.setSize(150,30);

        txtHorario = new JTextField(10);
        txtHorario.setLocation(270,150);
        txtHorario.setSize(150,30);

        txtNombre = new JTextField(10);
        txtNombre.setLocation(270,110);
        txtNombre.setSize(150,30);

        txtPrecio= new JTextField(10);
        txtPrecio.setLocation(270,190);
        txtPrecio.setSize(150,30);

        btnNuevo = new JButton("Registrar");
        btnNuevo.setLocation(270,230);
        btnNuevo.setSize(130,30);
        btnNuevo.addActionListener(this);

        btnListar = new JButton("Listar");
        btnListar.setLocation(270,270);
        btnListar.setSize(130,30);
        btnListar.addActionListener(this);


        //adicionar
        add(btnLeer);
        add(txtTablero);

        add(txtUbicacion);
        add(txtHorario);
        add(txtNombre);
        add(txtPrecio);

        add(lblCodigo);
        add(btnNuevo);
        add(btnListar);
        //configurar formulario
        /*Color c = new Color(38,38,38);
        getContentPane().setBackground(c);*/

        setLayout(null);
        setSize(700,550);
        setTitle("Agenda de contactos");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (true);

    }


    public void actionPerformed(ActionEvent e)  {
        String listaArea="";
        if (e.getSource().equals(btnListar)){
            for (Lugares l:laLista){
                listaArea=listaArea+l.getUbicacion()+"-"+ l.getHorarioAtencion()+"-"+ l.getNombre()+"-"+ l.getPrecio()+"\n";
            }
            txtTablero.setText("");
            txtTablero.append(listaArea);
        }
        if(e.getSource().equals(btnLeer)){
            try{
                txtTablero.append("");
                linea = LeerArchivo.leer("C:\\Users\\victo\\Desktop\\victor\\ing sistemas\\semestre3\\estructura de datos\\ProyectoIntegra_poo\\src\\unidad1\\listado.txt");
                txtTablero.setText("");
                txtTablero.append("Archivo leido\nLista creada");
                laLista=Lista1.crearLista(linea);

            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }

        if(e.getSource().equals(btnNuevo)){
            String ubi = txtUbicacion.getText();
            String hora = txtHorario.getText();
            String nom = txtNombre.getText();
            String prec = txtPrecio.getText();

            Lugares l = new Lugares(ubi,hora,nom,prec);
           /* String lineaEscribir = linea+";"+cod+","+nom+","+tel;
            try{
                writeFile.escribir(lineaEscribir,"c:\\codeall\\contactos.txt");
            }catch(IOException ioe){
                System.out.println(ioe);
            }*/
        }
    }



}
