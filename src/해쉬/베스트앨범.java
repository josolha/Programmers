package 해쉬;

import java.util.HashMap;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        베스트앨범  sol = new 베스트앨범();
        sol.solution(genres,plays);
        // 예상결과 = [4, 1, 3, 0]


    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i],plays[i]);
        }
        System.out.println(hashMap);


        /*
        1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.

           그럼 hashmap 에 담아서 높은놈을 선택하자


        2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.

           그 안에서 sort를 통해 순서대로 출력


        3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

            같을 때 genres 고유 번호가 낮은걸 먼저
         */

        //2.


        return answer;
    }
}
