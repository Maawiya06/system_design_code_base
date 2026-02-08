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

    // parameterised constructor
    public ObjectCreation(int id, int age, String name, int nos){
        System.out.println("This is parameterised constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }
    // behaviour
    public void study() {
        System.out.println(name + " studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }
}
