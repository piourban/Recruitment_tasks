package findarray2;

import java.util.*;

public class MyFindArray implements FindArray {
    
    public int findArray(int[] array, int[] subArray) {
        
        /* Solution based on Java 8.
        List<Integer> list1 = IntStream.of(array).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.of(subArray).boxed().collect(Collectors.toList());

        return Collections.lastIndexOfSubList(list1, list2);*/
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int l1 : array) {
            list1.add(l1);
        }

        for (int l2 : subArray) {
            list2.add(l2);
        }
        return list1.containsAll(list2) ? list1.lastIndexOf(list2.get(0)) : -1;
    }
}
