package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 부녀회장이 될테야
* https://www.acmicpc.net/problem/2775
* */
public class 부녀회장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        부녀회장 s = new 부녀회장();

        int k = Integer.parseInt(st.nextToken());
        int[][] question = new int[k][2];
        int mX = 0, mY = 0;
        for(int j = 0;j < k; j++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st2.nextToken());
            if(mY < y){
                mY = y;
            }
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st3.nextToken());
            if(mX < x){
                mX = x;
            }
            question[j] = new int[]{y,x};
        }


        s.method(mX, mY,question);
    }

    private void method(int mX, int mY, int[][] question) {
        int arr[][] = new int[mY+1][mX+1];
        for(int i = 1; i <= mX; i++){
            arr[0][i] = i;
        }

        int sum = 0;
        for(int k = 1; k <=mY;k++){
            for(int j = 1; j <= mX; j++) {
                for (int i = 1; i <= j; i++) {
                    sum += arr[k - 1][i];
                }
                arr[k][j] = sum;
                sum = 0;
            }
        }

        for(int[] q : question){
            System.out.println(arr[q[0]][q[1]]);
        }
    }

}
