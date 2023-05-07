package programmers.level2;
/*
* JadenCase 문자열 만들기
* https://school.programmers.co.kr/learn/courses/30/lessons/12951
* */
public class PG12951_JadenCase {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        char[] arr = s.toLowerCase().toCharArray();
        String fChar = arr[0] + "";
        sb.append(fChar.toUpperCase());
        for(int i = 1; i< arr.length;i++){
            if(arr[i-1] == ' ' && arr[i] != ' ' && arr[i] >= 60){
                arr[i] = (char) (arr[i] -32);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
