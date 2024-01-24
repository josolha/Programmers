package 백준;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.youtube.com/watch?v=FCAtxryNgq4

public class P24060_병합정렬 {

    static int cnt;
    static boolean found = false;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N  = Integer.parseInt(stringTokenizer.nextToken());
        cnt  = Integer.parseInt(stringTokenizer.nextToken());

        int[] A = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N ; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        mergeSort(A,0,A.length-1);

        if (!found) {
            System.out.println(-1);
        }

//        int[] array = {4,5,1,3,2};
//        mergeSort(array, 0, array.length - 1);
//
//        System.out.println("Sorted Array:");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
    }
    
    public static void mergeSort(int[] originArr, int start, int last){
        if(start<last) {
            // start 는 처음 인덱스, last은 마지막 인덱스
            int middle = (start+last)/2; // middle는  start, last의 중간 지점
            mergeSort(originArr , start, middle); // 전반부 정렬
            mergeSort(originArr, middle+1 , last); //후반부 정렬
            merge(originArr,start,middle,last); // 병합
        }
    }

    private static void merge(int[] originArr, int start, int middle, int last) {
        int[] tmp = new int[last - start + 1]; // 임시 배열 생성
        int leftIndex = start; // 첫 번째 부분 배열의 시작 인덱스
        int rightIndex = middle + 1; // 두 번째 부분 배열의 시작 인덱스
        int t = 0; // 임시 배열의 인덱스

        // 두 부분 배열을 순회하며 임시 배열에 정렬하여 저장
        while (leftIndex <= middle && rightIndex <= last) {
            if (originArr[leftIndex] <= originArr[rightIndex]) {
                //System.out.println("들어감 left"+originArr[leftIndex]);
                tmp[t++] = originArr[leftIndex++];
            } else {
                //System.out.println("들어감 right"+originArr[rightIndex]);
                tmp[t++] = originArr[rightIndex++];
            }
        }

        // 첫 번째 부분 배열의 남은 요소를 임시 배열에 추가
        while (leftIndex <= middle) {
            //System.out.println("들어감 left"+originArr[leftIndex]);
            tmp[t++] = originArr[leftIndex++];
        }

        // 두 번째 부분 배열의 남은 요소를 임시 배열에 추가
        while (rightIndex <= last) {
            //System.out.println("들어감 right"+originArr[rightIndex]);
            tmp[t++] = originArr[rightIndex++];
        }

        // 임시 배열의 요소들을 원래 배열에 복사
        for (leftIndex = start, t = 0; leftIndex <= last; leftIndex++, t++) {
            if (--cnt == 0) {
                System.out.println(tmp[t]);
                found = true;
                return;
            }
            originArr[leftIndex] = tmp[t];
        }
    }
}
