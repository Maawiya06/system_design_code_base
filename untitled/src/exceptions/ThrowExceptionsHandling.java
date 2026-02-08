package exceptions;

public class ThrowExceptionsHandling {

    static void printName(String name) throws ArithmeticException, NullPointerException{
//        int a = 5/0;
//        System.out.println("before");

        if(name.equalsIgnoreCase("babbar")){
            throw new NullPointerException();
        }
    }

    static void main(String[] args) {
        try{
            printName("Babbar");
        }
        catch (Exception ex){
            System.out.println(ex.getCause());
        }
        finally {
            System.out.println("Badhi");
        }
    }
}
