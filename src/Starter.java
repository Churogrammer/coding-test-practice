import make.sort.MergeSort;

public class Starter {
    public static void main(String[] args) {
        //BubbleSort bubbleSort = new BubbleSort(new int[]{14,13,4,8,11,3,10,5,17,16,2,9,7,1,6,12,15});
        //bubbleSort.sort();

        //SelectionSort selectionSort = new SelectionSort(new int[]{14,13,4,8,11,3,10,5,17,16,2,9,7,1,6,12,15});
        //selectionSort.sort();

        //InsertSort insertSort = new InsertSort(new int[]{14,13,4,8,11,3,10,5,17,16,2,9,7,1,6,12,15});
        //insertSort.sort();

//        int[] arr = new int[]{5,6,4,7,2,1,3,9};
//        QuickSort quickSort = new QuickSort(arr);
//        quickSort.sort(0, arr.length -1);

        MergeSort mergeSort = new MergeSort(new int[]{5,6,4,7,2,1,3,8});
        mergeSort.sort();

    }
}
