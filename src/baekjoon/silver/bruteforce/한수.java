package baekjoon.silver.bruteforce;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 한수
* https://www.acmicpc.net/problem/1065
* */
public class 한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        한수 s = new 한수();

        int n = Integer.parseInt(st.nextToken());
        System.out.println(n + " - " + s.method(n));
    }

    private int method(int n){
        if(n < 100){
            return n;
        }
        int ans = 99;
        boolean isFinish = false;
        for(int i = 100; i <= 1000 ;i+=100){
            int a = i/100;
            for(int j = 0; j < 10 ;j++){
                int result = a*100 + (a+j)*10 + (a+j+j);
                if(a+j+j >= 10){
                    break;
                }
                if(result > n){
                    isFinish = true;
                    break;
                }
                ans++;
            }

            for(int j = 1; j < 10 ;j++){
                int result = a*100 + (a-j)*10 + (a-j-j);
                if(a-j-j < 0){
                    break;
                }
                if(result > n){
                    continue;
                }
                ans++;
            }
            if(isFinish){
                return ans;
            }
        }

        return ans;
    }
}
