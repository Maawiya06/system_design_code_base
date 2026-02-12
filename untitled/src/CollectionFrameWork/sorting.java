package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class sorting {
    static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(10);
        ans.add(50);
        ans.add(90);
        ans.add(600);
        ans.add(1);

        Collections.reverse(ans);
        System.out.println("reverse order : " + ans);

        System.out.println("Before Sorting: " + ans);
        Collections.sort(ans);
        System.out.println("After Sorting: " + ans);

        Collections.reverse(ans);
        System.out.println(ans);
        // sorting in decending order
//        Collections.sort(ans, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        Collections.sort(ans, (o1, o2)-> o2.compareTo(o1));
//        Collections.sort(ans, Collections.reverseOrder());
//        System.out.println("Sorted element in descendng order: " + ans);
    }
}
