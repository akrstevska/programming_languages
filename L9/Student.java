
public class Student {
	private String name;
	private int indexNo;
	private int age;
	Student(){}
	Student(String name, int indexNo, int age){
		this.name = name;
		this.indexNo = indexNo;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Student withName(String name) {
		this.name = name;
		return this;
	}
	public int getIndexNo() {
		return indexNo;
	}
	public Student withIndexNo(int indexNo) {
		this.indexNo = indexNo;
		return this;
	}
	
	public int getAge() {
		return age;
	}
	public Student withAge(int age) {
		this.age = age;
		return this;
	}
	
	
	
}
