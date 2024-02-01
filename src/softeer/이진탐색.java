package softeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class 이진탐색 {
    public static void main(String[] args) {
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(2);
        lis.add(4);
        lis.add(6);
        lis.add(8);

        int i = Collections.binarySearch(lis,4);
        System.out.println(i);
        int i3 = Collections.binarySearch(lis,2);
        System.out.println(i3);
        int i1 = Collections.binarySearch(lis,5);
        System.out.println(i1);
        int i2 = Collections.binarySearch(lis,6);
        System.out.println(i2);
    }
}
