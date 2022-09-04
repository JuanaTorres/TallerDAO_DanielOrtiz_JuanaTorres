package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel3_Archivo extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bCrearArch, bLeerArch, bActualizarArch, bBorrarArch;
	
	public Panel3_Archivo() {
		
setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Archivo");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		bCrearArch = new JButton("Crear Persona en Archivo");
		bCrearArch.setBounds(40, 20, 240, 40);
		bCrearArch.setFont(new Font("Arial Black", Font.BOLD, 12));
		bCrearArch.setOpaque(true);
		bCrearArch.setBackground(Color.WHITE);
		bCrearArch.setForeground(Color.BLACK);
		bCrearArch.setVisible(true);
		add(bCrearArch);
		
		bLeerArch = new JButton("Leer Personas en Archivo");
		bLeerArch.setBounds(40, 70, 240, 40);
		bLeerArch.setFont(new Font("Arial Black", Font.BOLD, 12));
		bLeerArch.setOpaque(true);
		bLeerArch.setBackground(Color.WHITE);
		bLeerArch.setForeground(Color.BLACK);
		bLeerArch.setVisible(true);
		add(bLeerArch);
		
		bActualizarArch = new JButton("Actualizar Persona en Archivo");
		bActualizarArch.setBounds(40, 120, 240, 40);
		bActualizarArch.setFont(new Font("Arial Black", Font.BOLD, 12));
		bActualizarArch.setOpaque(true);
		bActualizarArch.setBackground(Color.WHITE);
		bActualizarArch.setForeground(Color.BLACK);
		bActualizarArch.setVisible(true);
		add(bActualizarArch);
		
		bBorrarArch = new JButton("Borrar Persona en Archivo");
		bBorrarArch.setBounds(40, 170, 240, 40);
		bBorrarArch.setFont(new Font("Arial Black", Font.BOLD, 12));
		bBorrarArch.setOpaque(true);
		bBorrarArch.setBackground(Color.WHITE);
		bBorrarArch.setForeground(Color.BLACK);
		bBorrarArch.setVisible(true);
		add(bBorrarArch);
		
	}

	public JButton getbCrearArch() {
		return bCrearArch;
	}

	public void setbCrearArch(JButton bCrearArch) {
		this.bCrearArch = bCrearArch;
	}

	public JButton getbLeerArch() {
		return bLeerArch;
	}

	public void setbLeerArch(JButton bLeerArch) {
		this.bLeerArch = bLeerArch;
	}

	public JButton getbActualizarArch() {
		return bActualizarArch;
	}

	public void setbActualizarArch(JButton bActualizarArch) {
		this.bActualizarArch = bActualizarArch;
	}

	public JButton getbBorrarArch() {
		return bBorrarArch;
	}

	public void setbBorrarArch(JButton bBorrarArch) {
		this.bBorrarArch = bBorrarArch;
	}
	
}