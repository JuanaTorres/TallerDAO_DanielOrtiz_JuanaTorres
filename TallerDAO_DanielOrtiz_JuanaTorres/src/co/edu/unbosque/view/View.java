package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelBotones panel1;
	
	public View() {
		
		setSize(500,228);
		setTitle("DAO - Juana Torres, Daniel Ortiz");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		
		inicializarPaneles();
		
		setVisible(true);
		setResizable(false);
		
	}
	
	public void inicializarPaneles() {
		
		panel1 = new PanelBotones();
		panel1.setBounds(10, 10, 140, 180);
		add(panel1);
		
	}
	
	public int leerDatoEntero(String m) {
		int cambio = 0;
		while (cambio == 0) {
			String aux = (JOptionPane.showInputDialog(null, m, "Divide y Venceras",
					JOptionPane.INFORMATION_MESSAGE));
			try {
				cambio = Integer.parseInt(aux);
			} catch (NumberFormatException e) {
				cambio = 0;
				jopMessage("Debes ingresar un número", "", 1);
			}
		}
		return cambio;
	}
	
	public void jopMessage(String mensaje, String titulo, int icono) {
		
		if(icono == 1) {
			
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(icono == 2) {
			
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
			
		}
	}
	
}