package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bActualizar, bArreglo, bArchivo, bBasedeDatos;
	
	public PanelBotones() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Opciones");
		border.setTitleFont(new Font("Arial Black", Font.BOLD,12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		bActualizar = new JButton("Actualizar");
		bActualizar.setBounds(10, 20, 120, 30);
		bActualizar.setOpaque(true);
		bActualizar.setFont(new Font("Arial Black", Font.BOLD, 12));
		bActualizar.setBackground(Color.WHITE);
		bActualizar.setForeground(Color.BLACK);
		add(bActualizar);
		
		bArreglo = new JButton("Arreglo");
		bArreglo.setBounds(10, 60, 120, 30);
		bArreglo.setOpaque(true);
		bArreglo.setFont(new Font("Arial Black", Font.BOLD, 12));
		bArreglo.setBackground(Color.WHITE);
		bArreglo.setForeground(Color.BLACK);
		add(bArreglo);
		
		bArchivo = new JButton("Archivo");
		bArchivo.setBounds(10, 100, 120, 30);
		bArchivo.setOpaque(true);
		bArchivo.setFont(new Font("Arial Black", Font.BOLD, 12));
		bArchivo.setBackground(Color.WHITE);
		bArchivo.setForeground(Color.BLACK);
		add(bArchivo);
		
		bBasedeDatos = new JButton("Base de Datos");
		bBasedeDatos.setBounds(10, 140, 120, 30);
		bBasedeDatos.setOpaque(true);
		bBasedeDatos.setFont(new Font("Arial Black", Font.BOLD, 12));
		bBasedeDatos.setBackground(Color.WHITE);
		bBasedeDatos.setForeground(Color.BLACK);
		add(bBasedeDatos);
		
	}

	
	public JButton getbCrear() {
		return bActualizar;
	}

	
	public void setbCrear(JButton bCrear) {
		this.bActualizar = bCrear;
	}

	
	public JButton getbLeer() {
		return bArreglo;
	}

	
	public void setbLeer(JButton bLeer) {
		this.bArreglo = bLeer;
	}

	
	public JButton getbActualizar() {
		return bArchivo;
	}

	
	public void setbActualizar(JButton bActualizar) {
		this.bArchivo = bActualizar;
	}

	
	public JButton getbBorrar() {
		return bBasedeDatos;
	}

	
	public void setbBorrar(JButton bBorrar) {
		this.bBasedeDatos = bBorrar;
	}
	
}