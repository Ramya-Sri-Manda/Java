import java.util.Scanner;

public class Sring_scanner {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the name:");
        String x=myobj.nextLine();
        System.out.println("Name is " + x);
        myobj.close();
    }
}