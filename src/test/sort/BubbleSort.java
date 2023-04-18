package test.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    //
    List<Node> list;// = new ArrayList<>();

    public void setNodeList(int[] arr) {
        list = new ArrayList<>();
        for(int a : arr){
            list.add(new Node(a, new Object()));
        }
    }

    public BubbleSort (int[] intArr){
        System.out.println("");
        this.setNodeList(intArr);
    }

    public void sort(){
        for(int idx = 0; idx < list.size(); idx++){
            for(int n = list.size()-1; n > idx; n--){
                if(list.get(n).getKey() < list.get(n-1).getKey()){
                    swap(list, n);
                }
            }
        }
       list.stream().forEach(e->{   System.out.println(e.getKey());});
    }

    private void swap(List<Node> list, Integer n){
        int temp = list.get(n).getKey();
        list.get(n).setKey(list.get(n-1).getKey());
        list.get(n-1).setKey(temp);

        System.out.println(list.get(n-1).getKey() + " ---> " + list.get(n).getKey());
    }
}

