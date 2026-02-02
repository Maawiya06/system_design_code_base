
public class first {

    static char b;
    public static void main(String[] args){
        System.out.println("Hello world");

        // crate variable
        int a = 4;
        System.out.println(a);

        char ch;
        System.out.println("my character is : " +  b);

        //explit conversion
        int num = 108;
        char myCh = (char)num;
        System.out.println(myCh);

        // explicit conversion from higher to lower
        int myNum = 12;
        byte myNum1 = (byte)myNum;
        System.out.println(myNum1);
    }
}
