package baekjoon.silver.bruteforce;

import baekjoon.BaekjoonTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 좌표정렬하기
* https://www.acmicpc.net/problem/11650
* */
public class 좌표정렬하기 {
    static Map<Integer, List<Integer>> ans = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        좌표정렬하기 s = new 좌표정렬하기();
        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            String[] line = br.readLine().split(" ");
            Integer x = Integer.parseInt(line[0]);
            Integer y = Integer.parseInt(line[1]);
            s.method(x, y);
        }

        for(int i = -100000; i <= 100000; i++){
            List<Integer> list = ans.get(i);
            if(list == null){
                continue;
            }
            Collections.sort(list);
            for(Integer a : list){
                System.out.println(i + " " + a);
            }
            //System.out.println();
        }
    }

    private void method(int x, int y){
        List<Integer> list = ans.get(x);
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(y);
        ans.put(x, list);
    }
}
