package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel2_Arreglo extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bCrearArr, bLeerArr, bActualizarArr, bBorrarArr;
	
	public Panel2_Arreglo() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Arreglo");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		bCrearArr = new JButton("Crear Persona en Arreglo");
		bCrearArr.setBounds(40, 20, 240, 40);
		bCrearArr.setFont(new Font("Arial Black", Font.BOLD, 12));
		bCrearArr.setOpaque(true);
		bCrearArr.setBackground(Color.WHITE);
		bCrearArr.setForeground(Color.BLACK);
		bCrearArr.setVisible(true);
		add(bCrearArr);
		
		bLeerArr = new JButton("Leer Personas en Arreglo");
		bLeerArr.setBounds(40, 70, 240, 40);
		bLeerArr.setFont(new Font("Arial Black", Font.BOLD, 12));
		bLeerArr.setOpaque(true);
		bLeerArr.setBackground(Color.WHITE);
		bLeerArr.setForeground(Color.BLACK);
		bLeerArr.setVisible(true);
		add(bLeerArr);
		
		bActualizarArr = new JButton("Actualizar Persona en Arreglo");
		bActualizarArr.setBounds(40, 120, 240, 40);
		bActualizarArr.setFont(new Font("Arial Black", Font.BOLD, 12));
		bActualizarArr.setOpaque(true);
		bActualizarArr.setBackground(Color.WHITE);
		bActualizarArr.setForeground(Color.BLACK);
		bActualizarArr.setVisible(true);
		add(bActualizarArr);
		
		bBorrarArr = new JButton("Borrar Persona en Arreglo");
		bBorrarArr.setBounds(40, 170, 240, 40);
		bBorrarArr.setFont(new Font("Arial Black", Font.BOLD, 12));
		bBorrarArr.setOpaque(true);
		bBorrarArr.setBackground(Color.WHITE);
		bBorrarArr.setForeground(Color.BLACK);
		bBorrarArr.setVisible(true);
		add(bBorrarArr);
		
	}

	public JButton getbCrearArr() {
		return bCrearArr;
	}

	public void setbCrearArr(JButton bCrearArr) {
		this.bCrearArr = bCrearArr;
	}

	public JButton getbLeerArr() {
		return bLeerArr;
	}

	public void setbLeerArr(JButton bLeerArr) {
		this.bLeerArr = bLeerArr;
	}

	public JButton getbActualizarArr() {
		return bActualizarArr;
	}

	public void setbActualizarArr(JButton bActualizarArr) {
		this.bActualizarArr = bActualizarArr;
	}

	public JButton getbBorrarArr() {
		return bBorrarArr;
	}

	public void setbBorrarArr(JButton bBorrarArr) {
		this.bBorrarArr = bBorrarArr;
	}
	
}