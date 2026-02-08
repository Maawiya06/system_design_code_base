package exceptions;

public class exceptionHandling {

    static void main(String[] args) {
        System.out.println("Before");
        try{
            //int a = 5/0;
            System.out.println("Hello");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("we need to handle exception");
        }
        finally{
            System.out.println("Mai toh Excute hounga hi");
        }
        System.out.println("after");
    }
}
