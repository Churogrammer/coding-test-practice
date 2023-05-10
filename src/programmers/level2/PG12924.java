package programmers.level2;
/*
 * 숫자의 표현
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class PG12924 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];

        int r = 0;
        for(int i =0;i<=n;i++){
            for(int s = r; s <=i;s++){
                arr[s] += i;
                if(arr[s] >= n){
                    r++;
                    if(arr[s] == n && s!=0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
