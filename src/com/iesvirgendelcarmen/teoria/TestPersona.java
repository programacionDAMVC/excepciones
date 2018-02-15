package com.iesvirgendelcarmen.teoria;

import java.time.DateTimeException;
import java.time.LocalDate;
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
		String dateIN = in.nextLine();
		String regexDias  = "(0[1-9]|[1-9]|[1-2][0-9]|3[0-1])";
		String regexMeses = "(0[1-9]|[1-9]|1[0-2])";
		String regexAnnos = "[0-9]{1,4}";
		if ( !dateIN.matches(regexDias + "/" + regexMeses
				+ "/" + regexAnnos)) {
			System.out.println("Fecha no válida");
			System.exit(1);
		}
		String[] date = dateIN.split("/"); //["dd", "mm", "aaaa"]
		LocalDate birthDay = null;
		try {
			birthDay = LocalDate.of(Integer.parseInt(date[2])
					, Integer.parseInt(date[1]),
					Integer.parseInt(date[0]));
		}
		catch (DateTimeException e) {
			System.out.println("Fecha no permitidada");
			System.exit(1);
		}

		//validar fecha
		if ( !UtilidadesPersonas.validarFecha(birthDay) ) {
			System.out.println("Fecha no válida");
			System.exit(1);
		}


		System.out.println("Introduce dni con letra");
		String dni = in.nextLine();
		/*if ( !UtilidadesPersonas.validarDNI(dni)) {
			System.out.println("DNI no válido");
			System.exit(1);
		}*/

		try {
			Persona persona = new Persona(nombre, apellidos, birthDay, dni);
			System.out.println(persona);
		} catch (DNIException e) {
			System.out.println("No se puede crear objeto persona");
		}

	}

}
