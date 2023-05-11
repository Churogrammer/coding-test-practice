package baekjoon.silver.bruteforce;

import java.util.*;

public class 연산자끼워넣기 {
    static int[] num;
    static boolean[] vis;
    static String op = new String();
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        연산자끼워넣기 s = new 연산자끼워넣기();
        int n = sc.nextInt();
        num = new int[n];
        vis = new boolean[n];

        for(int i =0;i<n;i++){
            num[i] = sc.nextInt();
        }
        for(int i =0;i<4;i++){
            int val = sc.nextInt();

            for(int j = 0;j < val; j++){
                switch (i){
                    case 0 : op+='+'; break;
                    case 1 : op+='-'; break;
                    case 2 : op+='*'; break;
                    case 3 : op+='/'; break;
                }
            }
        }

        s.dfs(0, "");
        System.out.println(Collections.max(set));
        System.out.println(Collections.min(set));
    }

    private void dfs(int cnt, String opResult){
        if(cnt == op.length()){
            int pos = 0;
            int ans = num[pos];
            for(char c : opResult.toCharArray()){
                ans = calc(ans, num[pos+1], c);
                pos++;
            }
            set.add(ans);
            return;
        }

        for(int i =0;i< op.length();i++){
            if(!vis[i]){
                vis[i] = true;
                dfs(cnt+1, opResult + op.charAt(i));
                vis[i] = false;
            }
        }
    }

    private int calc(int a, int b, char oper){
        int ans = 0;
        switch (oper){
            case '+' : ans = a+b; break;
            case '-' : ans = a-b; break;
            case '*' : ans = a*b; break;
            case '/' : if(a < 0){
                ans = (Math.abs(a)/b) *-1;
            } else {ans = a/b;} break;
        }
        //System.out.println(a +"" + oper + "" + b + " = " + ans);
        return ans;
    }
}
