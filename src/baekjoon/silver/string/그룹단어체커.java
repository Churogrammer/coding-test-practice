package baekjoon.silver.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* 그룹 단어 체커
* https://www.acmicpc.net/problem/1316
* */
public class 그룹단어체커 {
    static int ans = 0;
    public static void main(String[] args) {
        그룹단어체커 s = new 그룹단어체커();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n;i++){
            str[i] = sc.next();
        }

        for(int i = 0; i < n;i++){
            ans += s.check(str[i]);
        }
        System.out.println(ans);
    }

    private int check(String str){
        Set<Character> set = new HashSet<>();
        char fC = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            char c = str.charAt(i);
            if(fC != c){
                if(set.contains(c)){
                    return 0;
                }
                set.add(fC);
                fC = c;
            }
        }
        return 1;
    }
}
