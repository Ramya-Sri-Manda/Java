import java.util.Scanner;
public class input_scan {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("Enter username:");
        String uname=sa.nextLine();
        System.out.println("Username is " + uname);
        sa.close();
    }
}
