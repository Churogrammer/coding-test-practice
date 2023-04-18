package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int sec = 0;
        if (n == k) {
            System.out.println(sec);
            return;
        }

        숨바꼭질1697 s = new 숨바꼭질1697();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tQueue = new LinkedList<>();
        int size = k >= n ? k : n;
        int[] visited = new int[size*2 +1];
        visited[n] = 1;

        queue.add(n);
        int ans = 0;
        while(ans == 0){
            sec++;
            while(!queue.isEmpty()){
                Integer value = queue.poll();
                if(value == k){
                    ans = sec;
                    break;
                }
                s.visit(tQueue, visited, value, sec);
            }
            queue.addAll(tQueue);
            tQueue.clear();
        }

        System.out.println(sec -1);
    }

    public void visit(Queue<Integer> queue, int[] visited, int pos, int sec){
        if(pos > 0 && visited[pos-1] == 0){
            visited[pos - 1] = sec;
            queue.add(pos-1);
        }
        if(pos < visited.length -1 && visited[pos+1] == 0){
            visited[pos + 1] = sec;
            queue.add(pos+1);
        }
        if(pos*2 < visited.length-1 && visited[pos*2] == 0){
            visited[pos*2] = sec;
            queue.add(pos*2);
        }
    }
}
