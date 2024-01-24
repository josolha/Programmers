package 해쉬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        베스트앨범  sol = new 베스트앨범();
        System.out.println(Arrays.toString(sol.solution(genres,plays)));

       /*
        장르별로 가장 많이 재생된 노래 두개씩
        속한 노래가 많이 재생된 장르를 먼저 수록합니다.
        장르 내에서 많이 재생된 노래를 먼저 수록합니다.
        장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
        */

        //putifabsent가 핵심이네
//        Map<String, Integer> map = new HashMap<>();
//        map.put("key1", 1);  // "key1"에 1 할당
//        map.put("key1", 2);  // "key1"에 이미 값이 있지만, 2로 덮어씌움
//
//        System.out.println(map);
//
//        Map<String, Integer> map2 = new HashMap<>();
//
//        map2.putIfAbsent("key1", 1);  // "key2"에 3 할당 (key2가 존재하지 않으므로)
//        map2.putIfAbsent("key1", 2);  // "key2"에 이미 값이 있으므로 아무 동작도 하지 않음
//
//        System.out.println(map2);

    }
    public int[] solution(String[] genres, int[] plays) {

        Map<String, HashMap<Integer,Integer>> genreMap = new HashMap<>();
        HashMap<String,Integer> total = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < genres.length ; i++) {

//            if (!genreMap.containsKey(genres[i])) {
//                // 장르에 해당하는 HashMap이 없으면 새로 생성
//                genreMap.put(genres[i], new HashMap<>());
//            }
//            // 장르에 해당하는 HashMap에 곡 정보(인덱스와 재생 횟수) 추가
//            genreMap.get(genres[i]).put(i, plays[i]);

            //위에랑 같은 얘기
            genreMap.putIfAbsent(genres[i], new HashMap<>());
            genreMap.get(genres[i]).put(i, plays[i]);

            total.put(genres[i],total.getOrDefault(genres[i],0)+ plays[i]);
        }

        //System.out.println(genreMap);
        //System.out.println(total);

        List<String> keySet = new ArrayList<>(total.keySet());

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return total.get(o2).compareTo(total.get(o1));
            }
        });
        keySet.sort((o1, o2) -> total.get(o2).compareTo(total.get(o1)));

        //System.out.println(keySet);
        for (String key: keySet) {
            List<Integer> test = new ArrayList<>(genreMap.get(key).keySet());
            test.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return genreMap.get(key).get(o2).compareTo(genreMap.get(key).get(o1));
                }
            });

            int maxSongs = Math.min(2, test.size());
            for (int i = 0; i < maxSongs; i++) {
                list.add(test.get(i));
            }

         //   System.out.println(test);
        }

       // System.out.println(list);


        return list.stream().mapToInt(i -> i).toArray();
    }
}
