package 백준.복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수이어쓰기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        int b = 1;
        int index = 0;

        while(true){
            String temp = String.valueOf(b);
            for (int i = 0; i < temp.length() ; i++) {
                if(temp.charAt(i) == a.charAt(index)){
                    index++;
                    if(index == a.length()){
                        System.out.println(b);
                        return;
                    }
                }
            }
            b++;
        }
    }
}
