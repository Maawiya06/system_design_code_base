package OOPs.AbstractDesign;

/*
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

 */

// interface 2nd method

interface Bird {

    void fly();

    void eat();
}

class sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}

class Crow implements Bird{

    @Override
    public void fly() {
        System.out.println("Crow is flying...");
    }

    @Override
    public void eat() {
        System.out.println("Crow is eating...");
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
        doBirdStuff(new Crow());
    }
}
