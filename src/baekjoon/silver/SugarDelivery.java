package baekjoon.silver;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 설탕배달
* https://www.acmicpc.net/problem/2839
* */
public class SugarDelivery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        SugarDelivery s = new SugarDelivery();

        int n = Integer.parseInt(st.nextToken());


        int[] dp = s.dp(n);
        System.out.println("dp : " + dp[n]);
        System.out.println("bfs : " + s.bfs(n));
    }

    private int[] dp(int n){
        int size = n > 5 ? n : 5;
        int[] dp = new int[size+1];
        for(int i = 1; i<5; i++){
            dp[i] = -1;
        }
        dp[3] = 1;
        dp[5] = 1;
        if(n < 6){
            return dp;
        }

        for(int i = 6; i<=n;i++){
            if(i % 5 == 0){
                dp[i] = dp[i-5] +1;
            } else if(i % 3 == 0){
                dp[i] = dp[i-3] +1;
            } else{
                int j = dp[i-3] >= dp[i-5] ? dp[i-3] : dp[i-5];
                dp[i] = j != -1 ? j+1 : j;
            }
        }
        return dp;
    }

    private int bfs(int n){
        boolean[] vis = new boolean[n+1];
        int ans = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while(!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt > 0){
                int q = queue.poll();
                cnt--;
                if(q == 0){
                    return ans;
                }

                if(!vis[q]){
                    if(q-3 >= 0){
                        queue.add(q-3);
                    }
                    if(q-5 >=0){
                        queue.add(q-5);
                    }
                }
                vis[q] = true;
            }
            ans++;
        }
        return -1;
    }
}
