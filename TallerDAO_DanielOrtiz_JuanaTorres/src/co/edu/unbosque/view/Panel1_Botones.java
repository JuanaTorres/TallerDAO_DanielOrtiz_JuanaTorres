package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel1_Botones extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton bArreglo, bArchivo, bBasedeDatos, bCassandra;
	
	public Panel1_Botones() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Opciones");
		border.setTitleFont(new Font("Arial Black", Font.BOLD,12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		bArreglo = new JButton("Arreglo");
		bArreglo.setBounds(10, 20, 120, 30);
		bArreglo.setOpaque(true);
		bArreglo.setFont(new Font("Arial Black", Font.BOLD, 12));
		bArreglo.setBackground(Color.WHITE);
		bArreglo.setForeground(Color.BLACK);
		add(bArreglo);
		
		bArchivo = new JButton("Archivo");
		bArchivo.setBounds(10, 60, 120, 30);
		bArchivo.setOpaque(true);
		bArchivo.setFont(new Font("Arial Black", Font.BOLD, 12));
		bArchivo.setBackground(Color.WHITE);
		bArchivo.setForeground(Color.BLACK);
		add(bArchivo);
		
		bBasedeDatos = new JButton("SQLlite");
		bBasedeDatos.setBounds(10, 100, 120, 30);
		bBasedeDatos.setOpaque(true);
		bBasedeDatos.setFont(new Font("Arial Black", Font.BOLD, 12));
		bBasedeDatos.setBackground(Color.WHITE);
		bBasedeDatos.setForeground(Color.BLACK);
		add(bBasedeDatos);
		
		bCassandra= new JButton("Cassandra");
		bCassandra.setBounds(10, 140, 120, 30);
		bCassandra.setOpaque(true);
		bCassandra.setFont(new Font("Arial Black", Font.BOLD, 12));
		bCassandra.setBackground(Color.WHITE);
		bCassandra.setForeground(Color.BLACK);
		add(bCassandra);
		
	}

	public JButton getbArreglo() {
		return bArreglo;
	}

	public void setbArreglo(JButton bArreglo) {
		this.bArreglo = bArreglo;
	}

	public JButton getbArchivo() {
		return bArchivo;
	}

	public void setbArchivo(JButton bArchivo) {
		this.bArchivo = bArchivo;
	}

	public JButton getbBasedeDatos() {
		return bBasedeDatos;
	}

	public void setbBasedeDatos(JButton bBasedeDatos) {
		this.bBasedeDatos = bBasedeDatos;
	}
	
	public JButton getbCassandra() {
		return bCassandra;
	}
	
	public void setbCassandra(JButton bCassandra) {
		this.bCassandra = bCassandra;
	}
	
}