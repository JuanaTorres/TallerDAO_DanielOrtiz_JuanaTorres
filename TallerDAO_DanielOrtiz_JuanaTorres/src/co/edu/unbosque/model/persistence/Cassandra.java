package co.edu.unbosque.model.persistence;

import java.util.Iterator;
import java.util.UUID;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ProtocolVersion;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.exceptions.AlreadyExistsException;

public class Cassandra {
	private Cluster cluster;
	private Session sesion;

	public Cassandra() {
		conectarCassandra();
		
	}
	public void conectarCassandra(){
		try {
			cluster = Cluster.builder()
					.addContactPoint("127.0.0.1")
					.withProtocolVersion(ProtocolVersion.V3)
					.build();
			sesion = cluster.connect();
			sesion.execute("CREATE KEYSPACE keyspace1 " +
					"WITH replication = " +
					"{ 'class' : 'SimpleStrategy', 'replication_factor' : 1 }");
			sesion.execute(
					"CREATE TABLE keyspace1.Persona (\r\n"
							+ "	id text,\r\n"
							+ "	Nombre text,\r\n"
							+ "	Correo text,\r\n"
							+ "	Edad text,\r\n"
							+ "	PRIMARY KEY (id)\r\n"
							+ ");");
		} catch (AlreadyExistsException e) {
			sesion = cluster.connect("keyspace1");
		}		
		crearTabla();
	}
	public void crearTabla() {
		try {
			sesion.execute(
					"CREATE TABLE keyspace1.Persona (\r\n"
							+ "	id text,\r\n"
							+ "	Nombre text,\r\n"
							+ "	Correo text,\r\n"
							+ "	Edad text,\r\n"
							+ "	PRIMARY KEY (id)\r\n"
							+ ");");
		} catch (AlreadyExistsException e) {
			e.getKeyspace();
		}
	}
	 public void desconectar() {
		 cluster.close();
	 }
	public String leerTabla() {
		String a = null;
		ResultSet rs = sesion.execute("select * from \"Persona\"; ");
		Iterator<Row> iterador = rs.iterator();
		while (iterador.hasNext()){
			Row r = iterador.next();
			a=(r.getString("id"))+" | ";
			a=(r.getString("Nombre"))+" | ";
			a=(r.getString("Correo"))+" | ";
			a=(r.getString("Edad"))+"\n";
		}
		return a;
	}
	public Row buscarPersona(String id){
		ResultSet rs = sesion.execute("select * from \"Persona\" where id= '"+id+"'; ");
		Iterator<Row> iterador = rs.iterator();
		while (iterador.hasNext()){
			Row r = iterador.next();
			return r;
		}
		return null;
	}
	public boolean insertarPersona( String id, String Nombre, String Correo, String Edad) {
		if(buscarPersona(id)==null) {
			return false;
		}
		ResultSet rs = sesion.execute("insert into \"Persona\" ( \"id\",\"Nombre\", \"Correo\", \"Edad\" ) \r\n"
				+ "VALUES ( '"+id+"','"+Nombre+"','"+Correo+"','"+Edad+"' );  ");
		return rs.isExhausted();
	}
	public boolean eliminarPersona( String id) {
		if(buscarPersona(id)==null) {
			return false;
		}
		ResultSet rs = sesion.execute("delete into \"Persona\" where \"id\"= '"+id+"';  ");
		return rs.isExhausted();
	}
	public boolean actualizarPersona( String id, String Nombre, String Correo, String Edad) {
		if(buscarPersona(id)==null) {
			return false;
		}
		ResultSet rs = sesion.execute("update into \"Persona\" where = \"id\" = '"+id+"' set \"Nombre\" = '"+Nombre+"', \"Correo\"= '"+Correo+"', \"Edad\" = '"+Edad+"';  ");
		return rs.isExhausted();
	}
//		public static void main(String[] args) {
//		      Cassandra c= new Cassandra();
//		 }
}
