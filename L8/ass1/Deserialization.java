package assignment;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class StudentFileStreams {
	
	public Student readFromFile(String fileName){
		  Student student = new Student();
		  try {

		      FileInputStream file = new FileInputStream(fileName);
		      ObjectInputStream in = new ObjectInputStream(file);

		      student = (Student) in.readObject();

		      in.close();
		      file.close();
		      System.out.println("Object has been deserialized\n"
		          + "Data after Deserialization.");
		      printData(student);

		  } catch (IOException ex) {
		      System.out.println("IOException is caught");
		  } catch (ClassNotFoundException ex) {
		      System.out.println("ClassNotFoundException" +
		          " is caught");
		  }
		  return student;
		}
	 public void printData(Student  student) {
	        System.out.println("Name = " + student.name);
	        System.out.println("Index number = " + student.indexNum);
	        System.out.println("Record number = " + student.recordNum);
	        System.out.println("Phone number = " + student.phoneNum);
	    }
	
}

public class Deserialization {
	
	public static void main(String[] args) {
		 Student student = new Student("Angela","075167261",5419,9829);
	        StudentFileStreams fileStream = new StudentFileStreams();
	        String fileName = "student.txt";
	        fileStream.readFromFile(fileName);

	}

}
