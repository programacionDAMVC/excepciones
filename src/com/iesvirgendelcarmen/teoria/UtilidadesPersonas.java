package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;
import java.time.Period;

public class UtilidadesPersonas {
	//método que nos diga si un dni es válido o no
	
	public static boolean validarDNI(String dni) {
		String regexDNI = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
		if ( !dni.toUpperCase().matches(regexDNI) )
			return false;
		// 11111111H lenght() = 9
		char letra    = dni.toUpperCase().charAt( dni.length() - 1 ); //H
		String numero = dni.substring(0, dni.length() - 1); //11111111
		int numeroDNI = Integer.parseInt(numero);
		int posicion  = numeroDNI % 23;
		return letra == "TRWAGMYFPDXBNJZSQVHLCKE".charAt(posicion);
	}
	
	//método que nos diga si una fecha es válida o no
	//fecha del futuro
	
	public static boolean validarFecha (LocalDate localDate) {
		Period period =  Period.between(localDate, LocalDate.now());
		int resultado = period.getYears() + period.getMonths() +
				period.getDays();
	//	System.out.println(resultado);
	//	System.out.println(period.getYears());
		return resultado >= 0;
	}
		
	public static void main(String[] args) {
		String dni = "1a111111H";
		System.out.println(validarDNI(dni));
		LocalDate localDate = LocalDate.of(2018, 2, 30);
		System.out.println(validarFecha(localDate));
	}
	
}
