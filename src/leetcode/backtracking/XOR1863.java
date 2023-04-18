package leetcode.backtracking;

import java.util.*;

public class XOR1863 {
    Integer resultSum = 0;
    public static void main(String[] args) {
        int[] nums = {5,1,6};
        XOR1863 sol = new XOR1863();
        sol.subsetXORSum(nums);
    }

    public int subsetXORSum(int[] nums){
        boolean[] used = new boolean[nums.length];
        for(int length = 1 ; length <= nums.length ; length++){
            pick(0, 0, length, nums, used,"");
        }

        int sum = 0;
//        for(String str : list){
//            sum+= makeBitArray(str);
//        }
        return sum;
    }

    private void pick(int num, int pos,  int length, int[] nums, boolean[] used, String result){
        if(num == length){
            resultSum += makeBitArray(result);
            return;
        }
        for(int i = pos; i < nums.length ; i++){
            if(used[i] == false){
                used[i] = true;
                pick(num +1, i, length, nums, used, addStr(result, nums[i]));
                used[i] = false;
            }
        }
    }

    public String addStr(String str, int a){
         return str + a + " ";
    }

    private int makeBitArray(String str){
        int[] bit = new int[5];
        //System.out.println(str);
        List<Integer> arr = new ArrayList<>();

        String temp = "";
        for(char c: str.toCharArray()){
            if(c != ' '){
                temp += c;
                continue;
            }
            arr.add(Integer.parseInt(temp));
            //intSet.add(Integer.parseInt(temp));
            temp = "";
        }
        for(Integer a : arr){
            System.out.print(a + " ");
        }
        System.out.println("");
        return xorFunc(arr);
    }

    private int xorFunc(List<Integer> arr){
        int result = arr.get(0);
        for(int i = 1 ;i < arr.size(); i++){
            result = result^arr.get(i);
        }
        System.out.println(result);
        return result;
    }

}
