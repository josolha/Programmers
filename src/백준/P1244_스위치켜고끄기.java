package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P1244_스위치켜고끄기 {


    public static void main(String[] args) throws IOException {

        //남학생은 스위치 번호가 자기가 받은 배수이면 -> 스위치를 바꿈 (킴 -> 끔, 끔->킴)
        //예) 3이면 3, 6 반전 시킴

        //여학생은 여학생은 자기가 받은 수와 같은 번호가 붙은 스위치를 중심으로 좌우가 대칭이면서
        //가장 많은 스위치를 포함하는 구간을 찾아서, 그 구간에 속한 스위치의 상태를 모두 바꾼다.
        //이때 구간에 속한 스위치 개수는 항상 홀수가 된다

        //0 1 0 1 0 0 0 1

        //남 ->  3번
        //0 1 1 1 0 1 0 1

        //여-> 3번
        //1 0 0 0 1 1 0 1

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 스위치 개수 입력 받기
        int totalCnt = Integer.parseInt(br.readLine());

        // 스위치 상태 입력 받기
        int[] lights = new int[totalCnt];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < totalCnt; i++) {
            lights[i] = Integer.parseInt(st.nextToken());
        }

        int totalMember = Integer.parseInt(br.readLine());
        for (int j = 0; j < totalMember; j++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            //남자일때
            if (sex == 1) {
                for (int i = num - 1; i < lights.length; i += num) {
                    lights[i] ^= 1;
                }

            //여자일때
            } else if (sex == 2) {
                lights[num - 1] ^= 1;
                int left = num - 2; //왼쪽
                int right = num; //오른쪽
                while (left >= 0 && right < lights.length && lights[left] == lights[right]) {
                    lights[left] ^= 1;
                    lights[right] ^= 1;
                    left--;
                    right++;
                }
            }
        }

        for (int i = 0; i <lights.length ; i++) {
            System.out.print(lights[i]+" ");
            if((i+1)%20 == 0){
                System.out.println();
            }
        }
    }
}
