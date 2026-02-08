public class exceptionHandling {

    static void main(String[] args) {
        System.out.println("Before");
        try{
            int a = 5/0;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            System.out.println("we need to handle exception");
        }
        System.out.println("after");
    }
}
