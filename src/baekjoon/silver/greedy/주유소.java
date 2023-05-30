package baekjoon.silver.greedy;
/*
Greedy
Silver3
주유소
https://www.acmicpc.net/problem/13305
*/
import java.util.Scanner;

public class 주유소 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] price = new long[n];
        long[] dist = new long[n-1];

        for(int i = 0;i<n-1;i++){
            //dist[i] = i+1;
            dist[i] = sc.nextLong();
        }
        for(int i = 0;i<n;i++){
            //price[i] = i+1;
            price[i] = sc.nextLong();
        }

        long minP = price[0];
        int ans = 0;
        for(int i = 0;i<n-1;i++){
            if(minP > price[i]){
                minP = price[i];
            }
            ans += minP*dist[i];
            //System.out.println(minP*dist[i] + "->" + ans);
        }
        System.out.println(ans);
    }
}
