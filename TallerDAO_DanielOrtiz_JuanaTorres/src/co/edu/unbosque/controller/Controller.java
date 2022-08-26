package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.View;

public class Controller {
	private View vista;
	
	public Controller() {
		 System.out.println("as");
		vista= new View();
		Archivo archivo = new Archivo();
		//funcionar();
	}
	public void funcionar() {
		int num= vista.leerDatoEntero("ingrese numero de elementos de serie de fibonacci");
		
	}
}
