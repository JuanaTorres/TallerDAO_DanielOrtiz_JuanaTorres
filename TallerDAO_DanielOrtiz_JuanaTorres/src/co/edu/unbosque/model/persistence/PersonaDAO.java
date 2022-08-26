package co.edu.unbosque.model.persistence;


import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class PersonaDAO {

	public PersonaDAO() {
	}


	public String verPersona(ArrayList<Persona> Personas) {
		String texto = "";
		for (int i = 0; i < Personas.size(); i++) {
			texto = texto.concat(Personas.get(i).toString() + "\n");
		}
		return texto;
	}

	public Persona buscarPersona(String id, ArrayList<Persona> Personas) {

		Persona encontrado = null;

		if (!Personas.isEmpty()) {
			for (int i = 0; i < Personas.size(); i++) {
				if (Personas.get(i).getId().equals(id)) {
					encontrado = Personas.get(i);
				}
			}
		}
		return encontrado;

	}


	public boolean agregarPersona(String id, String edad, String nombre, String correo,
			ArrayList<Persona> personas) {

		Persona nuevo = new Persona( id,  edad,  nombre,  correo);

		if (buscarPersona(id, personas) == null) {
			personas.add(nuevo);

			return true;
		} else {
			return false;
		}

	}

	public boolean eliminarPersona(String id, ArrayList<Persona> personas) {

		boolean resp = false;
		

		Persona a = buscarPersona(id, personas);

		if (a != null) {

			personas.remove(a);
			
			resp = true;

		}
		return resp;

	}

}

