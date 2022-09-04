package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private Mundo modelo;
	private View vista;

	public Controller() {

		modelo = new Mundo();
		modelo.setBaseDatos("");
		vista = new View();

		vista.getPanel1().getbArreglo().addActionListener(this);
		vista.getPanel1().getbArchivo().addActionListener(this);
		vista.getPanel1().getbBasedeDatos().addActionListener(this);
		vista.getPanel1().getbCassandra().addActionListener(this);

		vista.getPanel2().getbCrearArr().addActionListener(this);
		vista.getPanel2().getbLeerArr().addActionListener(this);
		vista.getPanel2().getbActualizarArr().addActionListener(this);
		vista.getPanel2().getbBorrarArr().addActionListener(this);

		vista.getPanel3().getbCrearArch().addActionListener(this);
		vista.getPanel3().getbLeerArch().addActionListener(this);
		vista.getPanel3().getbActualizarArch().addActionListener(this);
		vista.getPanel3().getbBorrarArch().addActionListener(this);

		vista.getPanel4().getbCrearB().addActionListener(this);
		vista.getPanel4().getbLeerB().addActionListener(this);
		vista.getPanel4().getbActualizarB().addActionListener(this);
		vista.getPanel4().getbBorrarB().addActionListener(this);

		vista.getPanel5().getbCrearC().addActionListener(this);
		vista.getPanel5().getbLeerC().addActionListener(this);
		vista.getPanel5().getbActualizarC().addActionListener(this);
		vista.getPanel5().getbBorrarC().addActionListener(this);

		vista.getPanel6().getbCRUD().addActionListener(this);
		vista.getPanel6().getbBuscar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		switch (e.getActionCommand()) {

		case "Arreglo":

			vista.getPanel2().setVisible(true);
			vista.getPanel2().setEnabled(true);
			vista.getPanel3().setVisible(false);
			vista.getPanel3().setEnabled(false);
			vista.getPanel4().setVisible(false);
			vista.getPanel4().setEnabled(false);
			vista.getPanel5().setVisible(false);
			vista.getPanel5().setEnabled(false);
			vista.getPanel6().setVisible(false);
			vista.getPanel6().setEnabled(false);
			modelo.cerrarBaseDatos();
			modelo.setBaseDatos("Arreglo");
			modelo.inicializarBaseDatos();
			break;

		case "Archivo":

			vista.getPanel2().setVisible(false);
			vista.getPanel2().setEnabled(false);
			vista.getPanel3().setVisible(true);
			vista.getPanel3().setEnabled(true);
			vista.getPanel4().setVisible(false);
			vista.getPanel4().setEnabled(false);
			vista.getPanel5().setVisible(false);
			vista.getPanel5().setEnabled(false);
			vista.getPanel6().setVisible(false);
			vista.getPanel6().setEnabled(false);
			modelo.cerrarBaseDatos();
			modelo.setBaseDatos("Archivo");
			modelo.inicializarBaseDatos();
			break;

		case "SQLlite":

			vista.getPanel2().setVisible(false);
			vista.getPanel2().setEnabled(false);
			vista.getPanel3().setVisible(false);
			vista.getPanel3().setEnabled(false);
			vista.getPanel4().setVisible(true);
			vista.getPanel4().setEnabled(true);
			vista.getPanel5().setVisible(false);
			vista.getPanel5().setEnabled(false);
			vista.getPanel6().setVisible(false);
			vista.getPanel6().setEnabled(false);
			modelo.cerrarBaseDatos();
			modelo.setBaseDatos("SqlLite");
			modelo.inicializarBaseDatos();
			break;

		case "Cassandra":

			vista.getPanel2().setVisible(false);
			vista.getPanel2().setEnabled(false);
			vista.getPanel3().setVisible(false);
			vista.getPanel3().setEnabled(false);
			vista.getPanel4().setVisible(false);
			vista.getPanel4().setEnabled(false);
			vista.getPanel5().setVisible(true);
			vista.getPanel5().setEnabled(true);
			vista.getPanel6().setVisible(false);
			vista.getPanel6().setEnabled(false);
			modelo.cerrarBaseDatos();
			modelo.setBaseDatos("Cassandra");
			modelo.inicializarBaseDatos();
			break;

			//CRUD Arreglo
		case "Crear Persona en Arreglo":

			vista.getPanel6().Crear();
			vista.getPanel6().getbCRUD().setText("Crear en Arreglo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
		
		case "Crear en Arreglo":
			
			break;
			
		case "Leer Personas en Arreglo":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Actualizar Persona en Arreglo":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en Arreglo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar en Arreglo":
			
			break;
			
		case "Borrar Persona en Arreglo":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en Arreglo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Borrar en Arreglo":
			
			break;

			//CRUD Archivo
		case "Crear Persona en Archivo":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Crear en Archivo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Crear en Archivo":
			
			break;

		case "Leer Persona en Archivo":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar Persona en Archivo":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en Archivo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar en Archivo":
			
			break;
			
		case "Borrar Persona en Archivo":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en Archivo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Borrar en Archivo":
			
			break;
			
			//CRUD SQLlite
		case "Iniciar SQLlite":
			
			
			break;

		case "Cerrar SQLlite":

			break;

		case "Crear Persona en SQLlite":

			vista.getPanel6().Crear();
			vista.getPanel6().getbCRUD().setText("Crear en SQLlite");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Crear en SQLlite":
			
			break;

		case "Leer Persona en SQLlite":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar Persona en SQLlite":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en SQLlite");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Actualizar en SQLlite":
			
			break;

		case "Borrar Persona en SQLlite":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en SQLlite");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Borrar en SQLlite":
			
			break;

			//CRUD Cassandra
		case "Iniciar Cassandra":

			break;

		case "Cerrar Cassandra":

			break;

		case "Crear Persona en Cassandra":

			vista.getPanel6().Crear();
			vista.getPanel6().getbCRUD().setText("Crear en Cassandra");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Crear en Cassandra":
			
			break;

		case "Leer Persona en Cassandra":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar Persona en Cassandra":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en Cassandra");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Actualizar en Cassandra":
			
			break;

		case "Borrar Persona en Cassandra":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en Cassandra");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;
			
		case "Borrar en Cassandra":
			
			break;

		case "Buscar":

			if(vista.getPanel6().gettBusquedaId().getText().equals("")) {

				vista.getPanel6().gettNombre().setText("");
				vista.getPanel6().gettCorreo().setText("");
				vista.getPanel6().gettEdad().setText("");

			}

			break;

		}

	}

}