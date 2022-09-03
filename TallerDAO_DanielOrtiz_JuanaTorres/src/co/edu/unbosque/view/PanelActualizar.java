package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelActualizar extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lBusId, lNombre, lCorreo, lEdad;
	private JTextField tBusquedaId, tNickNuevo, tNombre, tCorreo, tEdad;
	private JButton bBuscar, bActualizar;
	
	public PanelActualizar() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("Actualizar Perfil");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		lBusId = new JLabel("Buscar");
		lBusId.setBounds(10, 20, 46, 20);
		lBusId.setOpaque(false);
		lBusId.setForeground(Color.BLACK);
		add(lBusId);
		
		tBusquedaId = new JTextField();
		tBusquedaId.setBounds(70, 20, 140, 20);
		tBusquedaId.setForeground(Color.black);
		add(tBusquedaId);
		
		bBuscar = new JButton("Buscar");
		bBuscar.setBounds(230, 20, 80, 20);
		bBuscar.setOpaque(true);
		bBuscar.setBackground(Color.WHITE);
		bBuscar.setForeground(Color.BLACK);
		add(bBuscar);
		
		//Ingreso de los nuevos Datos
		
		lNombre = new JLabel("Nombre");
		lNombre.setBounds(40, 52, 80, 20);
		lNombre.setHorizontalAlignment(JLabel.CENTER);
		lNombre.setOpaque(true);
		lNombre.setBackground(Color.DARK_GRAY);
		lNombre.setForeground(Color.WHITE);
		lNombre.setVisible(true);
		add(lNombre);
		
		tNombre = new JTextField();
		tNombre.setBounds(140, 52, 140, 20);
		tNombre.setBackground(Color.DARK_GRAY);
		tNombre.setForeground(Color.WHITE);
		tNombre.setVisible(true);
		add(tNombre);
		
		lCorreo = new JLabel("Correo");
		lCorreo.setBounds(40, 76, 80, 20);
		lCorreo.setHorizontalAlignment(JLabel.CENTER);
		lCorreo.setOpaque(true);
		lCorreo.setBackground(Color.DARK_GRAY);
		lCorreo.setForeground(Color.WHITE);
		lCorreo.setVisible(true);
		add(lCorreo);
		
		tCorreo = new JTextField();
		tCorreo.setBounds(140, 76, 140, 20);
		tCorreo.setBackground(Color.DARK_GRAY);
		tCorreo.setForeground(Color.WHITE);
		tCorreo.setVisible(true);
		add(tCorreo);
		
		lEdad = new JLabel("Edad");
		lEdad.setBounds(40, 100, 80, 20);
		lEdad.setHorizontalAlignment(JLabel.CENTER);
		lEdad.setOpaque(true);
		lEdad.setBackground(Color.DARK_GRAY);
		lEdad.setForeground(Color.WHITE);
		lEdad.setVisible(true);
		add(lEdad);
		
		tEdad = new JTextField();
		tEdad.setBounds(140, 100, 140, 20);
		tEdad.setBackground(Color.DARK_GRAY);
		tEdad.setForeground(Color.WHITE);
		tEdad.setVisible(true);
		add(tEdad);
		
		bActualizar = new JButton("Actualizar Datos");
		bActualizar.setBounds(80, 148, 160, 20);
		bActualizar.setOpaque(true);
		bActualizar.setBackground(Color.WHITE);
		bActualizar.setForeground(Color.BLACK);
		bActualizar.setVisible(true);
		add(bActualizar);
		
	}
	
	
	
}