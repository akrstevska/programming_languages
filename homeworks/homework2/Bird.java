
public class Bird implements Flyer{

	@Override
	public void takeoff() {
		System.out.println("Bird will take off from the nest");
		
	}

	@Override
	public void land() {
		System.out.println("Bird has landed on the nest");
		
	}

	@Override
	public void fly() {
		System.out.println("Bird flies above the river");
		
	}
	public void buildNest() {
		System.out.println("The Bird has built the nest");
		
	}
	public void layEggs() {
		System.out.println("The Bird has layed eggs in the nest");
		
	}
	

}
