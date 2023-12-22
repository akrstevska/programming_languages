import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ass2 {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader	 input	=	new	BufferedReader(isr);
		int rows = 0;
		System.out.print("Number of rows: ");
		try {
			rows = Integer.parseInt(input.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		int columns = 0;
		System.out.print("Number of columns: ");
		try {
			columns = Integer.parseInt(input.readLine());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		int sum = 0;
		boolean flag = false;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				int element = 0;
				System.out.print("el.	["+i+"]["+j+"]= ");
				  try {
	                    element = Integer.parseInt(input.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                } catch (NumberFormatException e) {
	                    System.out.println("An exception occured");
	                    flag = true;
	                    break;
	                }
				sum+=element;
			}
			if(flag) {
				break;
			}
		}
		System.out.println("The sum = "+sum);
		float avg = (float)sum / (rows*columns);
		System.out.println("The average = "+avg);
		

	}

}
