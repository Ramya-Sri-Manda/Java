class cake{
    void taste(){
        System.out.println("Its an normal cake");
    }
}
class icecream_cake extends cake{
    void taste1(){
        System.out.println("its an icecream cake");
    }
}
class Singleinheritance{
    public static void main(String[] args) {
        icecream_cake i =new icecream_cake();
        i.taste();
        i.taste1();
    }
}