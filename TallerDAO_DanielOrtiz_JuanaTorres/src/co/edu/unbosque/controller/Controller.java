package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;
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
			String persona = modelo.insertarBaseDatos(
					vista.getPanel6().gettId().getText(),
					vista.getPanel6().gettEdad().getText(),
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (persona.contains("error")) {

				vista.jopMessage(persona, "Error", 2);

			} else {
				vista.jopMessage(persona, "Info", 1);
			}
			break;

		case "Leer Personas en Arreglo":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);

			String arreglo = modelo.leerBaseDatos();
			vista.getPanel6().gettLectura().setText(arreglo);
			break;

		case "Actualizar Persona en Arreglo":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en Arreglo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar en Arreglo":

			vista.MensajeConsola(vista.getPanel6().gettBusquedaId().getText());
			String actualizar = modelo.actualizarBaseDatos(
					vista.getPanel6().gettBusquedaId().getText(), 
					vista.getPanel6().gettEdad().getText(), 
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (actualizar.contains("error")) {

				vista.jopMessage(actualizar, "Error", 2);

			} else {
				vista.jopMessage(actualizar, "Info", 1);
			}

			break;

		case "Borrar Persona en Arreglo":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en Arreglo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Borrar en Arreglo":

			String borrar = modelo.eliminarBaseDatos(vista.getPanel6().gettBusquedaId().getText());
			if (borrar.contains("error")) {

				vista.jopMessage(borrar, "Error", 2);

			} else {
				vista.jopMessage(borrar, "Info", 1);
			}
			break;


			//CRUD Archivo
		case "Crear Persona en Archivo":

			vista.getPanel6().Crear();
			vista.getPanel6().getbCRUD().setText("Crear en Archivo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Crear en Archivo":
			String persona4 = modelo.insertarBaseDatos(
					vista.getPanel6().gettId().getText(),
					vista.getPanel6().gettEdad().getText(),
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (persona4.contains("error")) {

				vista.jopMessage(persona4, "Error", 2);

			} else {
				vista.jopMessage(persona4, "Info", 1);
			}
			break;

		case "Leer Personas en Archivo":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			
			String archivo = modelo.leerBaseDatos();
			vista.getPanel6().gettLectura().setText(archivo);
			break;

		case "Actualizar Persona en Archivo":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en Archivo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar en Archivo":

			String actualizar1 = modelo.actualizarBaseDatos(
					vista.getPanel6().gettBusquedaId().getText(), 
					vista.getPanel6().gettEdad().getText(), 
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (actualizar1.contains("error")) {

				vista.jopMessage(actualizar1, "Error", 2);

			} else {
				vista.jopMessage(actualizar1, "Info", 1);
			}

			break;

		case "Borrar Persona en Archivo":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en Archivo");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Borrar en Archivo":

			String borrar1 = modelo.eliminarBaseDatos(vista.getPanel6().gettBusquedaId().getText());
			if (borrar1.contains("error")) {

				vista.jopMessage(borrar1, "Error", 2);

			} else {
				vista.jopMessage(borrar1, "Info", 1);
			}
			break;


			//CRUD SQLlite
		case "Crear Persona en SQLlite":

			vista.getPanel6().Crear();
			vista.getPanel6().getbCRUD().setText("Crear en SQLlite");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Crear en SQLlite":

			String persona7 = modelo.insertarBaseDatos(
					vista.getPanel6().gettId().getText(),
					vista.getPanel6().gettEdad().getText(),
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (persona7.contains("error")) {

				vista.jopMessage(persona7, "Error", 2);

			} else {
				vista.jopMessage(persona7, "Info", 1);
			}
			break;

		case "Leer Personas en SQLlite":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			
			String basededatos= modelo.leerBaseDatos();
			vista.getPanel6().gettLectura().setText(basededatos);
			break;

		case "Actualizar Persona en SQLlite":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en SQLlite");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar en SQLlite":

			String actualizar2 = modelo.actualizarBaseDatos(
					vista.getPanel6().gettBusquedaId().getText(), 
					vista.getPanel6().gettEdad().getText(), 
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (actualizar2.contains("error")) {

				vista.jopMessage(actualizar2, "Error", 2);

			} else {
				vista.jopMessage(actualizar2, "Info", 1);
			}

			break;

		case "Borrar Persona en SQLlite":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en SQLlite");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Borrar en SQLlite":

			String borrar3 = modelo.eliminarBaseDatos(vista.getPanel6().gettBusquedaId().getText());
			if (borrar3.contains("error")) {

				vista.jopMessage(borrar3, "Error", 2);

			} else {
				vista.jopMessage(borrar3, "Info", 1);
			}
			break;


			//CRUD Cassandra
		case "Crear Persona en Cassandra":

			vista.getPanel6().Crear();
			vista.getPanel6().getbCRUD().setText("Crear en Cassandra");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Crear en Cassandra":

			String persona12 = modelo.insertarBaseDatos(
					vista.getPanel6().gettId().getText(),
					vista.getPanel6().gettEdad().getText(),
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (persona12.contains("error")) {

				vista.jopMessage(persona12, "Error", 2);

			} else {
				vista.jopMessage(persona12, "Info", 1);
			}
			break;

		case "Leer Personas en Cassandra":

			vista.getPanel6().Leer();
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			
			String cassandra = modelo.leerBaseDatos();
			vista.getPanel6().gettLectura().setText(cassandra);
			break;

		case "Actualizar Persona en Cassandra":

			vista.getPanel6().Actualizar();
			vista.getPanel6().getbCRUD().setText("Actualizar en Cassandra");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Actualizar en Cassandra":

			String actualizar4 = modelo.actualizarBaseDatos(
					vista.getPanel6().gettBusquedaId().getText(), 
					vista.getPanel6().gettEdad().getText(), 
					vista.getPanel6().gettNombre().getText(),
					vista.getPanel6().gettCorreo().getText());
			if (actualizar4.contains("error")) {

				vista.jopMessage(actualizar4, "Error", 2);

			} else {
				vista.jopMessage(actualizar4, "Info", 1);
			}

			break;

		case "Borrar Persona en Cassandra":

			vista.getPanel6().Borrar();
			vista.getPanel6().getbCRUD().setText("Borrar en Cassandra");
			vista.getPanel6().setVisible(true);
			vista.getPanel6().setEnabled(true);
			break;

		case "Borrar en Cassandra":

			String borrar4 = modelo.eliminarBaseDatos(vista.getPanel6().gettBusquedaId().getText());
			if (borrar4.contains("error")) {

				vista.jopMessage(borrar4, "Error", 2);

			} else {
				vista.jopMessage(borrar4, "Info", 1);
			}
			break;

		case "Buscar":

			if(vista.getPanel6().gettBusquedaId().getText().equals("")) {

				vista.getPanel6().gettNombre().setText("");
				vista.getPanel6().gettCorreo().setText("");
				vista.getPanel6().gettEdad().setText("");

				vista.jopMessage("Ingresa un Id a buscar", "!Atención!", 1);

			} else {

				String busqueda = vista.getPanel6().gettBusquedaId().getText();

				String persona2 = modelo.buscarBaseDatos(busqueda);

				if (persona2.contains("No existe una persona con la id")) {

					vista.jopMessage(persona2, "Error", 2);

				} else {

					String[] p2split = persona2.split(" \\| ");

					vista.getPanel6().getbCRUD().setEnabled(true);
					vista.getPanel6().gettNombre().setText(p2split[1]);
					vista.getPanel6().gettCorreo().setText(p2split[2]);
					vista.getPanel6().gettEdad().setText(p2split[3]);

				}	

			}

			break;

		}

	}

}