import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = scanner.nextInt();
        System.out.println("Decimal: " + n);
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal: " + Integer.toHexString(n));

        scanner.close();
    }
}
