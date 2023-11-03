
public class AngelaKrstevska_5419_Ass1 {

	public static void main(String[] args) {
	System.out.println(args[0]);
		
	if(args.length == 6) {
	
			int[] numArray = new int[5];
			for(int i = 0;i<5;i++) {
				numArray[i] = Integer.parseInt(args[i+1]);
			}
		if(args[0].equals("MIN")) {
			
			int min = numArray[0];
			for(int i=0;i<5;i++) {
				if(numArray[i]<min)
					min = numArray[i];
			}
			System.out.println("The minimum of the provided numbers is " + min);
			
		}
		else if(args[0].equals("MAX")) {
			int max =numArray[0];
			for(int i=0;i<5;i++) {
				if(numArray[i]>max)
					max = numArray[i];
			}
			System.out.println("The maximum of the provided numbers is " + max);
		}
		else {
			System.out.println("You've entered an invalid first argument");
		}
		
	}
	else {
		System.out.println("You've entered an invalid number of arguments");
	}
	}

}
