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
	private PanelActualizar panel2;
	private PanelArreglo panel3;
	
	public View() {
		
		setSize(510,240);
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
		
		panel2 = new PanelActualizar();
		panel2.setBounds(160, 10, 324, 180);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setVisible(false);
		panel2.setEnabled(false);
		add(panel2);
		
		panel3 = new PanelArreglo();
		panel3.setBounds(160, 10, 324, 180);
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setVisible(false);
		panel3.setEnabled(false);
		add(panel3);
		
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
	
	public PanelBotones getPanel1() {
		return panel1;
	}
	
	public void setPanel1(PanelBotones panel1) {
		this.panel1 = panel1;
	}	
	
	public PanelActualizar getPanel2() {
		return panel2;
	}

	public void setPanel2(PanelActualizar panel2) {
		this.panel2 = panel2;
	}
	
	public PanelArreglo getPanel3() {
		return panel3;
	}
	
	public void setPanel3(PanelArreglo panel3) {
		this.panel3 = panel3;
	}
	
}