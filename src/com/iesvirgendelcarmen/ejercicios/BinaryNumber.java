package com.iesvirgendelcarmen.ejercicios;

public class BinaryNumber {

	private String value;

	public BinaryNumber(String value) throws BinaryException {
		if (checkBinary(value)) {
			this.value = value;
		}
		else
			throw new BinaryException("Invalid binary number");
	}

	
	
	public String getValue() {
		return value;
	}

	public int getDecimalValue() {
		int decimal = 0;
		StringBuilder stringBuilder = new StringBuilder(value);
		String inverseValue = stringBuilder.reverse().toString();
		for (int i = 0; i < inverseValue.length(); i++) {
			if (inverseValue.charAt(i) == '1')
				decimal += Math.pow(2, i);
		}
		return decimal;
	}

	private static boolean checkBinary(String value) {
		
		return value.matches("[01]+");
	}

	public static void main(String[] args) {
		System.out.println(checkBinary(" 11   ".trim()));
	}
	
}
