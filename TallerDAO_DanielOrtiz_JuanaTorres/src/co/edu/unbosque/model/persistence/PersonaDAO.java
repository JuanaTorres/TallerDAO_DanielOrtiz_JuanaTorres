package co.edu.unbosque.model.persistence;


import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class PersonaDAO {
	private ArrayList<Persona> personas;
	public PersonaDAO() {
		personas = new ArrayList<Persona>();
	}

//Revisar
	public String verPersonas() {
		String texto = "";
		for (int i = 0; i < personas.size(); i++) {
			texto = texto.concat(personas.get(i).toString() + "\n");
		}
		return texto;
	
	}
	

	public Persona buscarPersona(String id) {

		Persona encontrado = null;

		if (!personas.isEmpty()) {
			for (int i = 0; i < personas.size(); i++) {
				if (personas.get(i).getId().equals(id)) {
					encontrado = personas.get(i);
				}
			}
		}
		return encontrado;

	}


	public boolean agregarPersona(String id, String edad, String nombre, String correo) {

		Persona nuevo = new Persona( id,  edad,  nombre,  correo);

		if (buscarPersona(id) == null) {
			personas.add(nuevo);

			return true;
		} else {
			return false;
		}

	}
	
	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	public boolean actualizarPersona(String id, String nombre, String correo, String edad) {
		
		Persona a = buscarPersona(id);
		
		if(a != null) {
			
			a.setNombre(nombre);
			a.setCorreo(correo);
			a.setEdad(edad);
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public boolean eliminarPersona(String id) {

		boolean resp = false;
		

		Persona a = buscarPersona(id);

		if (a != null) {

			personas.remove(a);
			
			resp = true;

		}
		return resp;

	}

}

