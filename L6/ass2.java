interface Average{
	float average();
}
interface Scholarship{
	float rate();
}
class Person {
	String p_name;
	Person(String p_name){
		this.p_name = p_name;
	}
}
class Employee extends Person implements Average{
	int no_salaries;
	int salary[] = new int[12];
	Employee(String p_name, int num) {
		super(p_name);
		no_salaries = num;
		salary = new int[no_salaries];
        for (int i = 0; i < no_salaries; i++) {
            salary[i] = (int) (Math.random() * 30001); 
        }
		
		
	}
	public float average() {
        if (no_salaries == 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < no_salaries; i++) {
                sum += salary[i];
            }
            return (float) sum / no_salaries;
        }
}
	
}
class Student extends Person implements Average, Scholarship{
	int no_grades;
	Employee parent1;
	Employee parent2;
	
	int grade[] = new int [6];
	
	Student(String p_name, int n, Employee p1, Employee p2) {
        super(p_name);
        no_grades = n;
        parent1 = p1;
        parent2 = p2;
        grade = new int[6];
        for (int i = 0; i < 6; i++) {
            grade[i] = (int) (Math.random() * 6) + 5; 
        }
    }
	 public float average() {
	        if (no_grades == 0) {
	            return 0;
	        } else {
	            int sum = 0;
	            for (int i = 0; i < 6; i++) {
	                sum += grade[i];
	            }
	            return (float) sum / no_grades;
	        }
	    }
	 public float rate() {
	        float gpa = average();
	        float parentSalariesAvg = (float) (parent1.average() + parent2.average());
	        return gpa * 6 + (60000 - parentSalariesAvg) * 4;
	    }
	 
}
public class ass2 {

	public static void main(String[] args) {
		Employee[] parents = new Employee[6];
		parents[0] = new Employee("Parent 1", 2);
		parents[1] = new Employee("Parent 2", 1); 
		
		parents[2] = new Employee("Unemployed Parent 1", 0);
		parents[3] = new Employee("Unemployed Parent 2", 0);
	
		parents[4] = new Employee("Parent 3", 3);
		parents[5] = new Employee("Parent 4", 1);
		
		Student[] students = new Student[3];
		students[0] = new Student("Student 1", 6, parents[0], parents[2]);
		students[1] = new Student("Student 2", 6, parents[1], parents[3]);
		students[2] = new Student("Student 3", 6, parents[4], parents[5]);

		Student scholarshipWinner = students[0];
		float maxScholarshipPoints = 0;

		for (int i=0;i<3;i++) {
		    System.out.println("Name: " + students[i].p_name);
		    System.out.println("GPA: " + students[i].average());
		    
		    System.out.println("First Parent: " + students[i].parent1.p_name);
		    System.out.println("First Parent's Average Salary: " + students[i].parent1.average());
		    
		    System.out.println("Second Parent: " + students[i].parent2.p_name);
		    System.out.println("Second Parent's Average Salary: " + students[i].parent2.average());
		    
		    float scholarshipPoints = students[i].rate();
		    System.out.println("Scholarship Points: " + scholarshipPoints);
		    
		    if (scholarshipPoints > maxScholarshipPoints) {
		        maxScholarshipPoints = scholarshipPoints;
		        scholarshipWinner = students[i];
		    }
		    
		    System.out.println();
		}

		
		System.out.println("The winner of the scholarship is: " + scholarshipWinner.p_name);
		
	}

}
