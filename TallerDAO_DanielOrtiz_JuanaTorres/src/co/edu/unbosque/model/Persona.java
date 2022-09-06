package co.edu.unbosque.model;

import java.io.Serializable;

public class Persona implements Serializable{
	
	public String id;
	public String edad;
	public String nombre;
	public String correo;
	
	public Persona(String id, String edad, String nombre, String correo) {
		
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.correo = correo;
		verificarInvariante();
		
	}
	
	public Persona() {
		
		verificarInvariante();
		
	}
	
	private void verificarInvariante() {
		
		assert id!= null && !id.trim().equals("") : "La identificación no puede ser null";
		assert edad != null && !edad.trim().equals("") : "La edad no puede ser null";
		assert nombre != null && !nombre.trim().equals("") : "El nombre no puede ser null";
		assert correo != null && !correo.trim().equals("") : "El correo no puede ser null";
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
}