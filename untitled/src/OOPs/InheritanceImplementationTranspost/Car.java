package OOPs.InheritanceImplementationTranspost;

public class Car extends vehicle{

    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissinType){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissinType;
    }

    void startAc(){
        System.out.println("Ac is Starting in the car : " + name);
    }
}
