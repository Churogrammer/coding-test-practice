package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

/*
* N과 M (4)
* https://www.acmicpc.net/problem/15652
* */
public class NandM4 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        NandM4 s = new NandM4();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = i+1;
        }

        s.dfs(m, arr, "");
        bw.flush();
    }

    private void dfs(int size, int[] arr, String result) throws IOException {
        if(result.length() == size*2){
            bw.write(result.substring(0, result.length()-1));
            bw.newLine();
            return;
        }

        for(int i = 0; i < arr.length;i++){
            if(result.length() > 0){
                Integer a = Integer.parseInt(result.substring(result.length()-2, result.length()-1));
                if(a > arr[i]){
                    continue;
                }
            }
            StringBuilder builder = new StringBuilder();
            builder.append(result).append(arr[i]).append(" ");
            dfs(size, arr, builder.toString());

        }
    }
}
