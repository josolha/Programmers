package LEVEL2;

import java.util.ArrayList;
import java.util.List;

//https://dkyou.tistory.com/302

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {

        int answer  = 0;
        if(cacheSize ==0){
            answer = cities.length*5;
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i <cities.length ; i++) {
            cities[i] = cities[i].toLowerCase();
            if(list.contains(cities[i])){
                list.remove(cities[i]);
                list.add(cities[i]);
                answer +=1;
            }else {
                if (list.size() == cacheSize) {
                    list.remove(0);
                    list.add(cities[i]);
                }else{
                    list.add(cities[i]);
                }

                answer +=5;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) throws Exception {
        캐시 캐시 = new 캐시();
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        캐시.solution(cacheSize,cities);
    }

}

class hello{
    void print(){

    }
}
