package baekjoon.silver.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[2];

        char preC = ' ';
        for(char c : str.toCharArray()){
            if(preC != c){
                if(c == '0'){
                    //System.out.println(preC +" -> "+c);
                    arr[0]++;
                } else{
                    arr[1]++;
                }
                preC = c;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
