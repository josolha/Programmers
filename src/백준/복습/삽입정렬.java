package 백준.복습;

import static java.util.Arrays.binarySearch;

import java.util.Arrays;

public class 삽입정렬 {

    static int[] arr = {3, 2, 5, 4, 7,2,6};
    static int size = arr.length;

    public static void main(String[] args) {


        삽입정렬 s = new 삽입정렬();
        s.insertionSort(arr, size);
        System.out.println(Arrays.toString(arr));

    }

    void insertionSort(int[] a, int size) {

        for (int i = 1; i < size; i++) {
            // 타겟 넘버
            int target = a[i];

            int j = i - 1;

            // 타겟이 이전 원소보다 크기 전 까지 반복
            while (j >= 0 && target < a[j]) {
                a[j + 1] = a[j];    // 이전 원소를 한 칸씩 뒤로 미룬다.
                j--;
            }

            a[j + 1] = target;
        }
    }
    void insertionSort2(int[] a, int size) {

        for(int i = 1; i < size; i++) {
            // 타겟 넘버
            int target = a[i];

            // 0 ~ i 사이 이분탐색을 통해 target이 배치 될 위치를 반환
            int location = binarySearch(a, 0, i, target);


            int j = i - 1;
            while(j >= location) {
                a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
                j--;
            }

            a[location] = target;
        }
    }
}
