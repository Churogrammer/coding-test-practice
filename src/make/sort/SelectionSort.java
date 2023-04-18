package make.sort;


public class SelectionSort {
    int[] arr;
    public SelectionSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        for(int index  = 0; index < arr.length; index++){
            int minPtr = index;
            for(int in = index+1; in < arr.length; in++){
                if(arr[minPtr] > arr[in]){
                    minPtr = in;
                }
            }
            swap(minPtr, index);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private void swap(int minPtr, int index){
        int indexVal = arr[index];
        arr[index] = arr[minPtr];
        arr[minPtr] = indexVal;
    }
}
