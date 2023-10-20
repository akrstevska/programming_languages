import java.lang.Math;
public class mathClass {

	public static void main(String[] args) {
		double n = 2.3;
		System.out.println("Number: " + n);
		System.out.println("Sine: " + Math.sin(n));
		System.out.println("Cosine: " + Math.cos(n));
		System.out.println("Tangent: " + Math.tan(n));
		System.out.println("Cotangent: " + 1/Math.tan(n));
		System.out.println("Square: " + Math.pow(n,2));
		System.out.println("Square root: " + Math.sqrt(n));
		System.out.println("Cube: " + Math.pow(n,3));
		System.out.println("Smallest larger integer: " + Math.ceil(n));
		System.out.println("Largest smaller integer: " + Math.floor(n));
		System.out.println("Area: " + Math.pow(n,2)*Math.PI);
		
		System.out.println("PI: " + Math.PI);
		System.out.println("E: " + Math.E);
			
	}

}
