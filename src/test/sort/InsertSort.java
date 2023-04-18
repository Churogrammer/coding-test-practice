package test.sort;

public class InsertSort {
    int[] arr;

    public InsertSort(int[] arr){
        this.arr = arr;
    }
    public void sort(){
        for(int index = 1; index < arr.length; index++){
            int in = 0;
            int key = arr[index];
            for(in = index-1; in >= 0 ; in--){
                if(arr[in] > key){
                    arr[in+1] = arr[in];
                } else{
                    break;
                }
            }
            arr[in+1] = key;

        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private void swap(int s, int b){
        int temp = s;
        s = b;
        b =  s;
    }
}
