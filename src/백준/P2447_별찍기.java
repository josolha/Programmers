package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class P2447_별찍기 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        printStars(N);
    }

    private static boolean isStar(int x, int y, int N) {
        // N이 1일 때는 항상 별을 찍습니다.
        if (N == 1) {
            return true;
        }
        // 가운데 공백인 경우
        if (x / (N / 3) == 1 && y / (N / 3) == 1) {
            return false;
        }
        // 재귀 호출로 각 3x3 섹션을 확인합니다.
        return isStar(x % (N / 3), y % (N / 3), N / 3);
    }
    private static void printStars(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (isStar(i, j, N)) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }



    private static void showStars(String[][] stars) {
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                //가운데 위치에 빈칸 넣기
                if ((stars.length / 3) <= i && i <= (stars.length / 3) * 2 - 1 &&
                        (stars[i].length / 3) <= j && j <= (stars[i].length / 3) * 2 - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void showStars2(String[][] stars, int size, int originalSize) {
        if(size ==0){
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                //가운데 위치에 빈칸 넣기
                if ((size / 3) <= i && i <= (size / 3) * 2 - 1 &&
                        (stars[i].length / 3) <= j && j <= (stars[i].length / 3) * 2 - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        showStars2(stars, size / 3, originalSize);

    }
    private static void showStars3(String[][] stars, int size, int originalSize) {
        // 재귀 함수의 종료 조건
        if (size == 0) {
            return;
        }

        // size가 1일 때만 별 패턴을 출력
        if (size == 1) {
            for (int i = 0; i < originalSize; i++) {
                for (int j = 0; j < stars[i].length; j++) {
                    // 첫 번째 호출에서 중앙에 빈칸 생성
                    if (i >= originalSize / 3 && i < (originalSize / 3) * 2 &&
                            j >= originalSize / 3 && j < (originalSize / 3) * 2) {
                        System.out.print(" ");
                    } else {
                        // 나머지 영역에 별 출력
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

        // 재귀 호출
        showStars3(stars, size / 3, originalSize);
    }
    private static void printPattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (isStar(i, j, N)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




    private static void printPattern4(int size){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j < size ; j++) {
                if(checkPattern(i,j,size)){
                    sb.append("*");
                }
                else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    private static boolean checkPattern(int x, int y, int size){

        // 최종적으로 와야하는곳
        if(size ==1){
          return true;
        }
        // 가운데 별 처리 (해당 사이즈에 3을 나누고 좌표를 나눈 값)
        if(x / (size / 3) == 1 && y / (size / 3) == 1){
            return false;
        }
        //재귀
        return checkPattern(x % (size /3), y % (size /3), size /3 );
    }
}
