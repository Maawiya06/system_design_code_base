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

    static void doBirdStuff(Bird b) {
        b.fly();
        b.eat();
    }
   public static void main(String[] args) {
//        Bird b = new sparrow();
//        b.eat();
//        b.fly();

       doBirdStuff(new sparrow());
    }
}
