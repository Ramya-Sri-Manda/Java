public class Car1 {
    public void fullthrottle(){
        System.out.println("Car is going fast");
    }
    public void speed(int maxspeed){
        System.out.println("Max spedd is: "+ maxspeed);
    }
    public static void main(String[] args) {
        Car1 mycar=new Car1();
        mycar.fullthrottle();
        mycar.speed(1000);
    }
}
