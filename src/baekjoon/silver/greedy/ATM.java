package baekjoon.silver.greedy;

import java.util.Arrays;
import java.util.Collections;

public class ATM {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for(int i =0;i< arr.length;i++){
            arr[i] = i;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
