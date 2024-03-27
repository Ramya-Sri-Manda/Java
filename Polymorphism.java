class Cake {
  public void taste() {
    System.out.println("It's a normal cake");
  }
}

class IceCreamCake extends Cake {
  public void taste() {
    System.out.println("It's an ice cream cake");
  }
}

class Butterscotch extends Cake {
  public void taste() {
    System.out.println("Wow! It's a butterscotch cake");
  }
}

class Polymorphism {
  public static void main(String[] args) {
    Cake normalCake = new Cake();
    Cake iceCreamCake = new IceCreamCake();
    Cake butterscotchCake = new Butterscotch();
        
    normalCake.taste();
    iceCreamCake.taste();
    butterscotchCake.taste();
  }
}
