package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.IOException;

public class LecturaFichero3 {
	public static void main(String[] args) throws IOException {
		metodoIntermedio("/home/programacion/TestNumeros.java");
		metodoIntermedio("fichero");
		metodoIntermedio("/home/programacion/TestNumeros.java");

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
