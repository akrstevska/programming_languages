package assignment;

public class Demo {

    public static void main(String[] args) {
        Student student = new Student("Angela","075167261",5419,9829);
        StudentFileStream fileStream = new StudentFileStream();
        String fileName = "student.txt";
        fileStream.writeToFile(student, fileName);

    }

}
