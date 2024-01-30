package 백준.복습;

public class 퀵정렬 {

    public static void main(String[] args) {

        int[] arr = {5,4};

        quickSort(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

        // 재귀 탈출
        if(start >= end){
            return;
        }

        int pivot = start;
        int i = start + 1;
        int j = end;

        while(i<=j){

            while(i <= end && arr[i] <= arr[pivot]){
                i++;
            }
            while(j > start && arr[j] >= arr[pivot]){
                j--;
            }
            if(i > j){
                swap(arr,pivot,j);
            }else{
                swap(arr,i,j);
            }

        }
        quickSort(arr,start,j-1);
        quickSort(arr,j+1,end);


    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
