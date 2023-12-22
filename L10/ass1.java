import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ass1 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader	 input	=	new	BufferedReader(isr);
		String name = "";
		System.out.println("What is your name? ");
		try {
			name = input.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		int year = 0;
		System.out.println("What year were you born? ");
		try {
			year = Integer.parseInt(input.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		float height = 0;
		System.out.println("How tall are you?(in m) ");
		try {
			height = Float.parseFloat(input.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		float weight = 0;
		System.out.println("What is your weight?(in kg) ");
		try {
			weight = Float.parseFloat(input.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Your name is "+ name);
		int age = 2023-year;
		System.out.println("This year you will turn " + age);
		float bodyMass = weight/(height*height);
		System.out.println("Your body mass index is " + bodyMass);
		
	}

}
