package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Panel1_Botones panel1;
	private Panel2_Arreglo panel2;
	private Panel3_Archivo panel3;
	private Panel4_SQLlite panel4;
	private Panel5_Cassandra panel5;
	private Panel6_CRUD panel6;
	
	public View() {
		
		setSize(850,280);
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
		
		panel1 = new Panel1_Botones();
		panel1.setBounds(10, 10, 140, 180);
		add(panel1);
		
		panel2 = new Panel2_Arreglo();
		panel2.setBounds(160, 10, 324, 220);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setVisible(false);
		panel2.setEnabled(false);
		add(panel2);
		
		panel3 = new Panel3_Archivo();
		panel3.setBounds(160, 10, 324, 220);
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setVisible(false);
		panel3.setEnabled(false);
		add(panel3);
		
		panel4 = new Panel4_SQLlite();
		panel4.setBounds(160, 10, 324, 220);
		panel4.setBackground(Color.LIGHT_GRAY);
		panel4.setVisible(false);
		panel4.setEnabled(false);
		add(panel4);
		
		panel5 = new Panel5_Cassandra();
		panel5.setBounds(160, 10, 324, 220);
		panel5.setBackground(Color.LIGHT_GRAY);
		panel5.setVisible(false);
		panel5.setEnabled(false);
		add(panel5);
		
		panel6 = new Panel6_CRUD();
		panel6.setBounds(500, 10, 324, 220);
		panel6.setBackground(Color.LIGHT_GRAY);
		panel6.setVisible(false);
		panel6.setEnabled(false);
		add(panel6);
		
	}
	
	public void jopMessage(String mensaje, String titulo, int icono) {
		
		if(icono == 1) {
			
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(icono == 2) {
			
			JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
			
		}
	}
	
	public void MensajeConsola(String Mensaje) {
		
		System.out.println(Mensaje);
		
	}

	public Panel1_Botones getPanel1() {
		return panel1;
	}

	public void setPanel1(Panel1_Botones panel1) {
		this.panel1 = panel1;
	}

	public Panel2_Arreglo getPanel2() {
		return panel2;
	}

	public void setPanel2(Panel2_Arreglo panel2) {
		this.panel2 = panel2;
	}

	public Panel3_Archivo getPanel3() {
		return panel3;
	}

	public void setPanel3(Panel3_Archivo panel3) {
		this.panel3 = panel3;
	}

	public Panel4_SQLlite getPanel4() {
		return panel4;
	}

	public void setPanel4(Panel4_SQLlite panel4) {
		this.panel4 = panel4;
	}

	public Panel5_Cassandra getPanel5() {
		return panel5;
	}

	public void setPanel5(Panel5_Cassandra panel5) {
		this.panel5 = panel5;
	}

	public Panel6_CRUD getPanel6() {
		return panel6;
	}

	public void setPanel6(Panel6_CRUD panel6) {
		this.panel6 = panel6;
	}
	
}