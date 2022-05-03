package com.team2.ud20.ejercicio6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ejercicio6App extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private double altura;
	private double peso;
	private double IMC;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6App frame = new Ejercicio6App();
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
	public Ejercicio6App() {
		setTitle("Calcular IMC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altura (metros):");
		lblNewLabel.setBounds(10, 28, 95, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(95, 25, 68, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Peso(kg):");
		lblNewLabel_1.setBounds(209, 28, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 25, 68, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(209, 67, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(254, 64, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					altura = Double.parseDouble(textField.getText());
					peso = Double.parseDouble(textField_1.getText());
					
					IMC = peso/Math.pow(altura, 2);
					
					DecimalFormat formato = new DecimalFormat("#.##"); 
					
					
					textField_2.setText(String.valueOf(formato.format(IMC)));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Error en los numeros introducidos");
				}
			
			}
		});
		btnNewButton.setBounds(74, 63, 89, 23);
		contentPane.add(btnNewButton);
	}
}