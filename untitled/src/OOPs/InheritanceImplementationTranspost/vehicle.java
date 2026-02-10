package OOPs.InheritanceImplementationTranspost;

public class vehicle {

    public String name;
    public String model;
    public int noOfTyres;

    public vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine(){
        System.out.println("Engine is Starting of : " + name + model);
    }

    public void stopEngine(){
        System.out.println("Engine is Stoping of : " + name + model);
    }
}
