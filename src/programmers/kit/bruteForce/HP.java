package programmers.kit.bruteForce;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* 피로도
* https://school.programmers.co.kr/learn/courses/30/lessons/87946
* */
public class HP {
    static int ans = 0;
    static Set<Integer> set = new HashSet<Integer>();
    static boolean[] vis;
    public int solution(int k, int[][] dungeons) {
        vis = new boolean[dungeons.length];
        dfs(dungeons,k, 0);
        return Collections.max(set);
    }

    private void dfs(int[][] arr, int k, int cnt){
        if(cnt > arr.length-1){
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(vis[i]){
                continue;
            }

            vis[i] = true;
            if(arr[i][0] <= k && k-arr[i][1] >= 0){
                set.add(cnt+1);
                dfs(arr, k-arr[i][1], cnt+1);
            }
            vis[i] = false;
        }
    }
}
