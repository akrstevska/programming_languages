
public class stringObject {

	public static void main(String[] args) {
		String myString = "Angela Krstevska";
		int stringLength = myString.length();
		char firstChar = myString.charAt(0);
		char lastChar = myString.charAt(stringLength-1);
		char middleChar;
		
		if(stringLength%2 == 0) {
			middleChar = myString.charAt((stringLength/2)-1);
		}
		else {
			middleChar = myString.charAt(stringLength/2);
		}
		int sum = firstChar+lastChar+middleChar;
		
		
		System.out.println("The string is: " + myString);
		System.out.println("Its first character is: " + firstChar);
		System.out.println("Its last character is: " + lastChar);
		System.out.println("Its middle character is: " + middleChar);
		System.out.println("The sum of the characters is: " + sum);
		
		char max = firstChar;
		
		if (lastChar > max) {
			max = lastChar;
		}
		if (middleChar > max) {
			max = middleChar;
		}
		System.out.println("The character with the greatest value out of the three is: " + max + " with code of "+ (int)max);
	}

}
