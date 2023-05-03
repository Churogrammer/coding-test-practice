package baekjoon.silver.bruteforce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* 로마 숫자 만들기
* https://www.acmicpc.net/problem/16922
* */
public class 로마숫자만들기 {
    static Set<Integer> set = new HashSet<>();
    static boolean[] vis = new boolean[4];
    static int n = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        로마숫자만들기 s = new 로마숫자만들기();
        int[] arr = new int[]{1,5,10,50};
        for(int i = 0; i< arr.length;i++){
            set.add(arr[i]);
        }
        //s.dfs(arr, 0 ,0);
        s.dp(arr);
        System.out.println(set.size());
    }

    private void dp(int[] arr){
        int count = 1;

        while(count < n){
            count++;
            Set<Integer> nSet = new HashSet<>();
            for(Integer a : set){
                for(int i = 0; i< 4 ;i++){
                    nSet.add(a + arr[i]);
                }
            }
            set = nSet;
        }
    }

    private void dfs(int[] arr, int count, int sum){
        if(count >= n){
            set.add(sum);
            return;
        }

        for(int i = 0; i< 4 ; i++){
            dfs(arr, count+1,sum+arr[i]);
        }
    }
}
