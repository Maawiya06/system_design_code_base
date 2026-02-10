package OOPs.InheritanceImplementationTranspost;

import java.sql.SQLOutput;

public class Car extends vehicle{

    public int noOfDoors;
    public String transmissinType;

    Car(int noOfDoors, String transmissinType, String name, String model, int noOfTyres){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissinType = transmissinType;
    }

    void startAc(){
        System.out.println("Ac is Starting in the car : " + name);
    }
}
