package exercises;

class Animal {
	public String name;

	public Animal() {
		name = "";
	}

	public Animal(String n) {
		name = n;
	}

	public void onomatopoeia() {
		System.out.println("There is no onomatopoeia for " + name);
	}
}

class Dog extends Animal {
	public void onomatopoeia() {
		System.out.println("Woof Woof!");
	}
}

class Lion extends Animal {
	public void onomatopoeia() {
		System.out.println("Roar!");
	}
}

class Frog extends Animal {
	public void onomatopoeia() {
		System.out.println("Ribbit!");
	}
}
class Sara_Mountain_Dog extends Dog {
	
}

public class ZOO {
	public static void main(String[] a) {
		Animal[] animals = new Animal[6];
		animals[0] = new Dog();
		animals[1] = new Dog();
		animals[2] = new Lion();
		animals[3] = new Frog();
		animals[4] = new Sara_Mountain_Dog();
		animals[5] = new Animal(" animal");
		for(int i =0; i<animals.length; i++) {
			animals[i].onomatopoeia();
		}


	}
}
