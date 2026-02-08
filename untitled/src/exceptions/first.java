package exceptions;

import java.util.Scanner;

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

        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = sc.nextLine();
        System.out.println("Your Name is : " + name);
        sc.close();
    }
}
