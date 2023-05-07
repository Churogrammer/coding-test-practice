package programmers.level2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* 최댓값과 최솟값
* https://school.programmers.co.kr/learn/courses/30/lessons/12939
* */
public class PG12939_MaxAndMin {
    public String solution(String s) {
        Set<Integer> set = new HashSet<>();
        for(String str : s.split(" ")){
            set.add(Integer.parseInt(str));
        }
        return Collections.min(set) + " " + Collections.max(set);
    }
}
