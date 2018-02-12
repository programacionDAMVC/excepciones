package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaFichero2 {
	
	public static void main(String[] args) {
		try {
			mostrarContenidoFichero(
					"/home/programacion/TeestNumeros.java");
			//código que se puede o no se puede ejecutar
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			mostrarContenidoFichero("/home/programacion/eclipse-workspace/"
					+ "Excepciones/src/com/iesvirgendelcarmen/teoria/"
					+ "LecturaFichero.java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			metodoIntermedio("fichero no existente");
		} catch (IOException e) {
			System.out.println("Problema con el fichero");
			e.printStackTrace();
		}
	}
	
	public static void metodoIntermedio (String rutaFichero) throws IOException {
		mostrarContenidoFichero(rutaFichero);
	}
	
	public static void mostrarContenidoFichero(String rutaFichero) 
			throws IOException {
		FileInputStream in = new FileInputStream(rutaFichero);
		int byteLeido;
		while ((byteLeido = in.read()) != -1) {
			System.out.print( (char) byteLeido );
		}
		in.close();
	}
}
