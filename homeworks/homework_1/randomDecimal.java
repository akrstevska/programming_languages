public class randomDecimal {

	public static void main(String[] args) {
		
		double randomNumber = Math.random() * 100.0;
		int integerPart = (int) (randomNumber % 100);
		double decimalPart = randomNumber-integerPart;
		char character = (char) integerPart;
		
		System.out.println("From 0..100 the computer picked " + randomNumber);
		System.out.println("Integer part of this number is " + integerPart);
		System.out.println("Decimal part of this number is " + decimalPart);
		System.out.println("Character with code " + integerPart + " is: " + character);
	}

}
