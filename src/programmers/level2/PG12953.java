package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class PG12953 {
    public int solution(int[] arr) {
        Queue<Long> preQueue = new LinkedList<>();
        Queue<Long> nextQueue = new LinkedList<>();

        for(int a : arr){
            nextQueue.add((long)a);
        }

        while(nextQueue.size() > 1){
            preQueue = nextQueue;
            nextQueue = new LinkedList<>();

            while(preQueue.size() > 0){
                long b = preQueue.poll();
                if(preQueue.size() == 0){
                    nextQueue.add(b);
                    break;
                }

                long s = preQueue.poll();

                long val = calc(b, s);
                nextQueue.add(val);

            }

        }
        long answer = nextQueue.poll();
        return (int)answer;
    }

    private long calc(long b, long s){
        if(s > b){
            long t = s;
            s= b;
            b = t;
        }

        long val = 1;
        long bVal = b;
        long sVal = s;
        long lgm = 0;

        while(val > 0){
            val = b%s;
            lgm = s;
            b=s;
            s=val;
        }
        return (bVal * sVal)/lgm;
    }
}
