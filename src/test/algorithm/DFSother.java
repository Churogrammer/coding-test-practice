package test.algorithm;

import java.util.HashSet;
import java.util.Set;

public class DFSother {
    public static void main(String[] args) {
        String numbers = "17";
        Set<Integer> numberSet = new HashSet<>();
        makeNumber(numberSet, numbers.toCharArray(), new boolean[numbers.length()], "");

    }
    private static void makeNumber(Set<Integer> numberSet, char[] numbers, boolean[] used, String s) {
        for (int i = 0; i < numbers.length; i++) {
            if (!used[i]) {
                s += String.valueOf(numbers[i]);
                used[i] = true;
                makeNumber(numberSet, numbers, used, s);
                s = s.substring(0, s.length() - 1);
                used[i] = false;
            }else{
                numberSet.add(Integer.parseInt(s));
            }
        }
    }
}
