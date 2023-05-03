package baekjoon.silver.bruteforce;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 토너먼트
*
* */
public class 토너먼트 {
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        토너먼트 s = new 토너먼트();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int i = sc.nextInt();

        if(p > i){
            int t = p;
            p = i;
            i = t;
        }

        s.method(n, p ,i);
    }

    private void method(int n, int p, int i){
        while(n >0){
            ans++;
            //System.out.println(p +","+ i);
            if(isMatch(p ,i)){
                System.out.println(ans);
                ans = 0;
                return;
            }

            n= n/2;
            p = (int) Math.ceil((double) p/2);
            i = (int) Math.ceil((double) i/2);
        }
    }

    private boolean isMatch(int p, int i){
        if(i%2 == 0 && i == p+1){
            return true;
        }
        return false;
    }
}
