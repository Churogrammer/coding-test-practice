package baekjoon.silver.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int ans = arr[0];
        for(int i = 1; i<n;i++) {
            arr[i] = arr[i - 1] + arr[i];
            //System.out.println(arr[i]);
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
