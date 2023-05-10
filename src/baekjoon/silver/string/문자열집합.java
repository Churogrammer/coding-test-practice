package baekjoon.silver.string;

import java.util.*;

/*
* 문자열 집합
* https://www.acmicpc.net/problem/14425
* */
public class 문자열집합 {
    static int ans = 0;
    public static void main(String[] args) {
        문자열집합 s = new 문자열집합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();

        for(int i = 0; i < n;i++){
            String str = sc.next();
            set.add(str);
        }

        for(int i = 0; i < m;i++){
            String str = sc.next();
            if(set.contains(str)){
                result.add(str);
            }
        }
        System.out.println(result.size());
    }
}
