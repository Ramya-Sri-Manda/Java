class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class statclass {
    public static void main(String[] args) {
        OuterClass.InnerClass myinner = new OuterClass.InnerClass();
        System.out.println(myinner.y);
    }
}
