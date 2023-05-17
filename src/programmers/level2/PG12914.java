package programmers.level2;
/*
* https://school.programmers.co.kr/learn/courses/30/lessons/12914
* */
public class PG12914 {
    static int result;
    public long solution(int n) {
        result = n;
        if(n <= 3){
            return n;
        }

        long div = 1234567;
        long[] arr = new long[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i< n+1; i++){
            arr[i] = (arr[i-1]+arr[i-2])%div;
        }
        return arr[n];
    }
}
