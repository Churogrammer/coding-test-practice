package programmers.kit.bruteForce;

import java.util.HashSet;
import java.util.Set;

public class FindSosu {
    Set<Integer> list = new HashSet<>();
    public static void main(String[] args) {
        FindSosu sol = new FindSosu();
        String numbers = "011";
        sol.solution(numbers);
    }

    public int solution(String numbers) {
        int z = 0;
        int size = 1;
        while(z < numbers.length()){
            z++;
            size*=10;
        }
        boolean[] arr = new boolean[size];
        int answer = 0;
        int[] nums = new int[numbers.length()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(numbers.charAt(i)+"");
        }

        boolean[] used = new boolean[nums.length];
        for(int length = 1 ; length <= nums.length ; length++){
            pick(0, 0, length, nums, used,"");
        }

        // 1이면 소수
        arr[2] = true;
        for(int num = 3; num<= size ;num+=2){
            double sqrt = Math.sqrt(num);
            for(int k = 0 ; k <= sqrt ; k+=1){
                if(num%k == 0){
                    if(num == k){
                        arr[num] = true;
                    }
                    break;
                }
            }
        }

        for(Integer s : list){
            System.out.println(s);
//            if(arr[s] ==true ){
//                answer++;
//            }
            if(isPrime(s)){
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    private static boolean isPrime(int num) {
        if(num <= 1)
            return false;
        if(num%2 == 0){
            if(num == 2){
                return true;
            }
            return false;
        }
        for (int i = 3; i < num; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void pick(int num, int pos, int length, int[] nums, boolean[] used, String result){
        if(num == length){
            list.add(Integer.parseInt(result));
            return;
        }
        for(int i = pos; i < nums.length ; i++){
            if(used[i] == false){
                used[i] = true;
                pick(num +1, pos, length, nums, used, result + nums[i]);
                used[i] = false;
            }
        }
    }

}
