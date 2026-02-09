package OOPs;

public class App {
    static void main(String[] args) {
        /*ObjectCreation A = new ObjectCreation();
        A.id = 1;
        A.age = 23;
        A.name = "Rannu";
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        // methods call
        A.bunk();
        A.sleep();
        A.study();
         */

        ObjectCreation A = new ObjectCreation(1, 23, "Raj", 5, "Tina");
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);

        // get private attribute
        System.out.println(A.getGf());
    }
}
