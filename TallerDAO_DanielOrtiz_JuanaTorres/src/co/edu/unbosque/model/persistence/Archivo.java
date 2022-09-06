package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.Persona;

public class Archivo {
	private File archivo;
    private static String ruta_archivo = "./BD/archivoBinario.dat";
    //crea el archivo si no existe de lo contrario no ocurre nada
    
    public Archivo(){
    	archivo = new File("./BD/archivoBinario.dat");
    	crearArchivo();
    }
    public void crearArchivo() {
    	try {
			archivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public String escribirABinario(ArrayList<Persona> personas)//Objeto a guardar en archivo *.DAt
    {
        try {
        	
            //Se crea un Stream para guardar archivo
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream( this.ruta_archivo ));
            //Se escribe el objeto en archivo
            for (int i = 0; i < personas.size(); i++) {
            	file.writeObject(personas.get(i));
    		}
            //se cierra archivo
            file.close();
        } catch (IOException ex) {
            System.out.println(ex);
            return "Ocurrio un problema";
        }
        return "Se escribio el archivo";
    }

	public String leerRegistro() {
		try {
			
			FileInputStream fis = new FileInputStream(archivo);
            
            ObjectInputStream leer;
            String datos ="";
            while(fis.available()>0){
                leer= new ObjectInputStream(fis);
                Persona personaLeida= (Persona) leer.readObject();
                datos+=personaLeida.id+" | "+personaLeida.nombre+" | "+personaLeida.edad+" | "+personaLeida.correo+"\n";  
            }
			
	        fis.close();
	        
	        return datos;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			return null;
		}
	}

}