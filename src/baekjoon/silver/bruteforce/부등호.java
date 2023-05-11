package baekjoon.silver.bruteforce;

import java.util.Scanner;

public class 부등호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = 2*n +1;
        char[] arr = new char[length];
        char[] arr2 = new char[length];

        for(int i = 1; i<length ;i+=2){
            arr[i] = sc.next().charAt(0);
            arr2[i] = arr[i];
        }

        int num = 9;
        int num2 = 0;

        for(int i =0; i< length;i++){
            if(arr[i] == '>' || i == length -1){
                int j = (i == length -1) ? i : i-1;
                while(j >= 0 && arr[j] != '>'){
                    if(arr[j] == '<'){
                        j--;
                        continue;
                    }
                    arr[j] = (num+"").charAt(0);
                    j--;
                    num--;
                }
            }

            if(arr2[i] == '<' || i == length -1){
                int j = (i == length -1) ? i : i-1;
                while(j >= 0 && arr2[j] != '<'){
                    if(arr2[j] == '>'){
                        j--;
                        continue;
                    }
                    arr2[j] = (num2+"").charAt(0);
                    j--;
                    num2++;
                }
            }

        }

        for(int i =0; i< length;i+=2){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i =0; i< length;i+=2){
            System.out.print(arr2[i]);
        }
    }
}
