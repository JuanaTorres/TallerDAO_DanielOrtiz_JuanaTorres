package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel6_CRUD extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lBusId, lId, lNombre, lCorreo, lEdad;
	private JTextField tBusquedaId, tId, tNombre, tCorreo, tEdad;
	private JTextArea tLectura;
	private JScrollPane barraDes;
	private JButton bBuscar, bCRUD;
	
	public Panel6_CRUD() {
		
		setLayout(null);
		
		TitledBorder border = BorderFactory.createTitledBorder("CRUD");
		border.setTitleFont(new Font("Arial Black", Font.BOLD, 12));
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		
		//Busqueda Id
		lBusId = new JLabel("Buscar");
		lBusId.setBounds(10, 20, 46, 20);
		lBusId.setOpaque(false);
		lBusId.setForeground(Color.BLACK);
		lBusId.setVisible(false);
		lBusId.setEnabled(false);
		add(lBusId);
		
		tBusquedaId = new JTextField();
		tBusquedaId.setBounds(70, 20, 140, 20);
		tBusquedaId.setForeground(Color.black);
		tBusquedaId.setVisible(false);
		tBusquedaId.setEnabled(false);
		add(tBusquedaId);
		
		bBuscar = new JButton("Buscar");
		bBuscar.setBounds(230, 20, 80, 20);
		bBuscar.setOpaque(true);
		bBuscar.setBackground(Color.WHITE);
		bBuscar.setForeground(Color.BLACK);
		bBuscar.setVisible(false);
		bBuscar.setEnabled(false);
		add(bBuscar);
		
		//Ingreso de los nuevos Datos
		
		lId = new JLabel("Id");
		lId.setBounds(40, 28, 80, 20);
		lId.setHorizontalAlignment(JLabel.CENTER);
		lId.setOpaque(true);
		lId.setBackground(Color.DARK_GRAY);
		lId.setForeground(Color.WHITE);
		lId.setVisible(true);
		add(lId);
		
		tId= new JTextField();
		tId.setBounds(140, 28, 140, 20);
		tId.setBackground(Color.DARK_GRAY);
		tId.setForeground(Color.WHITE);
		tId.setVisible(true);
		add(tId);
		
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
		
		bCRUD = new JButton("");
		bCRUD.setBounds(40, 148, 240, 40);
		bCRUD.setFont(new Font("Arial Black", Font.BOLD, 12));
		bCRUD.setOpaque(true);
		bCRUD.setBackground(Color.WHITE);
		bCRUD.setForeground(Color.BLACK);
		bCRUD.setVisible(true);
		add(bCRUD);
		
		//Lectura
		
		tLectura = new JTextArea();
		tLectura.setFont(new Font("Arial Black", Font.BOLD,12));
		tLectura.setEditable(false);
		add(tLectura);
		
		barraDes = new JScrollPane(tLectura);
		barraDes.setBounds(10, 20, 304, 190);
		barraDes.setVisible(false);
		add(barraDes);
		
	}
	
	public void Crear() {
		
		lBusId.setVisible(false);
		lBusId.setEnabled(false);
		tBusquedaId.setVisible(false);
		tBusquedaId.setEnabled(false);
		bBuscar.setVisible(false);
		bBuscar.setEnabled(false);
		
		lId.setVisible(true);
		tId.setVisible(true);
		tId.setEditable(true);
		tId.setText("");
		
		lNombre.setVisible(true);
		tNombre.setVisible(true);
		tNombre.setEditable(true);
		tNombre.setText("");
		
		lCorreo.setVisible(true);
		tCorreo.setVisible(true);
		tCorreo.setEditable(true);
		tCorreo.setText("");
		
		lEdad.setVisible(true);
		tEdad.setVisible(true);
		tEdad.setEditable(true);
		tEdad.setText("");
		
		bCRUD.setVisible(true);
		bCRUD.setEnabled(true);
		
		barraDes.setVisible(false);
		
	}
	
	public void Leer() {
		
		lBusId.setVisible(false);
		lBusId.setEnabled(false);
		tBusquedaId.setVisible(false);
		tBusquedaId.setEnabled(false);
		bBuscar.setVisible(false);
		bBuscar.setEnabled(false);
		
		lId.setVisible(false);
		tId.setVisible(false);
		
		lNombre.setVisible(false);
		tNombre.setVisible(false);
		
		lCorreo.setVisible(false);
		tCorreo.setVisible(false);
		
		lEdad.setVisible(false);
		tEdad.setVisible(false);
		
		bCRUD.setVisible(false);
		
		barraDes.setVisible(true);
		
	}
	
	public void Actualizar() {
		
		lBusId.setVisible(true);
		lBusId.setEnabled(true);
		tBusquedaId.setVisible(true);
		tBusquedaId.setEnabled(true);
		tBusquedaId.setText("");
		bBuscar.setVisible(true);
		bBuscar.setEnabled(true);
		
		lId.setVisible(false);
		tId.setVisible(false);
		tId.setEditable(true);
		tId.setText("");
		
		lNombre.setVisible(true);
		tNombre.setVisible(true);
		tNombre.setEditable(true);
		tNombre.setText("");
		
		lCorreo.setVisible(true);
		tCorreo.setVisible(true);
		tCorreo.setEditable(true);
		tCorreo.setText("");
		
		lEdad.setVisible(true);
		tEdad.setVisible(true);
		tEdad.setEditable(true);
		tEdad.setText("");
		
		bCRUD.setVisible(true);
		bCRUD.setEnabled(false);
		
		barraDes.setVisible(false);
		
	}
	
	public void Borrar() {
		
		lBusId.setVisible(true);
		lBusId.setEnabled(true);
		tBusquedaId.setVisible(true);
		tBusquedaId.setEnabled(true);
		tBusquedaId.setText("");
		bBuscar.setVisible(true);
		bBuscar.setEnabled(true);
		
		lId.setVisible(false);
		tId.setVisible(false);
		tId.setText("");
		
		lNombre.setVisible(true);
		tNombre.setVisible(true);
		tNombre.setEditable(false);
		tNombre.setText("");
		
		lCorreo.setVisible(true);
		tCorreo.setVisible(true);
		tCorreo.setEditable(false);
		tCorreo.setText("");
		
		lEdad.setVisible(true);
		tEdad.setVisible(true);
		tEdad.setEditable(false);
		tEdad.setText("");
		
		bCRUD.setVisible(true);
		bCRUD.setEnabled(false);
		
		barraDes.setVisible(false);
		
	}
	
	public JLabel getlBusId() {
		return lBusId;
	}

	public void setlBusId(JLabel lBusId) {
		this.lBusId = lBusId;
	}

	public JLabel getlId() {
		return lId;
	}

	public void setlId(JLabel lId) {
		this.lId = lId;
	}

	public JLabel getlNombre() {
		return lNombre;
	}

	public void setlNombre(JLabel lNombre) {
		this.lNombre = lNombre;
	}

	public JLabel getlCorreo() {
		return lCorreo;
	}

	public void setlCorreo(JLabel lCorreo) {
		this.lCorreo = lCorreo;
	}

	public JLabel getlEdad() {
		return lEdad;
	}

	public void setlEdad(JLabel lEdad) {
		this.lEdad = lEdad;
	}

	public JTextField gettBusquedaId() {
		return tBusquedaId;
	}

	public void settBusquedaId(JTextField tBusquedaId) {
		this.tBusquedaId = tBusquedaId;
	}

	public JTextField gettId() {
		return tId;
	}

	public void settId(JTextField tId) {
		this.tId = tId;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public void settNombre(JTextField tNombre) {
		this.tNombre = tNombre;
	}

	public JTextField gettCorreo() {
		return tCorreo;
	}

	public void settCorreo(JTextField tCorreo) {
		this.tCorreo = tCorreo;
	}

	public JTextField gettEdad() {
		return tEdad;
	}

	public void settEdad(JTextField tEdad) {
		this.tEdad = tEdad;
	}

	public JTextArea gettLectura() {
		return tLectura;
	}

	public void settLectura(JTextArea tLectura) {
		this.tLectura = tLectura;
	}

	public JScrollPane getBarraDes() {
		return barraDes;
	}

	public void setBarraDes(JScrollPane barraDes) {
		this.barraDes = barraDes;
	}

	public JButton getbBuscar() {
		return bBuscar;
	}

	public void setbBuscar(JButton bBuscar) {
		this.bBuscar = bBuscar;
	}

	public JButton getbCRUD() {
		return bCRUD;
	}

	public void setbCRUD(JButton bCRUD) {
		this.bCRUD = bCRUD;
	}
	
}