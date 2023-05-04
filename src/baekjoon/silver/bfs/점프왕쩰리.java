package baekjoon.silver.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* 점프왕 쩰리 (small)
* */
public class 점프왕쩰리 {
    static String ans = "Hing";
    static boolean[][] vis;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        vis = new boolean[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        for(int i = 0; i<n;i++){
//            for(int j = 0; j<n;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        점프왕쩰리 s = new 점프왕쩰리();
        s.bfs(n, arr);
        System.out.println(ans);

    }
    private void bfs(int n, int[][] arr){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0,0, arr[0][0]));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.val == -1){
                ans = "HaruHaru";
                return;
            }

            if(vis[node.x][node.y]){
                continue;
            }
            //System.out.println(node.x + "," + node.y + " : " + node.val);

            if(node.val != 0){
                if(node.x + node.val < n){
                    //System.out.println("[add] " + (node.x+ node.val) + "," + node.y + " : " + node.val);
                    queue.add(new Node(node.x + node.val, node.y, arr[node.x+ node.val][node.y]));
                }
                if(node.y + node.val < n){
                   // System.out.println("[add] " + node.x + "," + (node.y+ node.val) + " : " + node.val);
                    queue.add(new Node(node.x, node.y+ node.val, arr[node.x][node.y+ node.val]));
                }
                vis[node.x][node.y] = true;
            }
        }
    }

    class Node{
        int x;
        int y;
        int val;
        public Node(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
}
