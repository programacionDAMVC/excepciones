package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaFichero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarContenidoFichero(
				"/home/programacion/TestNumeros.java");
		mostrarContenidoFichero("/home/programacion/eclipse-workspace/"
				+ "Excepciones/src/com/iesvirgendelcarmen/teoria/"
				+ "LecturaFicher.java");
		mostrarContenidoFichero(
				"/home/programacion/TestNumeros.java");
	}
	
	public static void mostrarContenidoFichero(String rutaFichero) {
		try (FileInputStream in = new FileInputStream(rutaFichero);)
		{
			int byteLeido;
			while ((byteLeido = in.read()) != -1) {
				System.out.print( (char) byteLeido );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
