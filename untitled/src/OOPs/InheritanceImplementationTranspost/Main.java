package OOPs.InheritanceImplementationTranspost;

public class Main {
    static void main(String[] args) {
        Car c = new Car("Fortuner", "rt9", 4, 4, "Manual");
        c.startEngine();
        c.startAc();
        c.stopEngine();

        Truck T = new Truck("Tata_Ros", "M3", 1, "1.2_Deseal_Engine", 3);
        T.startEngine();
        T.GotAccident();
        T.stopEngine();
    }
}
