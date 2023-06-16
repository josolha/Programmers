package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class P12891_DNA비밀번호 {
    static int checkArr[];
    static int roleArr[];

    static int matchCount;

    //슬라이딩 윈도우

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        //문자길이
        int totalLength = Integer.parseInt(st.nextToken());

        //뽑은문자
        int windowSize = Integer.parseInt(st.nextToken());

        int Result = 0;

        // 비밀번호 체크 배열
        roleArr = new int[4];
        checkArr = new int[4];

        matchCount = 0;

        //현재 상태 배열 (GATA)
        char[] dnaSquence = new char[totalLength];
        dnaSquence = bf.readLine().toCharArray();

        st =  new StringTokenizer(bf.readLine());

        //1001
        for (int i = 0; i < 4; i++) {
            roleArr[i] = Integer.parseInt(st.nextToken());
            if(roleArr[i] == 0){
                matchCount++;
                // 0일때는 상관없으니깐 시크릿변수는 하나 올린다.
            }
        }

        //슬라이딩 이전에 처음 값 넣기
        for (int i = 0; i < windowSize ; i++) { //부분문자열 처음 받을때 세팅
            Add(dnaSquence[i]);
        }

        if(matchCount == 4) Result++;

        //슬라이딩 윈도우
        for (int i = windowSize; i < totalLength; i++) {
            int j = i-windowSize;
            Add(dnaSquence[i]);
            Remove(dnaSquence[j]);
            if(matchCount == 4) Result++;
        }

        System.out.println("Result = " + Result);
        bf.close();

    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(checkArr[0] == roleArr[0]) matchCount--;
                checkArr[0]--;
                break;
            case 'C':
                if(checkArr[1] == roleArr[1]) matchCount--;
                checkArr[1]--;
                break;
            case 'G':
                if(checkArr[2] == roleArr[2]) matchCount--;
                checkArr[2]--;
                break;
            case 'T':
                if(checkArr[3] == roleArr[3]) matchCount--;
                checkArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                checkArr[0]++;
                if(checkArr[0] == roleArr[0]) matchCount++;
                break;
            case 'C':
                checkArr[1]++;
                if(checkArr[1] == roleArr[1]) matchCount++;
                break;
            case 'G':
                checkArr[2]++;
                if(checkArr[2] == roleArr[2]) matchCount++;
                break;
            case 'T':
                checkArr[3]++;
                if(checkArr[3] == roleArr[3]) matchCount++;
                break;
        }
    }
}
