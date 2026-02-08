package exceptions;

public class ThrowExceptionsHandling {

    static void printName(String name) throws ArithmeticException, NullPointerException{
//        int a = 5/0;
//        System.out.println("before");

        if(name.equalsIgnoreCase("babbar")){
            throw new NullPointerException("Bhat badhiya h bhai tu");
        }
        System.out.println(name);
    }

    static void main(String[] args) {
        try{
            printName("Babbar");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Badhi");
        }
    }
}
