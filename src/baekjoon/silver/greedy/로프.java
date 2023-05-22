package baekjoon.silver.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2217
* */
public class 로프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = 0;
        int cnt = 1;
        for(int i = n;i>0;i--){
            if(max < cnt*arr[i]){
                max = cnt*arr[i];
            }
            cnt++;
        }
        System.out.println(max);
    }
}
