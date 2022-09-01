package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View vista;
	
	public Controller() {
		
		vista = new View();
		Archivo archivo = new Archivo();
	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getActionCommand()) {
		
		case "Actualizar":
			
			break;
		
		case "Arreglo":
			
			break;
			
		case "Archivo":
			
			break;
		
		case "Base de Datos":
			
			break;
		
		}
		
	}
	
}