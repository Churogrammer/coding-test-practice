package programmers.level2;

import java.util.Stack;

/*
* 짝지어 제거하기
* https://school.programmers.co.kr/learn/courses/30/lessons/12973
* */
public class PG12973 {
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }

            char sC = stack.peek();
            if(sC == c){
                stack.pop();
            } else{
                stack.push(c);
            }
        }

        return stack.isEmpty()? 1 : 0;
    }
}
