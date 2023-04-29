package baekjoon.silver.bruteforce;
/*
* 셀프넘버
*
* */
public class SelfNumber {
    static int[] arr = new int[10050];
    public static void main(String[] args) {
        SelfNumber s = new SelfNumber();
        for(int n = 1; n <=10000;n++){
            s.d(n);
        }

        for(int n = 0; n <10000;n++){
           if(arr[n] == 0){
                System.out.println(n+1);
           }
        }
    }

    private void d(int n){
        int sum = n;
        while(n>0){
            sum+=n%10;
            n = n/10;
        }
        arr[sum-1] = sum;
    }
}
