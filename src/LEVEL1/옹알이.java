package LEVEL1;

import java.util.Arrays;

public class 옹알이 {
    public static void main(String[] args) {
        옹알이 옹알이 = new 옹알이();
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] babbling2 = {"aya", "yee", "u", "maa"};
        System.out.println(옹알이.solution(babbling2));
        }

    public static int countChar(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }


    public int solution(String[] babbling) {
        String[] babbling_list = {"aya", "ye", "woo", "ma" };
        int answer = 0;

        for (int i = 0; i <babbling.length ; i++) {
            if(babbling[i].contains("ayaaya")||babbling[i].contains("yeye")||babbling[i].contains("woowoo")||babbling[i].contains("mama")){
                continue;
            }
            for (int j = 0; j < babbling_list.length ; j++) {
                if(babbling[i].contains(babbling_list[j])){
                    babbling[i] = babbling[i].replace(babbling_list[j],"");
                    if(babbling[i].length() ==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
