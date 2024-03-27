import java.util.Scanner;
public class scanner{
    static void evenodd(int x){
        if(x%2==0){
            System.out.println(x+" is even");
        }
        else{
             System.out.println(x +" is odd");
        }
    }
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=num.nextInt();
        evenodd(x);
        num.close();
    }
}
