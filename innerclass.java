class A {
    int x = 10;
  
    class B {
      int y = 5;
    }
  }
  
  public class innerclass {
    public static void main(String[] args) {
      A myOuter = new A();
      A.B myInner = myOuter.new B();
      System.out.println(myInner.y + myOuter.x);
    }
  }