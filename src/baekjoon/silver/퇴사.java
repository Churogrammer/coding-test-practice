package baekjoon.silver;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 퇴사 {
    List<Integer> ans = new ArrayList<>();
    static int max = 0;
    static boolean[] vis;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        퇴사 s = new 퇴사();

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        vis = new boolean[n];
        for(int i = 0; i < n;i++){
            String[] line = br.readLine().split(" ");
            String X = line[0];
            String Y = line[1];

            int day = Integer.parseInt(X);
            int value = Integer.parseInt(Y);

           // if(i+day <= n){
                arr[i][0] = day;
                arr[i][1] = value;
            //}
            //System.out.println(arr[i][0] + "," + arr[i][1]);
        }

        System.out.println();
        s.bruteForce(arr);
        System.out.println(max);

    }

    private void bruteForce(int[][] arr){
        int pos = 1;
        int sum = 0;
        for(int j = 0; j < arr.length; j++) {
            for (int i = j; i < arr.length; i += arr[i][0]) {
                if (pos + arr[i][0] > arr.length + 1) {
                    continue;
                }
                sum += arr[i][1];
                pos += arr[i][0];
            }
            ans.add(sum);
            if(max < sum){
                max = sum;
            }
            //System.out.println(sum);
            sum = 0;
        }

    }
}
