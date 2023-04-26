package baekjoon.silver;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이친수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        이친수 s = new 이친수();
        int n = Integer.parseInt(st.nextToken());

        s.method(n);
    }

    private void method(int n){
        int size = n <=3 ? 3 : n;
        long[] arr = new long[size+1];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = arr[1] + arr[2];
        if(n == 3){
            System.out.println(arr[n]);
            return;
        }

        for(int i =4;i < n+1;i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(arr[n]);
    }
}
