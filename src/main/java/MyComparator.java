package main.java;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public int compare(Integer t1, Integer t2) {
        if (t1 % 2 == 0 && t2 % 2 != 0) {
            return -1;
        } else if (t1 % 2 != 0 && t2 % 2 == 0) {
            return 1;
        } else
            return t1.compareTo(t2);
        }
}


