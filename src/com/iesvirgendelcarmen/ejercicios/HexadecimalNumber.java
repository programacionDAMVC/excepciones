package com.iesvirgendelcarmen.ejercicios;

public class HexadecimalNumber {

	private String value;

	public HexadecimalNumber(String value) throws HexadecimalException  {
		if (checkHexadecimal(value))
			this.value = value;
		else throw new HexadecimalException();
	}

	public int getDecimalValue() {
		int decimal = 0;
		StringBuilder stringBuilder = new StringBuilder(value);
		String inverseValue = stringBuilder.reverse().toString();
		for (int i = 0; i < inverseValue.length(); i++) {
			char digit = inverseValue.toLowerCase().charAt(i);
			switch (digit) {
			case 'a':
				decimal += Math.pow(16, i) * 10;
				break;
			case 'b':
				decimal += Math.pow(16, i) * 11;
				break;
			case 'c':
				decimal += Math.pow(16, i) * 12;
				break;
			case 'd':
				decimal += Math.pow(16, i) * 13;
				break;
			case 'e':
				decimal += Math.pow(16, i) * 14;
				break;
			case 'f':
				decimal += Math.pow(16, i) * 15;
				break;
			default:
				decimal += Math.pow(16, i) * ( digit - 48 );
				break;
			}
				
		}
		return decimal;
	}

	public int getEasyDecimalValue() {
		int decimal = 0;
		StringBuilder stringBuilder = new StringBuilder(value);
		String inverseValue = stringBuilder.reverse().toString();
		return Integer.parseInt(inverseValue, 16);
	}
	
	public String getValue() {
		return value;
	}




	private static boolean checkHexadecimal(String value) {
		// TODO Auto-generated method stub
		return value.matches("[0-9a-fA-F]+");
	}



	public static void main(String[] args) {
		System.out.println(checkHexadecimal("F"));
		try {
			HexadecimalNumber hexadecimalNumber = 
					new HexadecimalNumber("f1f");
			System.out.println(hexadecimalNumber.value);
			System.out.println(hexadecimalNumber.getDecimalValue());
			System.out.println(hexadecimalNumber.getEasyDecimalValue());
		} catch (HexadecimalException e) {
			// TODO Auto-generated catch block
			System.out.println("no es un nº hexadecimal");
			e.printStackTrace();
		}
	}

}
