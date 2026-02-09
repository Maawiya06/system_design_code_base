package OOPs;

public class ObjectCreation {

    // Attribute
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    // default constructor
    public ObjectCreation(){
        System.out.println("This is my default constructor");
    }

    // parameterised constructor
    public ObjectCreation(int id, int age, String name, int nos, String gf){
        System.out.println("This is parameterised constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
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

    private void gfChatting(){System.out.println(name + " Chatting");}
}
