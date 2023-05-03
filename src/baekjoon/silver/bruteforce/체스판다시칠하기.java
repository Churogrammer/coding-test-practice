package baekjoon.silver.bruteforce;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 체스판 다시 칠하기
* https://www.acmicpc.net/problem/1018
* */
public class 체스판다시칠하기 {
    static int min = 64;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        체스판다시칠하기 s = new 체스판다시칠하기();

        int h = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[][] arr = new int[h][l];
        for(int i = 0; i < h; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String str = st2.nextToken();
            s.convArray(i,l,arr,str);
        }

        for(int b = 0; b+8 <=h ;b++){
            for(int k = 0; k+8 <=l; k++){
                //System.out.println( b + "," +k);
                s.method(b,k, arr);
            }
        }
        System.out.println(min);
    }

    private void convArray(int row, int l,int[][] arr, String str) {
        for(int i = 0; i < l;i++){
            arr[row][i] = str.charAt(i) == 'B' ? 1 : 0;
        }
    }

    private void method(int s,int k, int[][] arr){
        int bAns = 0;
        int wAns = 0;
        int f = arr[s][k];
        for(int i = 0 ; i < 8 ;i++){
            for(int j = 0; j < 8; j+=2){
                if(f == arr[s+i][k+j]){
                    bAns++;
                } else{
                    wAns++;
                }
            }

            for(int j = 1; j < 8; j+=2){
                if(f != arr[s+i][k+j]){
                    bAns++;
                } else{
                    wAns++;
                }
            }
            f = f == 0 ? 1 : 0;
        }
        getMin(64-bAns, 64-wAns);
    }

    private void getMin(int x, int y){
        int candt = x < y ? x : y;
        min = candt < min ? candt : min;
    }

    private void print(int[][] arr){
        for(int[] a : arr){
            for (int b : a){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
