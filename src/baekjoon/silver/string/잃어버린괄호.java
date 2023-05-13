package baekjoon.silver.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 잃어버린괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new ArrayList<>();

        for (String s : str.split("-")) {
            int val = 0;
            for (String num : s.split("\\+")) {
                val += Integer.parseInt(num);
            }
            list.add(val);
        }

        int ans = list.get(0) * 2;
        for (Integer a : list) {
            ans -= a;
        }
        System.out.println(ans);
    }
}
