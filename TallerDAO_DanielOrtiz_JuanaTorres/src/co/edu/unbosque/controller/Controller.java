package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View vista;
	
	public Controller() {
		
		Archivo archivo = new Archivo();
		vista = new View();
		vista.getPanel1().getbActualizar().addActionListener(this);
		vista.getPanel1().getbArreglo().addActionListener(this);
		vista.getPanel1().getbArchivo().addActionListener(this);
		vista.getPanel1().getbBasedeDatos().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getActionCommand()) {
		
		case "Actualizar":
			
			vista.getPanel2().setVisible(true);
			vista.getPanel2().setEnabled(true);
			vista.getPanel3().setVisible(false);
			vista.getPanel3().setEnabled(false);
			
			break;
		
		case "Arreglo":
			
			vista.getPanel2().setVisible(false);
			vista.getPanel2().setEnabled(false);
			vista.getPanel3().setVisible(true);
			vista.getPanel3().setEnabled(true);
			
			break;
			
		case "Archivo":
			
			vista.getPanel2().setVisible(false);
			vista.getPanel2().setEnabled(false);
			vista.getPanel3().setVisible(false);
			vista.getPanel3().setEnabled(false);
			
			break;
		
		case "Base de Datos":
			
			vista.getPanel2().setVisible(false);
			vista.getPanel2().setEnabled(false);
			vista.getPanel3().setVisible(false);
			vista.getPanel3().setEnabled(false);
			
			break;
		
		}
		
	}
	
}