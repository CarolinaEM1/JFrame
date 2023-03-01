/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina EM
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPanel;
public class eventos extends JFrame implements ActionListener{
     JPanel panel = new JPanel();
    JButton boton1 = new JButton("Pintar");
    JButton boton2 = new JButton("Obtener Texto");
    JButton boton3 = new JButton("Terminar");
    JTextArea area = new JTextArea();
    JTextField campo = new JTextField();
    
    public eventos(){
        setTitle("Ejercicio 1, Parcial 2");
        setBounds(0,0,500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciarComponentes() {
        panel.setLayout(null);
        this.getContentPane().add(panel);
        area.setBounds(10,10,200,200);
        campo.setBounds(280,10,200,200);
        boton1.setBounds(10,300,120,80);
        boton2.setBounds(180,300,120,80);
        boton3.setBounds(350,300,120,80);
        panel.add(area);
        panel.add(campo);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            panel.setBackground(Color.pink);
        }
        if (e.getSource()==boton2) {
            String cadena;
            cadena = area.getText();
            campo.setText(cadena);
        }
        if (e.getSource()==boton3) {
            this.dispose();
        }
    }
    public static void main(String[] args) {
        eventos obj = new eventos();
        obj.setVisible(true);
    }  
}
    

