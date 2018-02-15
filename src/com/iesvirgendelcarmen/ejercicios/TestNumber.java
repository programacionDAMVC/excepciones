package com.iesvirgendelcarmen.ejercicios;

public class TestNumber {

	public static void main(String[] args) {
		Object object = null;
		System.out.println(object.toString());
		try {
			BinaryNumber binaryNumber = new BinaryNumber("1102");
			System.out.printf("Decimal value of %s is %d%n",
					binaryNumber.getValue(), 
					binaryNumber.getDecimalValue());
		} catch (BinaryException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Number");
		}

	}

}
