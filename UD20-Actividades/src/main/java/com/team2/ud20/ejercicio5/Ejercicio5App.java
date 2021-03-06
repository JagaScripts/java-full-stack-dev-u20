package com.team2.ud20.ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * UD20-Actividades - com.team2.ud20.ejercicio5 - Ejercicio5App
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 10/05/2022
 */
public class Ejercicio5App extends JFrame {

	private JPanel contentPane;
	private String cadenaTexto = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5App frame = new Ejercicio5App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio5App() {
		
		
		setTitle("Tabla de eventos de ratón");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JTextArea textArea = new JTextArea();
		//Listado de eventos del raton
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				//Clicked
				System.out.println("Clicked");
				cadenaTexto += "Click de ratón\n";
				textArea.setText(cadenaTexto);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				//Entrada de raton
				System.out.println("Entrada de raton");
				cadenaTexto += "Entrada de ratón\n";
				textArea.setText(cadenaTexto);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				//Salida de raton
				System.out.println("Salida de raton");
				cadenaTexto += "Salida de ratón\n";
				textArea.setText(cadenaTexto);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//Presion de raton
				System.out.println("Click Mantenido");
				cadenaTexto += "Click de ratón mantenido\n";
				textArea.setText(cadenaTexto);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				//Liberacion de raton
				System.out.println("Liberacion de raton");
				cadenaTexto += "Click de ratón soltado\n";
				textArea.setText(cadenaTexto);
			}
		});
		textArea.setBounds(10, 60, 414, 190);
		contentPane.add(textArea);
		
		//Limpiar la lista de eventos
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadenaTexto = "";
				textArea.setText(cadenaTexto);
			}
		});
		btnNewButton.setBounds(172, 11, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
