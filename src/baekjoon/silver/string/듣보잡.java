package baekjoon.silver.string;

import java.util.*;

/*
* 듣보잡
* https://www.acmicpc.net/problem/1764
* */
public class 듣보잡 {
    static int ans = 0;
    public static void main(String[] args) {
        듣보잡 s = new 듣보잡();
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
                ans++;
                result.add(str);
            }
        }

        System.out.println(ans);
        Collections.sort(result);
        for(String str : result){
            System.out.println(str);
        }
    }
}
