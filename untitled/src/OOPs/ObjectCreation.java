package OOPs;

public class ObjectCreation {

    // Attribute
    public int id;
    public int age;
    public String name;
    public int nos;

    // default constructor
    public ObjectCreation(){
        System.out.println("This is my default constructor");
    }
    // behaviour
    public void study() {
        System.out.println(name + "studying");
    }

    public void sleep(){
        System.out.println(name + "sleeping");
    }

    public void bunk(){
        System.out.println(name + "Bunking");
    }
}
