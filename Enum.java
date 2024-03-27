/*public class Enum {
    enum level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        level l=level.LOW;  
        System.out.println(l); 
    }
}*/
enum level{
    LOW,
    MEDIUM,
    HIGH
}
public class Enum{
    public static void main(String[] args) {
        level l =level.LOW;
        for(level l1:level.values()){
            System.out.println(l1);
        }
        switch(l){
            case LOW:
            System.out.println("Low level");
            break;
            case MEDIUM:
            System.out.println("Medium level");
            break;
            case HIGH:
            System.out.println("High level");
        }
    }
}
