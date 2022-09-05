package co.edu.unbosque.model;

import com.datastax.driver.core.Row;

import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.Cassandra;
import co.edu.unbosque.model.persistence.PersonaDAO;
import co.edu.unbosque.model.persistence.SqlLite_BD;

public class Mundo {
	private PersonaDAO personaDao;
	private Archivo archivo;
	private SqlLite_BD sqlLite;
	private Cassandra cassandra;
	private String baseDatos;
	
	public Mundo() {
		
	}
	
	public void inicializarBaseDatos() {
		
		if(baseDatos.equals("SqlLite")) {
			
			sqlLite = new SqlLite_BD();
			
		}else if(baseDatos.equals("Cassandra")) {
			
			cassandra = new Cassandra();
			
		}else if(baseDatos.equals("Archivo")||baseDatos.equals("Arreglo")) {
			
			archivo= new Archivo ();
			personaDao =new PersonaDAO();
			
		}
	}
	
	public void cerrarBaseDatos() {
		
		if(baseDatos.equals("SqlLite")) {
			
			sqlLite.desconectar();
			
		}else if(baseDatos.equals("Cassandra")) {
			
			cassandra.desconectar();
		}
	}
	
	public String insertarBaseDatos(String id, String edad, String nombre, String correo) {
		
		boolean res;
		if(baseDatos.equals("SqlLite")) {
			
			res = sqlLite.insertar(id, nombre, correo, edad);
			
		}else if(baseDatos.equals("Cassandra")) {
			
			res = cassandra.insertarPersona(id, nombre, correo, edad);
			
		}else  {
			
			res = personaDao.agregarPersona(id, edad, nombre, correo);
			archivo.escribirABinario(personaDao.getPersonas());
			
		}
		if (res) {
			
			return "La persona con id; "+ id +", se creo correctamente";
		
		}
		
		return "Ya existe la personacon ese id, ocurrio un error";
		
	}
	
	public String actualizarBaseDatos(String id, String edad, String nombre, String correo) {
		
		boolean res;
		if(baseDatos.equals("SqlLite")) {
			
			res=sqlLite.actualizar(id, nombre, correo, edad);
			
		}else if(baseDatos.equals("Cassandra")) {
			
			res=cassandra.actualizarPersona(id, nombre, correo, edad);
			
		}else{
			
			res = personaDao.actualizarPersona(id, nombre, correo, edad);
			archivo.escribirABinario(personaDao.getPersonas());
			
		}
		
		if (res) {
			
			return "La persona con id; "+ id +", se actualizo correctamente";
			
		}
		
		return "No existe la persona a actualizar, ocurrio un error";
		
	}
	
	public String eliminarBaseDatos(String id) {
		
		boolean res;
		
		if(baseDatos.equals("SqlLite")) {
			
			res=sqlLite.eliminar(id);
			
		}else if(baseDatos.equals("Cassandra")) {
			
			res=cassandra.eliminarPersona(id);
			
		}else  {
			
			res=personaDao.eliminarPersona(id);
			archivo.escribirABinario(personaDao.getPersonas());
			
		}
		if (res) {
			
			return "La persona con id; "+ id +", se elimino correctamente";
			
		}
		
		return "No existe la persona a eliminar, ocurrio un error";
		
	}
	
	public String buscarBaseDatos(String id) {
		
		String res;
		if(baseDatos.equals("SqlLite")) {
			
			res=sqlLite.buscar(id);
			
		}else if(baseDatos.equals("Cassandra")) {
			
			Row r = cassandra.buscarPersona(id);
			res=r.getString("id")+","+r.getString("Nombre")+","+r.getString("Edad")+","+r.getString("Correo");
			
		}else {
			
			Persona p = personaDao.buscarPersona(id);
			res = p.id+" | "+p.nombre+" | "+ p.edad+" | "+p.correo;
			
		}
		
		if(res==null) {
			
			return "No existe una persona con la id: "+ id;
			
		}
		
		return res;
		
	}
	
	public String leerBaseDatos() {
		
		String res = "";
		
		if(baseDatos.equals("SqlLite")) {
			
			res=sqlLite.seleccionar();
			
		}else if(baseDatos.equals("Cassandra")) {
			
			res=cassandra.leerTabla();
			
		}else if(baseDatos.equals("Archivo")) {
			
			res=archivo.leerRegistro();
			
		}else {
			
			res=personaDao.verPersonas();
			
		}
		
		if(res==null) {
			
			return "No existen personas aun";
			
		}
		//Reestructurar salida
		return " ID | Nombre | Edad | Correo \n "+res;
	}
	
	public PersonaDAO getPersonaDao() {
		
		return personaDao;
		
	}
	
	public void setPersonaDao(PersonaDAO personaDao) {
		
		this.personaDao = personaDao;
		
	}
	public Archivo getArchivo() {
		return archivo;
	}
	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
	public SqlLite_BD getSqlLite() {
		return sqlLite;
	}
	public void setSqlLite(SqlLite_BD sqlLite) {
		this.sqlLite = sqlLite;
	}
	public Cassandra getCassandra() {
		return cassandra;
	}
	public void setCassandra(Cassandra cassandra) {
		this.cassandra = cassandra;
	}
	public String getBaseDatos() {
		return baseDatos;
	}
	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
	
}
