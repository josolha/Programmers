package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class P25757_임스와함께하는미니게임 {
    
    static String[] names;
    static Set set = new HashSet<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int memberCnt = Integer.parseInt(st.nextToken());
        String gameType = st.nextToken();
        names = new String[memberCnt];

        for (int i = 0; i <memberCnt ; i++) {
            st = new StringTokenizer(br.readLine());
            names[i] = st.nextToken();
        }

        for (String name: names) {
            set.add(name);
        }

       // System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        switch (gameType){
            case "Y":
                System.out.println(yGame());
                break;
            case "F":
                System.out.println(fGame());
                break;
            case "O":
                System.out.println(oGame());
                break;
        }
    }
    static int yGame(){
        return set.size();
    }
    static int fGame(){
        return set.size() / 2;
    }
    static int oGame(){
        return set.size() / 3;
    }
}
