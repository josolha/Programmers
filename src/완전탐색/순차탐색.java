package 완전탐색;

public class 순차탐색 {
    static int sequentialSearch(int[] arr, int n, int x) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = new int[]{1,4,5,6};

        순차탐색.sequentialSearch(new int[]{1,2,3},2,4);
        System.out.println(순차탐색.sequentialSearch(new int[]{1,2,3,4,5,6},3,2));
    }
}




