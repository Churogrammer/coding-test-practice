package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* N-Queen
* https://www.acmicpc.net/problem/9663
* */
public class NQueen {
    static int ans = 0;
    static int sort = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        NQueen s = new NQueen();

        int n = Integer.parseInt(st.nextToken());
        int[][] vis = new int[n][n];
        s.dfs(0, vis);
        System.out.println(ans);
    }

    private void dfs(int pos, int[][] vis){
        if(pos == vis.length){
            ans++;
            return;
        }

        for(int i = 0; i < vis.length; i++){
            if(vis[i][pos] != 0){
                continue;
            }
            update(i, pos, vis, ++sort, 0);
            dfs(pos+1, vis);
            update(i, pos, vis, 0,sort--);
        }
    }

    private void update(int x, int y, int[][] vis, int val, int compare){
        for(int i = y; i < vis.length; i++){
            if(vis[x][i] == compare){
                vis[x][i] = val;
            }
        }

        int ur = x, dr = x;
        for(int i = y+1; i < vis.length; i++){
            if(!isOver(ur+1, vis.length)){
                if(vis[ur+1][i] == compare){
                    vis[ur+1][i] = val;
                }
                ur++;
            }
            if(!isOver(dr-1, vis.length)){
                if(vis[dr-1][i] == compare) {
                    vis[dr-1][i] = val;
                }
                dr--;
            }
        }
    }

    private boolean isOver(int j, int num){
        return j < 0 || j > num-1 ? true : false;
    }


    private void print(int[][] vis){
        for(int i = 0; i< vis.length; i++){
            for(int j = 0; j< vis.length; j++){
                System.out.print(vis[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
