package programmers.level2;

import java.util.*;

public class PG131701 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[elements.length*2];
        System.arraycopy(elements,0,arr,0,elements.length);
        System.arraycopy(elements,0,arr,elements.length,elements.length);

        for(int i = 0; i< elements.length;i++){
            int sum = 0;
            for(int n = 0; n < elements.length;n++){
                sum += arr[i+n];
                set.add(sum);
            }
        }
        return set.size();
    }
}
