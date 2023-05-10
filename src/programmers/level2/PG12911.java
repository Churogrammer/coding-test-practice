package programmers.level2;

/*
* 다음 큰 숫자
* https://school.programmers.co.kr/learn/courses/30/lessons/12911
* */
public class PG12911 {
    public int solution(int n) {
        int answer = 0;
        String bN = Integer.toBinaryString(n);
        bN = bN.replace("0", "");

        for(int i = n+1; i<= 1000000;i++){
            if(convert(i, bN) != -1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    private int convert(int s, String bN){
        String bS = Integer.toBinaryString(s);
        bS = bS.replace("0", "");
        if(bS.length() == bN.length()){
            return s;
        }
        return -1;
    }
}
