public class Para_const {
    int x;
    public Para_const(int y){
        x=y;
    }
    public static void main(String[] args) {
        Para_const myobj=new Para_const(100);
        System.out.println(myobj.x);
    }
}
