class icecream_cake{
    public void topings(){
        System.out.println("put chocolate Topings");
    }
}
class butterscoch_cake extends icecream_cake{
    void taste(){
        System.out.println("Nice taste");
    }
}
class chocolatetruffle_cake extends icecream_cake{
    void taste2(){
        System.out.println("Nice taste than butterscoch cake");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        chocolatetruffle_cake c=new chocolatetruffle_cake();
        c.taste2();
        c.topings();
    }
}
