import java.util.ArrayList;
import java.util.Scanner;
class Pro_Student {
    private String name;
    private int age;
    private String id;

    public Pro_Student(String name,int age,String id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Pro_Student{" + "name='"+name+'\''+",age="+age+",id='"+id+'\''+'}';
    }
}
public class Student_Management{
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        ArrayList<Pro_Student> students=new ArrayList<>();

        //adding students
        System.out.println("Enter the number of students:");
        int numofstu=Scan.nextInt();
        Scan.nextLine();

        for(int i=0;i<numofstu;i++){
            System.out.println("Enter Student name:");
            String name=Scan.nextLine();

            System.out.println("Enter student age:");
            int age=Scan.nextInt();
            Scan.nextLine();

            System.out.println("Enter student Id:");
            String id=Scan.nextLine();

            Pro_Student student=new Pro_Student(name, age, id);
            students.add(student);
        }
        //displaying all students
        System.out.println("List of Students:");
        for(Pro_Student student :students){
            System.out.println(student);
        }
        //searching for a student by id
        System.out.println("Enter the id to search");
        String searchId = Scan.nextLine();
        boolean found = false;

        for (Pro_Student student : students) {
            if (student.getId().equals(searchId)) {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found with ID: " + searchId);
        }
        Scan.close();
    }
}
