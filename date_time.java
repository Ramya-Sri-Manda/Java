/*import java.time.LocalDate; 
public class date_time {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); 
    System.out.println(myObj); 
  }
}*/
/*import java.time.LocalTime;
public class date_time{
    public static void main(String[] args) {
        LocalTime T=LocalTime.now();
        System.out.println(T);
    }
}*/
/*import java.time.LocalDateTime;
public class date_time{
    public static void main(String[] args) {
        LocalDateTime DT=LocalDateTime.now();
        System.out.println(DT);
    }
}*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class date_time{
    public static void main(String[] args) {
        LocalDateTime DTF=LocalDateTime.now();
        System.out.println("Before: "+DTF);
        DateTimeFormatter forma=DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");
        String la=DTF.format(forma);
        System.out.println("After: "+la);
    }
}

