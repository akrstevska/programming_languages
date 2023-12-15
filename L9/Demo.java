import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo {
	
	public static Student createStudent(String name, int indexNo, int age) {
		return new Student(name, indexNo, age);
	}
	public static void  printValues(Student s) {
		System.out.println("Name: " + s.getName());
		System.out.println("IndexNo: " + s.getIndexNo());
		System.out.println("Age: " + s.getAge());
	}
	public static void main(String[] args) {
	
		Random rand = new Random();
		List<String> names = 
				Arrays.asList("Angela", "Mila", "Marija", "Mia", "Sara");
		List<Student> students = names.stream().map(name -> this.createStudent(name, rand.nextInt(10000)+1, rand.nextInt(13)+18))
				.collect(Collectors.toList());
		List<String> result = names.stream().filter(p -> p.startsWith("P"))
				.collect(Collectors.toList());
		
	}

}
