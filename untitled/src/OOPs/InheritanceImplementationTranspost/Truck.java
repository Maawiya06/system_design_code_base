package OOPs.InheritanceImplementationTranspost;

public class Truck extends vehicle{

    public String EngineType;
    public int noOfDala;

    Truck(String name, String model, int noOfTyres, String EngineType, int noOfDala){
        super(name, model, noOfTyres);
        this.EngineType = EngineType;
        this.noOfDala = noOfDala;
    }

    void GotAccident(){
        System.out.println("It Accident on ruff road: " + name);
    }
}
