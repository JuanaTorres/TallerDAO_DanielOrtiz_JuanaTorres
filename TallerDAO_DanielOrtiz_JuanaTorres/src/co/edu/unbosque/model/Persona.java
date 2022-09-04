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
		
	}
	
	public Persona() {
		
		
		
	}
	
	private void verificarInvariante() {
		
		assert id!= null : "La identificación no puede ser null";
		assert edad != null : "La edad no puede ser null";
		assert nombre != null : "El nombre no puede ser null";
		assert correo != null : "El correo no puede ser null";
		
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