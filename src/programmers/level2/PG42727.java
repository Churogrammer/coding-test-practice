package programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PG42727 {
    public int solution(int[] citations) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(citations);
        int max = 0;
        for(int a : citations){
            if(max < a){
                max = a;
            }
            Integer val = map.get(a);
            if(val == null){
                map.put(a, 1);
                continue;
            }

            map.put(a, val+1);
        }
        int answer = 0;
        int size = citations.length;

        for(int h = 0; h <= max;h++){
            if(size >= h){
                answer = h;
                if(map.get(h)!=null){
                    size -= map.get(h);
                }
            }
        }

        return answer;
    }
}
