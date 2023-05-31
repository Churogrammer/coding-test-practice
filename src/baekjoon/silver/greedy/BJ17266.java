package baekjoon.silver.greedy;
/*
구현
Silver4
어두운굴다리
https://www.acmicpc.net/problem/17266
* */
import java.util.Scanner;

public class BJ17266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m+2];
        arr[0] = 0;
        arr[m+1] = n;
        for(int i = 1; i <= m; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 2; i <= m; i++) {
            int val = arr[i] - arr[i-1];
            //System.out.println(arr[i] +"-"+arr[i-1] + " = " + val);
            if(val > ans){
                ans = val;
            }
        }

        //System.out.println((arr[1]-arr[0]) +" VS "+ (arr[m+1]-arr[m]));
        int val = arr[1]-arr[0] > arr[m+1]-arr[m] ? arr[1]-arr[0] : arr[m+1]-arr[m];
        ans = (int)Math.ceil((double) ans/2);
        ans = ans > val ? ans : val;

        System.out.println(ans);
    }
}
