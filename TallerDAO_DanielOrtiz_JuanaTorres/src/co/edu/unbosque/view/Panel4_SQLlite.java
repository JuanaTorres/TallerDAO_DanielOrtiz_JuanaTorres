package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel4_SQLlite extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bCrearB, bLeerB, bActualizarB, bBorrarB;
	
	public Panel4_SQLlite() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("SQLlite");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		bCrearB = new JButton("Crear Persona en SQLlite");
		bCrearB.setBounds(40, 20, 240, 40);
		bCrearB.setFont(new Font("Arial Black", Font.BOLD, 12));
		bCrearB.setOpaque(true);
		bCrearB.setBackground(Color.WHITE);
		bCrearB.setForeground(Color.BLACK);
		bCrearB.setVisible(true);
		add(bCrearB);
		
		bLeerB = new JButton("Leer Personas en SQLlite");
		bLeerB.setBounds(40, 70, 240, 40);
		bLeerB.setFont(new Font("Arial Black", Font.BOLD, 12));
		bLeerB.setOpaque(true);
		bLeerB.setBackground(Color.WHITE);
		bLeerB.setForeground(Color.BLACK);
		bLeerB.setVisible(true);
		add(bLeerB);
		
		bActualizarB = new JButton("Actualizar Persona en SQLlite");
		bActualizarB.setBounds(40, 120, 240, 40);
		bActualizarB.setFont(new Font("Arial Black", Font.BOLD, 12));
		bActualizarB.setOpaque(true);
		bActualizarB.setBackground(Color.WHITE);
		bActualizarB.setForeground(Color.BLACK);
		bActualizarB.setVisible(true);
		add(bActualizarB);
		
		bBorrarB = new JButton("Borrar Persona en SQLlite");
		bBorrarB.setBounds(40, 170, 240, 40);
		bBorrarB.setFont(new Font("Arial Black", Font.BOLD, 12));
		bBorrarB.setOpaque(true);
		bBorrarB.setBackground(Color.WHITE);
		bBorrarB.setForeground(Color.BLACK);
		bBorrarB.setVisible(true);
		add(bBorrarB);
		
	}
	
	public JButton getbCrearB() {
		return bCrearB;
	}

	public void setbCrearB(JButton bCrearB) {
		this.bCrearB = bCrearB;
	}

	public JButton getbLeerB() {
		return bLeerB;
	}

	public void setbLeerB(JButton bLeerB) {
		this.bLeerB = bLeerB;
	}

	public JButton getbActualizarB() {
		return bActualizarB;
	}

	public void setbActualizarB(JButton bActualizarB) {
		this.bActualizarB = bActualizarB;
	}

	public JButton getbBorrarB() {
		return bBorrarB;
	}

	public void setbBorrarB(JButton bBorrarB) {
		this.bBorrarB = bBorrarB;
	}
	
}