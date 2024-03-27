interface first{
    public void myy();
}
interface second{
    public void yooy();
}
class our implements first,second{
    public void myy(){
        System.out.println("lala");
    }
    public void yooy(){
        System.out.println("lalalalalala");
    }
}
public class Interface {
    public static void main(String[] args) {
        our o =new our();
        o.myy();
        o.yooy(); 
    }
}
