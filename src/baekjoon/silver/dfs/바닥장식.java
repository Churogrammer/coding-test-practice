package baekjoon.silver.dfs;

import java.util.Scanner;

public class 바닥장식 {
    static int[][] arr;
    static boolean[][] vis;

    static int n = 0;
    static int m = 0;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        바닥장식 s = new 바닥장식();
        arr = new int[n][m];
        vis = new boolean[n][m];
        for(int i = 0 ; i < n ; i++ ){
            String str = sc.next();
            for(int j = 0; j < m; j++){
                char c = str.charAt(j);
                arr[i][j] = c == '|' ? 1 : 0;
            }
        }
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        s.dfs(0,0, 0,0);
        System.out.println(ans);
    }

    private void dfs(int x, int y, int preX, int preY){
        if(x >= n || y >= m){
            ans++;
            System.out.println(preX + ", " + preY + ": row 끝");
            return;
        }
        if(arr[preX][preY] != arr[x][y]){
            System.out.println(preX + "," + preY + "-> " + x + "," +y + ": 값바뀜");
            ans++;
        }

        for(int i = x; i < n;i++){
            for(int j = y; j < m;j++){
                System.out.println("검색 : " + i + ", " + j+ ": " + arr[i][j]);
                if(vis[i][j] == true){
                    System.out.println("이미 검색 : " + i + ", " + j+ ": " + arr[i][j]);
                    continue;
                }
                vis[i][j] = true;
                if(arr[i][j] == 0){
                    //System.out.println("가로 : " + i + ", " + j+ ": " + arr[i][j]);
                    dfs(i,j+1, i, j);
                    //System.out.println("가로 리턴 : " + i + ", " + j+ ": " + arr[i][j]);
                    continue;
                }
                if(arr[i][j] == 1){
                    //System.out.println("세로 : " + i + ", " + j+ ": " + arr[i][j]);
                    dfs(i+1, j,i,j);
                    //System.out.println("세로 리턴 : " + i + ", " + j+ ": " + arr[i][j]);
                    continue;
                }

            }
        }

    }
}
