package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA비밀번호 {

    static int checkArr[];

    static int matchCount;

    static int roleArr[];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int totalLength = Integer.parseInt(stringTokenizer.nextToken());
        int windowSize = Integer.parseInt(stringTokenizer.nextToken());

        int Result = 0;

        checkArr = new int[4];
        roleArr = new int[4];

        matchCount = 0;

        char[] dnaSquence = new char[totalLength];
        dnaSquence = bufferedReader.readLine().toCharArray();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i <4; i++) {
            roleArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(roleArr[i] == 0){
                matchCount++;
            }
        }
        for (int i = 0; i < windowSize ; i++) {
            Add(dnaSquence[i]);

        }

        if (matchCount == 4) Result++;

        for (int i = windowSize; i <totalLength ; i++) {
            int j = i-windowSize;
            Add(dnaSquence[i]);
            Remove(dnaSquence[j]);
            if (matchCount == 4) Result++;
        }
        System.out.println("Result = " + Result);

    }

    private static void Remove(char dnaSquence) {
        switch (dnaSquence){
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

    private static void Add(char dnaSquence) {
        switch (dnaSquence){
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
