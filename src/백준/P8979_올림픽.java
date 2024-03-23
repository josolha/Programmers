package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P8979_올림픽 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int line = Integer.parseInt(st.nextToken());
        medal[] countries = new medal[line];
        int resultCountry = Integer.parseInt(st.nextToken());


        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int name = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            countries[i] = new medal(name, gold, silver, bronze);
        }
        //위에 코드 이렇게 줄일수있음.
//        for (int i = 0; i < N; i++) {
//            String[] input = br.readLine().split(" ");
//            for (int j = 0; j < 4; j++) {
//                countries[i][j] = Integer.parseInt(input[j]);
//            }
//        }
//
        medal[] origin = countries.clone();
        Arrays.sort(origin, new Comparator<medal>() {
            @Override
            public int compare(medal o1, medal o2) {
                if (o1.getGold() != o2.getGold()) {
                    return o2.getGold() - o1.getGold();
                } else if (o1.getSilver() != o2.getSilver()) {
                    return o2.getSilver() - o1.getSilver();
                } else {
                    return o2.getBronze() - o1.getBronze();
                }
            }
        });

        //todo 이렇게 말고 스트링 출력한 값 비교로 랭크 정해보기
        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < origin.length; j++) {
                if (countries[i].equals(origin[j])) {
                    countries[i].setRank(j + 1);
                    break;
                }
            }
        }

        System.out.println("=========원래의========");
        for (medal country : countries) {
            System.out.println(
                    country.getName() + ": Gold " + country.getGold() + ", Silver " + country.getSilver() + ", Bronze "
                            + country.getBronze() + ", Rank " + country.getRank());
        }
        System.out.println("=========정렬된========");
        for (medal country : origin) {
            System.out.println(
                    country.getName() + ": Gold " + country.getGold() + ", Silver " + country.getSilver() + ", Bronze "
                            + country.getBronze() + ", Rank " + country.getRank());
        }

        for (medal country : countries) {
            if (country.getName() == resultCountry) {
                System.out.println(country.getRank());
                break;
            }
        }

    }
}

class medal {
    private int name;
    private int gold;
    private int silver;
    private int bronze;

    private int rank;

    medal(int name, int gold, int silver, int bronze) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // 같은 인스턴스 참조인지 확인
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // null이거나 타입이 다른 경우 false 반환
        }

        medal other = (medal) obj;
        // 금, 은, 동 메달 수 모두 같은지 비교
        return this.gold == other.gold && this.silver == other.silver && this.bronze == other.bronze;
    }

    public int getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public int getSilver() {
        return silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}

