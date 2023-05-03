package baekjoon.silver.bruteforce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 모든 순열
* https://www.acmicpc.net/problem/10974
* */
public class 모든순열 {
    static List<String> ans = new ArrayList<>();
    static boolean[] vis = null;
    public static void main(String[] args) {
        모든순열 s = new 모든순열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        vis = new boolean[n];
        for(int i = 0; i < n ;i++){
            arr[i] = i+1;
        }
        s.dfs(arr, 0,"");
    }

    private void dfs(int[] arr, int pos, String str){
        if(pos == arr.length){
            System.out.println(str);
            ans.add(str.substring(0, arr.length -1));
            return;
        }

        for(int i = 0; i< arr.length;i++){
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            dfs(arr, pos+1,str+arr[i]+" ") ;
            vis[i] = false;
        }
    }
}
