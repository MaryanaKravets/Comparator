package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.addAll(Arrays.asList(1, 2, 3, 18, 20, 22, 4, 5, 6, 7, 8, 90, 100, 31, 45, 9, 10, 12, 13, 14));
        System.out.println(set);
    }
}


