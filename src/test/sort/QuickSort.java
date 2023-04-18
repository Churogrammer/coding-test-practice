package test.sort;

public class QuickSort {

    int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public int partition(int begin, int end){
        int pivot = arr[begin];
        int s = begin+1;
        int e = end;
        do{
            while(s <= e && arr[s] < pivot){ s++;    }
            while(s <= e && arr[e] > pivot){ e--;    }
            if(s<=e){
                swap(s,e);
                s++;
                e--;
            }
        } while(s <= e);
        swap(begin, e);
        return e;
    }

    public void sort(int left, int right){
        if (left < right) {
            int pivotIndex = partition(left, right);
            sort(left, pivotIndex - 1);
            sort(pivotIndex + 1, right);
        }
    }

    private void swap(int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
