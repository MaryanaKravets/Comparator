package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        Set<Integer> set = new TreeSet<>(myComparator);
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14));
        System.out.println(set);
    }
}


