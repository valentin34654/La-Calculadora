package Calculadora;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Ventana extends JFrame{

	JPanel panel = new JPanel();

	public Ventana() {
		//this.setSize(100,50);
		setBounds(100,300,400,400);
		setTitle("Calculadora");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(200,200));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		setSize(400,400);
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel Etiqueta1 = new JLabel("Numero 1");
		JLabel Etiqueta2 = new JLabel("NUmero 2");
		
		Etiqueta1.setBounds(10, 10, 300, 25);
		Etiqueta2.setBounds(10, 20, 300, 50);
		
		panel.add(Etiqueta2);
		panel.add(Etiqueta1);
	
		JTextPane cj1= new JTextPane();
		JTextPane cj2= new JTextPane();
		
		cj1.setBounds(75, 10, 100, 18);
		cj2.setBounds(75, 33, 100, 18);
		
		panel.add(cj1);
		panel.add(cj2);
		
		cj1.getText();
		cj2.getText();
		//BOTON
		JButton boton = new JButton("Registrar");
		boton.setBounds(75, 60, 90, 20);
		 boton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	                String principal = cj1.getText();
	                int num1 = Integer.parseInt(principal);
	                
	                String secundario = cj2.getText();
	                int num2 = Integer.parseInt(secundario);
	                
	                System.out.println("Nombre: " + num1);
	                System.out.println("Apellido: " + num2);
	            }
	        });  
		JButton boton1 = new JButton("+");
		boton1.setBounds(50, 200, 60, 30);
		 boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	String principal = cj1.getText();
                int num1 = Integer.parseInt(principal);
                
                String secundario = cj2.getText();
                int num2 = Integer.parseInt(secundario);
                
                System.out.println("Y la suma entre estos es: " + (num1+num2));
              }
           });
		JButton boton2 = new JButton("x");
		boton2.setBounds(125, 200, 60, 30);
		boton2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String principal = cj1.getText();
                int num1 = Integer.parseInt(principal);
                
                String secundario = cj2.getText();
                int num2 = Integer.parseInt(secundario);
                
		        System.out.println("la multiplicacion entre estos es " + (num1 * num2));
		    }
		});
		JButton boton3 = new JButton("-");
		boton3.setBounds(200, 200, 60, 30);
		 boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String principal = cj1.getText();
                int num1 = Integer.parseInt(principal);
                
                String secundario = cj2.getText();
                int num2 = Integer.parseInt(secundario);
                
                System.out.println("Y la resta entre estos es: " + (num1-num2));
            	}
        	});
		JButton boton4 = new JButton("/");
		boton4.setBounds(275, 200, 60, 30);
		 boton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String principal = cj1.getText();
                int num1 = Integer.parseInt(principal);
                
                String secundario = cj2.getText();
                int num2 = Integer.parseInt(secundario);
                
                System.out.println("Y la divicion entre estos es: " + (num1/num2));
            	}
        	});
		 
		panel.add(boton);
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		
	 }

}
