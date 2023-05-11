package baekjoon.silver.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class 잃어버린괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new ArrayList<>();

        for (String s : str.split("-")) {
            //System.out.println(s);
            int val = 0;
            for (String num : s.split("\\+")) {
                //System.out.println(num);
                val += Integer.parseInt(num);
            }
            list.add(val);
        }

        int ans = list.get(0) * 2;
        for (Integer a : list) {
            ans -= a;
        }
        System.out.println(ans);
        TreeMap treeMap = new TreeMap();
    }
//
//
//
//        for(char c : str.toCharArray()){
//            if(c == '+' || c == '-'){
//                list.add(Integer.parseInt(sb.toString()));
//                opList.add(c);
//                sb = new StringBuilder();
//                continue;
//            }
//            sb.append(c);
//        }
//
//        int ans = opList.get(0);
//        for(Character op : opList){
//            if(op == '-'){
//
//            }
//        }
//
//    }
}
