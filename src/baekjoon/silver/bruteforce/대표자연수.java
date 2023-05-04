package baekjoon.silver.bruteforce;

import java.util.*;

/*
* 대표 자연수
* */
public class 대표자연수 {
    public static void main(String[] args) {
        int ans = 0;
        long ansV = Long.MAX_VALUE;
        Map<Integer, Integer> set = new HashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        long avg = 0;
        for(int i = 0; i< n;i++){
            int a = sc.nextInt();
            if(set.get(a) == null){
                set.put(a, 1);
            }else {
                int ge = set.get(a)+1;
                set.put(a, ge);
            }
            avg += a;
            if(max < a){
                max = a;
            }
        }

        int mCount = n;
        int pCount = 0;
        long[] sort = new long[max+1];
        sort[0] = avg;
        for(int i = 1 ; i <= max;i++){
            sort[i] = sort[i-1] - mCount + pCount;
            if(set.get(i) != null){
                mCount -= set.get(i);
                pCount += set.get(i);
                set.remove(i);
            }
            if(ansV > sort[i]){
                ansV = sort[i];
                ans = i;
            }
        }



//        for(long a : sort){
//            System.out.println(a);
//        }



//
//
//
//
//
//
//        //avg = (int) Math.ceil((double) avg/n);
//        //avg = n;
//        System.out.println((int) Math.ceil((double) avg/n));
//
//
//
//
//
//        for(int j = 0; j <= avg;j++){
//            long sum = 0;
//            for(int i = 0; i < n ;i++){
//                sum += Math.abs(arr[i] - j);
//            }
//
//            if(sum < ansV){
//                ansV = sum;
//                ans = j;
//            }
//            //map.put(j, sum);
//        }
//        for(int a : map.keySet()){
//            System.out.println(a + " : " + map.get(a));
//            if(map.get(a) < ansV){
//                ansV = map.get(a);
//                ans = a;
//            }
//        }

        System.out.println(ans);

    }
}
