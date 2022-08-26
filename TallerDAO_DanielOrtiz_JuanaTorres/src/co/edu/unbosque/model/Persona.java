package co.edu.unbosque.model;

public class Persona {
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