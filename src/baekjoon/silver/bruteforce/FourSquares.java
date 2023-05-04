package baekjoon.silver.bruteforce;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* Four Squares
 * */
public class FourSquares {
    static Set<Integer> set = new HashSet<>();
    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res = n;
        FourSquares s = new FourSquares();

        s.dfs(n, 0,0);
        System.out.println(Collections.min(set));
    }

    private void dfs(int n, int count, int sum){
        //System.out.println(n);
        if(sum >= res){
            if(sum == res){
                //System.out.println("s : " + count);
                set.add(count);
            }
            return;
        }

        for(int i = (int) Math.sqrt(n); i > 0; i--){
            //System.out.println(n-i*i + ", " + (int) Math.sqrt(n));
            //int k = (int) Math.sqrt(n-i*i) == 0? 1 : (int) Math.sqrt(n-i*i);
            dfs(n-i*i, count+1,sum+i*i);
        }
    }
}
