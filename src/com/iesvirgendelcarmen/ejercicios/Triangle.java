package com.iesvirgendelcarmen.ejercicios;

public class Triangle {

	private int sideOne;
	private int sideTwo;
	private int sideThree;

	public Triangle(int sideOne, int sideTwo, int sideThree)
			throws IlegalTriangleException {
		if (checkTriangle(sideOne, sideTwo, sideThree )) {
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}
		else
			throw new IlegalTriangleException();
	}

	//getters and setters
	//.....

	@Override
	public String toString() {
		return "Triangle [sideOne=" + sideOne + ", sideTwo="
				+ sideTwo + ", sideThree=" + sideThree + "]";
	}

	private static boolean checkTriangle(
			int sideOne, int sideTwo, int sideThree) {

		return  sideOne <= sideTwo + sideThree &&
				sideTwo <= sideOne + sideThree &&
				sideThree <= sideTwo + sideOne;

	}






}
