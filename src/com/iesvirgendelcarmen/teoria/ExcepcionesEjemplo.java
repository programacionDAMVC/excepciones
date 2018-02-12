package com.iesvirgendelcarmen.teoria;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExcepcionesEjemplo {

	public static void main(String[] args) {

		//excepcion no declarativa
		int numerador = 6;
		int denominador = 0;
		if (denominador != 0) {
			int division = numerador / denominador;
		}

		//excepcion no declarativa
		System.out.println("Introduce un boolean");
		Scanner in = new Scanner(System.in);
		String valorBoolean = in.next();
		if (!valorBoolean.toUpperCase().matches("(TRUE|FALSE)")) {
			System.out.println("Valor incorrecto");
		}

		in.close();

		//excepcion no declarativa
		int [] coleccionEnteros = new int[10];
		for (int i = 0; i <= 10; i++) {
			if (i < coleccionEnteros.length) {
				coleccionEnteros[i] = i;
				System.out.println("posición " + i + ": " +
						coleccionEnteros[i]);
			}
		}
		try { //no declarativa, pero si manejada
			System.out.println(coleccionEnteros[10]);
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Posición no existente");
			System.out.println(exc);
		}		

		//excepción declarativa
		try {
			FileReader fileReader = new FileReader(
					"/home/programacion/numeros.jar");
			System.out.println("fichero existe");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("No encuetro el fichero");
		} finally {
			System.out.println("Dentro del bloque finally");
		}


	}

}
