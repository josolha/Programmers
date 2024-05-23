package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1515_수이어쓰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num  = br.readLine();

        int index = 0;
        int start = 1;
        while(true){
            String temp = String.valueOf(start);
            for (int j = 0; j <temp.length() ; j++) {
                if(temp.charAt(j) == num.charAt(index)){
                    index++;
                    if(index == num.length()){
                        System.out.println(start);
                        return;
                    }
                }
            }
            start++;
        }
        //9,9,9,9,9,9,9,9,9,
        //10000000000
    }
}
