package com.iesvirgendelcarmen.teoria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		try {
			in = new FileInputStream(
					"/home/programacion/TestNumeros.java");
			System.out.println("Fichero encontrado");
			int byteLeido;
			while ((byteLeido = in.read()) != -1) {
				System.out.print( (char) byteLeido );
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error lectura");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//tratamiento en java 7 y posteriores
		//cierre automático del stream
		try (FileInputStream in1 = new FileInputStream(
					"/home/programacion/TestNumeros.java");){
			
			System.out.println("Fichero encontrado");
			int byteLeido;
			while ((byteLeido = in1.read()) != -1) {
				System.out.print( (char) byteLeido );
			}
			
		} catch (IOException e) { //en producción quito catch
			System.out.println("Fichero no encontrado");
			//e.printStackTrace();
		} 
	}

}
