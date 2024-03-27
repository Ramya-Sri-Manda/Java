
abstract class Abst {
    public String Name="Ramya";
    public int age=19; 
     public abstract void study();
}
class Student extends Abst{
    public int Year=2026;
    public void study(){
    System.out.println("Studying all day long");
  }
public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.Name);
    System.out.println("Age: " + myObj.age);
    System.out.println("Year: " + myObj.Year);
    myObj.study();
}
}

