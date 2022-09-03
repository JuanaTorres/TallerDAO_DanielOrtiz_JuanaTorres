package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelArreglo extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea texto;
	private JScrollPane barraDes;
	
	public PanelArreglo() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Gamers");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		texto = new JTextArea();
		texto.setFont(new Font("Arial Black", Font.BOLD,12));
		texto.setEditable(false);
		add(texto);
		
		barraDes = new JScrollPane(texto);
		barraDes.setBounds(10, 20, 304, 150);
		add(barraDes);
		
	}

	
	public JTextArea getTexto() {
		return texto;
	}

	
	public void setTexto(JTextArea texto) {
		this.texto = texto;
	}

	
	public JScrollPane getBarraDes() {
		return barraDes;
	}

	
	public void setBarraDes(JScrollPane barraDes) {
		this.barraDes = barraDes;
	}
	
}