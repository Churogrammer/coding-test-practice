package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * N과 M (2)
 * https://www.acmicpc.net/problem/15650
 * */
public class NandM2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        NandM2 s = new NandM2();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        boolean[] vis = new boolean[n];
        for(int i = 0; i< n;i++){
            arr[i] = i+1;
        }

        s.dfs(m,0, arr, vis, "");
    }

    private void dfs(int size, int pos, int[] arr, boolean[] vis, String result){
        if(result.length() == size*2){
            System.out.println(result.substring(0, result.length()-1));
            vis[pos] = false;
            return;
        }

        for(int i = pos; i < arr.length;i++){
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            dfs(size, i, arr,vis, result + arr[i] + " ");
        }
        vis[pos] = false;
    }
}
