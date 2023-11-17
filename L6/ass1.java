
interface Two_D_Shape{
	double pi = 3.14;
	void parameters();
	float area();
	float perimeter();
}
interface Three_D_Shape{
	float volume();
}
class Triangle implements Two_D_Shape{
	double sideA, sideB, sideC, height;
	Triangle(double sideA, double sideB, double sideC, double height){
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.height = height;
		System.out.println("A new triangle is created");
		
	}
	boolean rectangular() {
		if((Math.pow(sideA,2)+Math.pow(sideB, 2)) == Math.pow(sideC, 2))
			return true;
		else
			return false;
	}
	public void parameters() {
		System.out.println("The parameters of the triangle are: a=" + sideA + ", b="+ sideB + ", c="+sideC+ ", h="+height);
	}
	public float area() {
		return (float) ((sideA*height)/2);
	}
	public float perimeter() {
		return (float) (sideA+sideB+sideC);
	}
	
}
class Sphere implements Three_D_Shape, Two_D_Shape{
	float radius;
	Sphere(float radius){
		this.radius = radius;
		System.out.println("A new sphere has been created");
	}

	public float volume() {
		return (float) ((4*pi*Math.pow(radius, 3))/3);
	}

	public void parameters() {
		System.out.println("The radius of the sphere is "+ radius);
		
	}

	public float area() {
		return (float) (4*pi*Math.pow(radius, 2));
	}
	
	public float perimeter() {
		return (float) (2*pi*radius);
	}
	
	
}
public class ass1 {

	public static void main(String[] args) {
		  Triangle T1 = new Triangle(3, 5, 6, 3);
	        Sphere B1 = new Sphere(4);
	        Two_D_Shape T2 = new Triangle(8, 2, 10, 16);
	        Two_D_Shape B2 = new Sphere(3);
	        Three_D_Shape B3 = new Sphere(7);

	      
	        System.out.println("T1 Triangle");
	        T1.parameters();
	        System.out.println("Area: " + T1.area());
	        System.out.println("Perimeter: " + T1.perimeter());
	        System.out.println("Is rectangular: " + T1.rectangular());

	        System.out.println("B1 Sphere");
	        B1.parameters();
	        System.out.println("Area: " + B1.area());
	        System.out.println("Volume: " + B1.volume());
	        
	        System.out.println("T2 Two_D_Shape - Triangle");
	        T2.parameters();
	        System.out.println("Area: " + ((Triangle) T2).area()); 
	        System.out.println("Perimeter: " + ((Triangle) T2).perimeter());

	        System.out.println("B2T wo_D_Shape - Sphere");
	        B2.parameters();
	        System.out.println("Area: " + ((Sphere) B2).area());
	        System.out.println("Perimeter: " + ((Sphere) B2).perimeter());

	        System.out.println("B3 Three_D_Shape - Sphere");
	        System.out.println("Volume: " + B3.volume());

	      
	        int twoDShapeInstances = 0;
	        if (T1 instanceof Two_D_Shape) twoDShapeInstances++;
	        if (T2 instanceof Two_D_Shape) twoDShapeInstances++;
	        if (B2 instanceof Two_D_Shape) twoDShapeInstances++;

	        System.out.println("Number of instances implementing Two_D_Shape: " + twoDShapeInstances);

	}

}
