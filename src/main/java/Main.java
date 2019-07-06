package main.java;

import java.util.*;

class MyComparator implements Comparator<Integer> {
    public int compare(Integer t1, Integer t2) {
        if (t1 % 2 == 0 && t2 % 2 != 0) {
            return -1;
        } else if (t1 % 2 != 0 && t2 % 2 == 0) {
            return 1;
        } else if (t1 % 2 == 0 && t2 % 2 == 0) {
            return t1.compareTo(t2);
        } else if (t1 % 2 != 0 && t2 % 2 != 0) {
            return t1.compareTo(t2);
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        Set<Integer> set = new TreeSet<>(myComparator);
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14));
        System.out.println(set);
    }
}


