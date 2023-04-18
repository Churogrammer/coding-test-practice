package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 알고리즘수업1_너비우선탐색 {
    static Map<Integer, List> map = new LinkedHashMap<>();
    static Queue<Integer> queue = new LinkedList<>();
    static int sort = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        알고리즘수업1_너비우선탐색 s = new 알고리즘수업1_너비우선탐색();

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
        s.bfs(r, vis);

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
    private void bfs(int num, int[] vis){
        queue.add(num);

        while(!queue.isEmpty()){
            int n = queue.poll();
            if(vis[n-1] != 0){
                continue;
            }
            vis[n-1] = ++sort;
            List<Integer> list = map.get(n);
            if(list != null){
                Collections.sort(list);
                for(Integer a : list){
                    if(vis[a-1]==0){
                        queue.add(a);
                    }
                }
            }
        }


    }
}
