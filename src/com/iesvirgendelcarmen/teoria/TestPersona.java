package com.iesvirgendelcarmen.teoria;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = in.nextLine();
		System.out.println("Introduce apellidos");
		String apellidos = in.nextLine();
		if ( !nombre.toLowerCase().matches("[a-zñáéíóúü\\s]+") ||
				!apellidos.toLowerCase().matches("[a-zñáéíóúü\\s]+") ) {
			System.out.println("Nombre no válido");
			System.exit(1);
		}
		System.out.println("Introduce fecha dd/mm/aaaa");
		String fecha = in.nextLine();
		String regexDias  = "(0[1-9]|[1-9]|[1-2][0-9]|3[0-1])";
		String regexMeses = "(0[1-9]|[1-9]|1[0-2])";
		String regexAnnos = "[0-9]{1,4}";
		if ( !fecha.matches(regexDias + "/" + regexMeses
				+ "/" + regexAnnos)) {
			System.out.println("Fecha no válido");
			System.exit(1);
		}
		System.out.println("Introduce dni con letra");
		String dni = in.nextLine();

	}

}
