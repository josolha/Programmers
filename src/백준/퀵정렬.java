package 백준;

public class 퀵정렬 {
    /*
        퀵정렬 평균 시간복잡도 NlogN

         N = 1,000,000 일때  퀵정렬 => 1,000,000 * 20

        분할 정복

        pivot = 기준점
     */
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 4, 5};

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 원소가 1개일 경우 그대로 두고 반환

        int pivot = start; // 피벗은 첫 번째 원소

        int i = start + 1, j = end;

        while (i <= j) { // 엇갈릴 때까지 반복

            //0 1 2 3 4   //i => 2 j =>
            while (i <= end && arr[i] <= arr[pivot]) i++;  // 왼쪽부터 큰수를 찾고 빠져나옴
            while (j > start && arr[j] >= arr[pivot]) j--;  //오른쪽부터 작은수를 찾고 빠져나옴

            if (i > j) { // 엇갈렸다면 피벗과 작은 데이터 교체
                swap(arr, pivot, j);
            } else { // 엇갈리지 않았다면 작은 데이터와 큰 데이터 교체
                swap(arr, i, j);
            }
        }

        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
