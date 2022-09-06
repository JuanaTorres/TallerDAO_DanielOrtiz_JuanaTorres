package co.edu.unbosque.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @web https://www.jc-mouse.net
 * @author Mouse
 */
public class SqlLite_BD {

	private Connection connection = null;
	private ResultSet resultSet = null;
	private Statement statement = null;
	private String db= "BD\\Persona.db";  //esto puede cambiar   

	//Constructor de clase que se conecta a la base de datos SQLite 
	public SqlLite_BD()
	{

		conectarBasedeDatos();

	}
	public void conectarBasedeDatos() {
		try{

			connection = DriverManager.getConnection("jdbc:sqlite:" + this.db);

		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public boolean insertar( String id, String Nombre, String Correo, String Edad)
	{
		if(buscar(id)!=null) {
			return false;
		}
		boolean res=false;
		//Se arma la consulta
		String q=" INSERT INTO Persona ( Id,Nombre, Correo, Edad ) VALUES ( '" + id+"','"+Nombre+"','"+ Correo+"','"+ Edad + "' ) ";
		//se ejecuta la consulta
		try {
			PreparedStatement pstm = connection.prepareStatement(q);
			pstm.execute();
			pstm.close();
			res=true;
		}catch(Exception e){
			System.out.println(e);
		}
		return res;
	}
	public String buscar(String id)
	{
		String res=null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT Id,Nombre, Correo, Edad FROM Persona WHERE id='"+id+"';");
			while (resultSet.next())
			{
				res=resultSet.getString("Id") + " | " + resultSet.getString("Nombre") + " | " +  resultSet.getString("Correo") +" | " +  resultSet.getString("Edad") + " \n ";
			}
		}
		catch (SQLException ex) {
			System.out.println(ex);
		}
		return res;
	}
	public boolean eliminar(String id)
	{
		if(buscar(id)==null) {
			return false;
		}
		boolean res= false;
		try {
			statement = connection.createStatement();
			statement.executeQuery("DELETE FROM Persona WHERE id='"+id+"';");
			res= true;
		}
		catch (SQLException ex) {
			System.out.println(ex);
		}
		return res;
	}		 

	/* METODO PARA REALIZAR UNA CONSULTA A LA BASE DE DATOS
	 * INPUT:
	 * OUTPUT: String con los datos concatenados
	 * 
	 */
	public String seleccionar()
	{
		String res=null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT Id,Nombre, Correo, Edad FROM Persona ; ");
			while (resultSet.next())
			{
				if(res == null) {
					res = "";
				}
				res+=resultSet.getString("Id") + " | " + resultSet.getString("Nombre") + " | " +  resultSet.getString("Edad") +" | " +  resultSet.getString("Correo") + " \n ";
			}
		}
		catch (SQLException ex) {
			System.out.println(ex);
		}
		return res;
	}

	public boolean actualizar(String id, String Nombre, String Correo, String Edad) {
		if(buscar(id)==null) {
			return false;
		}
		boolean res=false;
		//Se arma la consulta
		String q=" UPDATE Persona SET Nombre = '" + Nombre + "', Correo = '" + Correo + "', Edad = '" + Edad + "' WHERE id = " + id + ";";
		//se ejecuta la consulta
		try {
			PreparedStatement pstm = connection.prepareStatement(q);
			pstm.execute();
			pstm.close();
			res=true;
		}catch(Exception e){
			System.out.println(e);
		}
		return res;

	}

	public void desconectar()
	{
		try {
			connection.close();
		}
		catch (SQLException ex) {
			System.out.println(ex);
		}
	}


}
