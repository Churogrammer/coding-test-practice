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

        s.method(n);

        System.out.println();
    }

    private void method(int n){

    }
}
