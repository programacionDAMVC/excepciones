package com.iesvirgendelcarmen.ejercicios;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Set the three sides of a triangle");
		int sideOne   = in.nextInt();
		int sideTwo   = in.nextInt();
		int sideThree = in.nextInt();
		try {
			Triangle triangle1 = new Triangle(sideOne, sideTwo, sideThree);
			System.out.println(triangle1);
		} catch (IlegalTriangleException e) {
			System.out.println("Imposible create a triangle");
		}

		try {
			Triangle triangle2 = new Triangle(1, 1, 1);
			System.out.println(triangle2);

		} catch (IlegalTriangleException e) {
			System.out.println("Imposible create a triangle");

		}

	}

}
