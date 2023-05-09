package programmers.level2;

/*
* 이진 변환 반복하기
* https://school.programmers.co.kr/learn/courses/30/lessons/70129
* */
public class PG70124_Repeat_BinaryChange {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1){
            answer[0]++;

            int length = s.length();
            s = s.replace("0", "");
            answer[1] += length - s.length();

            s = Integer.toBinaryString(s.length());
        }

        return answer;
    }
}
