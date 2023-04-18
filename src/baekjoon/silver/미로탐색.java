package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 미로탐색 {
    Queue<Pos> queue = new LinkedList<>();
    static int n = 0, m = 0;
    int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] vis = new int[n][m];
        for(int i= 0; i<n;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String array = st2.nextToken();
            int pos = 0;
            for(char a : array.toCharArray()){
                vis[i][pos] = a-48;
                pos++;
            }
        }
        미로탐색 s = new 미로탐색();
        s.bfs(vis);
    }

    private void bfs(int[][] vis){
        queue.add(new Pos(0,0));

        while(!queue.isEmpty()){
            List<Pos> list = new ArrayList<>();
            count++;
            while(!queue.isEmpty()){
                list.add(queue.poll());
            }

            for(Pos pos : list){
                if(isZero(vis[pos.getX()][pos.getY()])){
                    continue;
                }

                vis[pos.getX()][pos.getY()] = 0;

                if(pos.getX() == n-1 && pos.getY() == m-1){
                    System.out.println(count);
                    return;
                }
                checkLeft(vis, pos);
                checkRight(vis, pos);
                checkUp(vis, pos);
                checkDown(vis, pos);
            }

        }
    }

    private boolean isZero(int num){
        return num == 0 ? true : false;
    }
    private void checkLeft(int[][] vis, Pos pos){
        if(pos.getX() > 0 && !isZero(vis[pos.getX()-1][pos.getY()])){
            queue.add(new Pos(pos.getX()-1, pos.getY()));
        }
    }

    private void checkRight(int[][] vis, Pos pos){
        if(pos.getX() < n-1 && !isZero(vis[pos.getX()+1][pos.getY()])){
            queue.add(new Pos(pos.getX()+1, pos.getY()));
        }
    }
    private void checkUp(int[][] vis, Pos pos){
        if(pos.getY() > 0 && !isZero(vis[pos.getX()][pos.getY()-1])){
            queue.add(new Pos(pos.getX(), pos.getY()-1));
        }
    }
    private void checkDown(int[][] vis, Pos pos){
        if(pos.getY() < m-1 && !isZero(vis[pos.getX()][pos.getY()+1])){
            queue.add(new Pos(pos.getX(), pos.getY()+1));
        }
    }
    private class Pos{
        int x;
        int y;

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }

        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
