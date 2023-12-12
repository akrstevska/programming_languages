
public class Airplane implements Flyer {
	
	@Override
	public void takeoff() {
		System.out.println("Airplane will take off from Skopje Airport");
		
	}

	@Override
	public void land() {
		System.out.println("Airplane has just landed at Ohrid Airport");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplane flies at approximately at 10000 meters above the sea-level");
		
	}
}
