class icecream_cake{
    void taste(){
        System.out.println("Tastes Nice");
    }
}
class butterscoch_cake extends icecream_cake{
    public void falvour1(){
        System.out.println("Its a Butterschoch Cake");
    }
}
class chocolatetruffle_cake extends butterscoch_cake{
    public void flavour2(){
        System.out.println("Chocolate Truffle Cake");
    }
}
public class Multilevelinheritance {
    public static void main(String[] args) {
        chocolatetruffle_cake c=new chocolatetruffle_cake();
        c.taste();
        c.falvour1();
        c.flavour2();
    }
}
