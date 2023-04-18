package test.sort;

import java.util.LinkedList;

public class MergeSort {
    LinkedList<Integer> list;
    int[] arr;

    public MergeSort(LinkedList<Integer> list){
        this.list = list;
    }

    public MergeSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        //int div = list.size();
        sort(0, arr.length-1);
        getMinimum(0, arr.length-1);

        for(int a : arr){
            System.out.println(a);
        }
    }

    private void sort(int start, int end){
        System.out.println("s : " + start +" / end : " + end);
        int mid = (start + end) /2;
        if(mid - start >=1 ){
            sort(start, mid);
        }
        getMinimum(start, mid);
        if(end - (mid+1) >= 1){
            sort(mid +1, end);
        }
        getMinimum(mid+1, end);
    }
    private void getMinimum(int start, int end){
        if(start == 0 && end == 7){
            System.out.println("dddddddddkwdkwkkdkwdk");
        }
        // start ~ mid/2
        int pointer = start;
        LinkedList<Integer> prevList = new LinkedList<>();
        LinkedList<Integer> nextList = new LinkedList<>();
        for(int i = start; i <= (start + end)/2 ; i++){
            prevList.add(arr[i]);
        }

        for(int i = (start + end)/2 +1 ; i <= end; i++){
            nextList.add(arr[i]);
        }

        while(!prevList.isEmpty() && !nextList.isEmpty()){
            if(prevList.getFirst() >= nextList.getFirst()){
                arr[pointer] = nextList.poll();
                pointer++;
            } else{
                arr[pointer] = prevList.poll();
                pointer++;
            }
        }

        for(Integer val : prevList){
            arr[pointer] = val;
            pointer++;
        }

        for(Integer val : nextList){
            arr[pointer] = val;
            pointer++;
        }
    }
}
