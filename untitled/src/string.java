public class string {

    static void main() {
        System.out.println("This is For String");
        String name = "Ameer";
        System.out.print(name + " ");
        String name1 = new String("Maawiya");
        System.out.println(name1);

        // with the help of string builder we can perform may action
        StringBuilder str = new StringBuilder("Saifullah");
        str.setCharAt(1, 'L');
        System.out.println(str);

        // split the string
        String str1 = "All is good here and i also";
        String[] words = str1.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }
}
