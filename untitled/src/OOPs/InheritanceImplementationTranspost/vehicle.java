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

    public vehicle(){ }

    public void startEngine(){
        System.out.printf("Engine is Starting of %s : %s\n ", name, model);
    }

    public void stopEngine(){
        System.out.printf("Engine is Stoping of %s : %s\n", name, model);
    }
}
