import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ass3 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input	=	new	BufferedReader(isr);
		
		
		while(true) {
			String text = "";
			System.out.print("Input the text. To finish inputting, input END: ");
			try {
				text = input.readLine();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			if(text.equalsIgnoreCase("end")){
				System.out.print("Thank you for using the program");
				break;
			}
			 int length = text.length();
			
	            System.out.print(text + " has "+ length+" characters");
	            System.out.println();
	            System.out.println();
		}
	
		

	}

}
