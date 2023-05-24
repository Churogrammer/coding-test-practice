package programmers.level2;

import java.util.Stack;

public class PG42584 {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];
        stack.push(prices[0]);
        int last = 0;
        for(int i = 1; i< prices.length;i++){
            int val = prices[i];
            int arrVal = 1;
            int iC = i-1;
            while(!stack.isEmpty() && (val < stack.peek())){
                if(answer[iC]==0){
                    stack.pop();
                    answer[iC] = arrVal;
                }

                iC--;
                arrVal++;
            }
            stack.push(val);
        }
        int cnt = prices.length-1;
        int cntVal = 0;
        while(!stack.isEmpty()){
            if(answer[cnt]==0){
                //System.out.println(stack.peek());
                stack.pop();
                answer[cnt] = cntVal;
            }
            cnt--;
            cntVal++;
        }

        return answer;
    }
}
