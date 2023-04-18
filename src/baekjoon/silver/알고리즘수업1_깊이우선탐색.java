package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 알고리즘수업1_깊이우선탐색 {
    static Map<Integer, List> map = new LinkedHashMap<>();
    static int sort = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        알고리즘수업1_깊이우선탐색 s = new 알고리즘수업1_깊이우선탐색();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] vis = new int[n];
        for(int i = 0 ;i < n; i++){
            vis[i] = 0;
        }

        for(int i = 0;i<m;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            s.insert(start, end);
            s.insert(end, start);
        }
        s.dfs(r, vis);

        for(int i : vis){
            System.out.println(i);
        }

    }

    private void insert(int start, int end){
        List<Integer> list = map.get(start);
        if(list == null){
            list = new ArrayList<>();
            list.add(end);
            map.put(start, list);
        } else{
            list.add(end);
        }
    }
    private void dfs(int num, int[] vis){
        if(vis[num-1] != 0){
            return;
        }
        vis[num-1] = ++sort;
        List<Integer> list = map.get(num);
        if(list == null){
            return;
        }
        Collections.sort(list);
        for(Integer a : list){
            dfs(a, vis);
        }

    }
}
