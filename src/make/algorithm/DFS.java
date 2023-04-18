package make.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DFS {
    public static void main(String[] args) {
        String numbers = "17";
        int[] arr = new int[numbers.length()];


        for(int i = 0; i < numbers.length() ; i++){
            arr[i] = Integer.parseInt(numbers.charAt(i)+"");
        }


        boolean[] visited = new boolean[arr.length];
        DFS dfs = new DFS();
        Set<String> set = new HashSet<>();
        dfs.loop(arr, visited, 0, "", set);
        for(String s : set){
            System.out.println(s);
        }
    }

    public void loop(int[] arr, boolean[] visited, int length, String fix, Set<String> set){
        if(arr.length == length){
            //System.out.println(fix);
            int k = Integer.parseInt(fix.charAt(length-1)+"");
            if(k%2 != 0){
                set.add(fix);
            }
            return;
        }

        for(int i = 0; i < arr.length ;i++){
            if(!visited[i]){
                visited[i] = true;
                loop(arr, visited, length+1,fix + arr[i],set);
                visited[i] = false;
            }
        }
    }
}
