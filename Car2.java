public class Car2 {
    static void fullthrottle(){
        System.err.println("Car is going fast");
    }
    static void speed(int maxspeed){
        System.out.println("Maxspeed is: " +maxspeed);
    }
    public static void main(String[] args) {
        fullthrottle();
        speed(1000);
    }
}
