package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekjoonTemplate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BaekjoonTemplate s = new BaekjoonTemplate();

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st2.nextToken());

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st3.nextToken());
        }
        s.method(n);

        System.out.println();
    }

    private void method(int n){

    }
}
