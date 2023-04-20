package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * N과 M (1)
 * https://www.acmicpc.net/problem/15649
 * */
public class NandM1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        NandM1 s = new NandM1();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        boolean[] vis = new boolean[n];
        for(int i = 0; i< n;i++){
            arr[i] = i+1;
        }

        s.dfs(m, arr, vis, "");
    }

    private void dfs(int size, int[] arr, boolean[] vis, String result){
        if(result.length() == size*2){
            System.out.println(result.substring(0, result.length()-1));
            return;
        }

        for(int i = 0; i < arr.length;i++){
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            dfs(size, arr,vis, result + arr[i] + " ");
            vis[i] = false;
        }
    }
}
