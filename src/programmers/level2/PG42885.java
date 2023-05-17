package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PG42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> set = new ArrayList<>();

        Arrays.sort(people);
        int j = people.length -1;
        int i = 0;

        while(i <= j){
            while(i < j && (people[i] + people[j] > limit)){
                j--;
                set.add(people[j]);
                answer++;
            }
            answer++;
            j--;
            i++;
        }

        return answer;
    }
}
