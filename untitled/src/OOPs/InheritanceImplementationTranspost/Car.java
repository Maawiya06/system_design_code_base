package OOPs.InheritanceImplementationTranspost;

public class Car extends vehicle{

    public int noOfDoors;
    public String transmissionType;

    Car(int noOfDoors, String transmissinType, String name, String model, int noOfTyres){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissinType;
    }

    void startAc(){
        System.out.println("Ac is Starting in the car : " + name);
    }
}
