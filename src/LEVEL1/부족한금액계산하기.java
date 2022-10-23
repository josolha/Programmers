package LEVEL1;// https://school.programmers.co.kr/learn/courses/30/lessons/82612

public class 부족한금액계산하기 {

        public long solution(int price, int money, int count) {
            int total_Money = 0 ;

            for (int i = 1; i <count +1 ; i++) {
                total_Money += (price * i);
            }

//            long answer = (total_Money - money >= 0)?total_Money - money : 0 ;

//            System.out.println(answer);
//            return answer;
            System.out.println(Math.max(count*(price + (price* count))/2-money, 0));
            return Math.max(count*(price + (price* count))/2-money, 0);
        }

        public static void main(String[] args) {
            int price = 3;
            int money = 20;
            int count = 5;
            부족한금액계산하기 sl = new 부족한금액계산하기();
            sl.solution(price,money,count);





        }
    }
