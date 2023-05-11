package test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class charTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        list.add("11a");
        list.add("11b");
        list.add("10a");
        list.add("10b");

        String str = "aafaaaaafaa";
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.stream().filter(a-> a<3).count());
        System.out.println(str.lastIndexOf('f'));
        StringBuilder sb = new StringBuilder();

    }
}
