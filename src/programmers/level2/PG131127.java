package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class PG131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> posMap = new HashMap<>();
        for(int i = 0; i<want.length;i++){
            posMap.put(want[i], i);
        }

        for(int i = 0;i<10;i++){
            Integer pos = posMap.get(discount[i]);
            if(pos != null){
                number[pos]--;
            }
        }


        //print(number);
        if(isOk(number)){
            answer++;
        }

        for(int i = 10;i<discount.length;i++){
            Integer removePos = posMap.get(discount[i-10]);
            //System.out.println("-) " + discount[i-10]);
            //System.out.println("+) " + discount[i]);
            if(removePos != null){
                number[removePos]++;
            }
            Integer pos = posMap.get(discount[i]);
            if(pos != null){
                number[pos]--;
            }
            //print(number);
            // System.out.println("------------");
            if(isOk(number)){
                answer++;
            }
        }
        return answer;
    }

    private boolean isOk(int[] num){
        for(int a : num){
            if(a!=0){
                return false;
            }
        }
        return true;
    }

    private void print(int[] num){
        for(int a : num){
            System.out.println(a);
        }
    }
}
