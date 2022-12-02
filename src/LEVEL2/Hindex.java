package LEVEL2;

public class Hindex {
    public int solution(int[] citations) {
        int answer = 0;
        int use = 0;
        int notUse = 0;
        int average = 0;
        for (int number: citations) {
            average += number;
        }
        average = average/citations.length;

        for (int i = 0; i < citations.length ; i++) {
            if(citations[i] >= average ){
                use++;
            }
            if(citations[i] <= average ){
                notUse++;
            }
        }
        answer = Math.max(use,notUse);
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        Hindex hd = new Hindex();
        int[] arr = {3, 0, 6, 1, 5};
        hd.solution(arr);

    }
    // 1. 3이상인 인덱스 계산
}
