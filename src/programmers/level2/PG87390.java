package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class PG87390 {
    public int[] solution(int n, long left, long right) {
        List<Integer> list = new ArrayList<>();
        long rowL = (left)/(long)n;
        long colL = (left)%(long)n;
        long rowR = (right)/(long)n;
        long colR = (right)%(long)n;
        //System.out.println(rowL + "," + colL);
        //System.out.println(rowR + "," + colR);

        for(long i = rowL ; i<= rowR;i++){
            long start = (i== rowL) ? colL : 0;
            long end = (i==rowR)? colR : n-1;
            for(long j = start;j <= end ; j++){

                if(i >=j){
                    //System.out.println("[i]" + (i+1) + "[j]" + (j+1));
                    list.add((int)i+1);
                } else{
                    //System.out.println("[j]" + (j+1)+ "[i]" + (i+1));

                    list.add((int)j+1);
                }
            }
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
