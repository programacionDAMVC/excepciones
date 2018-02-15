package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;

public class Persona {

	//atributos
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String dni;

	//constructor
	public Persona(String nombre, String apellidos,
			LocalDate fechaNacimiento, String dni) 
					throws DNIException  {
		if (UtilidadesPersonas.validarDNI(dni)) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.fechaNacimiento = fechaNacimiento;
			this.dni = dni;
		}
		else
			throw new DNIException("DNI no válido");
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return apellidos + ", " + nombre +". DNI: " + dni;
	}





}
