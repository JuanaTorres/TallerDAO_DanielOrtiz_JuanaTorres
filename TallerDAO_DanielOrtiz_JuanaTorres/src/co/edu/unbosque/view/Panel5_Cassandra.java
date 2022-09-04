package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel5_Cassandra extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bIniciarC, bCerrarC, bCrearC, bLeerC, bActualizarC, bBorrarC;
	
	public Panel5_Cassandra() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Cassandra");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		bIniciarC = new JButton("Iniciar Cassandra");
		bIniciarC.setBounds(10, 20, 140, 30);
		bIniciarC.setOpaque(true);
		bIniciarC.setFont(new Font("Arial Black", Font.BOLD, 10));
		bIniciarC.setBackground(Color.WHITE);
		bIniciarC.setForeground(Color.BLACK);
		add(bIniciarC);
		
		bCerrarC = new JButton("Cerrar Cassandra");
		bCerrarC.setBounds(170, 20, 140, 30);
		bCerrarC.setOpaque(true);
		bCerrarC.setFont(new Font("Arial Black", Font.BOLD, 10));
		bCerrarC.setBackground(Color.WHITE);
		bCerrarC.setForeground(Color.BLACK);
		add(bCerrarC);
		
		
		bCrearC = new JButton("Crear Persona en Cassandra");
		bCrearC.setBounds(30, 60, 260, 30);
		bCrearC.setFont(new Font("Arial Black", Font.BOLD, 12));
		bCrearC.setOpaque(true);
		bCrearC.setBackground(Color.WHITE);
		bCrearC.setForeground(Color.BLACK);
		bCrearC.setVisible(true);
		add(bCrearC);
		
		bLeerC = new JButton("Leer Personas en Cassandra");
		bLeerC.setBounds(30, 100, 260, 30);
		bLeerC.setFont(new Font("Arial Black", Font.BOLD, 12));
		bLeerC.setOpaque(true);
		bLeerC.setBackground(Color.WHITE);
		bLeerC.setForeground(Color.BLACK);
		bLeerC.setVisible(true);
		add(bLeerC);
		
		bActualizarC = new JButton("Actualizar Persona en Cassandra");
		bActualizarC.setBounds(30, 140, 260, 30);
		bActualizarC.setFont(new Font("Arial Black", Font.BOLD, 12));
		bActualizarC.setOpaque(true);
		bActualizarC.setBackground(Color.WHITE);
		bActualizarC.setForeground(Color.BLACK);
		bActualizarC.setVisible(true);
		add(bActualizarC);
		
		bBorrarC = new JButton("Borrar Persona en Cassandra");
		bBorrarC.setBounds(30, 180, 260, 30);
		bBorrarC.setFont(new Font("Arial Black", Font.BOLD, 12));
		bBorrarC.setOpaque(true);
		bBorrarC.setBackground(Color.WHITE);
		bBorrarC.setForeground(Color.BLACK);
		bBorrarC.setVisible(true);
		add(bBorrarC);
		
	}

	public JButton getbIniciarC() {
		return bIniciarC;
	}

	public void setbIniciarC(JButton bIniciarC) {
		this.bIniciarC = bIniciarC;
	}

	public JButton getbCerrarC() {
		return bCerrarC;
	}

	public void setbCerrarC(JButton bCerrarC) {
		this.bCerrarC = bCerrarC;
	}

	public JButton getbCrearC() {
		return bCrearC;
	}

	public void setbCrearC(JButton bCrearC) {
		this.bCrearC = bCrearC;
	}

	public JButton getbLeerC() {
		return bLeerC;
	}

	public void setbLeerC(JButton bLeerC) {
		this.bLeerC = bLeerC;
	}

	public JButton getbActualizarC() {
		return bActualizarC;
	}

	public void setbActualizarC(JButton bActualizarC) {
		this.bActualizarC = bActualizarC;
	}

	public JButton getbBorrarC() {
		return bBorrarC;
	}

	public void setbBorrarC(JButton bBorrarC) {
		this.bBorrarC = bBorrarC;
	}
	
}