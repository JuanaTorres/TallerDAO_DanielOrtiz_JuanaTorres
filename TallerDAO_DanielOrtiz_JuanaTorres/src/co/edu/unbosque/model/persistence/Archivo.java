package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.unbosque.model.Persona;

public class Archivo {
	private File archivo;
    private static String ruta_archivo = "./BD/archivoBinario.dat";
    //crea el archivo si no existe de lo contrario no ocurre nada
    
    public Archivo(){
    	archivo = new File("./BD/archivoBinario.dat");
    	escribirABinario(null);
    }

    public String escribirABinario(Persona persona)//Objeto a guardar en archivo *.DAt
    {
        try {
        	if (archivo.createNewFile()){
                System.out.println("The file is created successfully!");
            }
            else{
                System.out.println("The file already exists.");
            }
            //Se crea un Stream para guardar archivo
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream( this.ruta_archivo ));
            //Se escribe el objeto en archivo
            file.writeObject(persona);
            //se cierra archivo
            file.close();
        } catch (IOException ex) {
            System.out.println(ex);
            return "Ocurrio un problema";
        }
        return "Se escribio el archivo";
    }

    public String leerRegistro() {
    	String cadena= "\n";
        ObjectInputStream in;
		try {
			if (archivo.createNewFile()){
                System.out.println("The file is created successfully!");
            }
            else{
                System.out.println("The file already exists.");
            }
			in = new ObjectInputStream(new FileInputStream(ruta_archivo));
	        Persona[] datos = (Persona[])in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	            cadena= cadena +"\n"+(datos[i].getEdad());
	            cadena= cadena +"\n"+(datos[i].getNombre());
	        }
	        return cadena;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Ocurrio un problema";
		}
	}
    
}