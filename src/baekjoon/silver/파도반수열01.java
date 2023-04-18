package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 파도반수열01 {
    List<Long> ans = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        파도반수열01 s = new 파도반수열01();

        for(int i = 0; i < n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st2.nextToken());
            s.method(k);
        }

        for(Long a : s.ans){
            System.out.println(a);
        }
    }

    private void method(int n){
        int size = n > 3 ? n : 3;

        long[] arr = new long[size];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for(int i = 3; i < n;i++){
            arr[i] = arr[i-3] + arr[i-2];
        }

        ans.add(arr[n-1]);
    }
}
