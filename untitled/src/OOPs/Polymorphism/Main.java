package OOPs.Polymorphism;

public class Main {
    static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(3, 6));
        System.out.println(c.add(3, 6, 10));
    }
}
