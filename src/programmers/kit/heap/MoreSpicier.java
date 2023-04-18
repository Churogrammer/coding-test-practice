package programmers.kit.heap;

import java.util.*;

public class MoreSpicier {


    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(12);
        queue.add(11);
        queue.add(51);
        queue.add(31);
        queue.add(21);

        Math.max(1,2);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }

}
