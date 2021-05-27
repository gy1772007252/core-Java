package Test.CollectionTest;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        Collections.addAll(set, 9, 5, 6, 7, 3, 8, 1);
        System.out.println(set);
        System.out.println("set 最大值为：" + maxInt(set));
    }

    public static <T extends Comparable<T>> T maxInt(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        T max = null;
        if (iterator.hasNext()) {
            max = iterator.next();
        }
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
