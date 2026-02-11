package OOPs.AbstractDesign;

abstract class Bird {

    abstract void fly();

    abstract void eat();
}

class sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating");
    }
}
public class Main {
   public static void main(String[] args) {
        Bird b = new sparrow();
        b.eat();
        b.fly();
    }
}
