package programmers.level2;

import java.util.HashSet;
import java.util.Set;

/*
* 영어 끝말잇기
* https://school.programmers.co.kr/learn/courses/30/lessons/12981
* */
public class PG12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Set<String> set = new HashSet<>();
        char preLC = words[0].charAt(0);

        for(int i = 0; i< words.length;i++){
            char lC = words[i].charAt(0);
            if(set.contains(words[i]) || lC != preLC){
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                return answer;
            }
            preLC = words[i].charAt(words[i].length() -1);
            set.add(words[i]);
        }

        return answer;
    }
}
