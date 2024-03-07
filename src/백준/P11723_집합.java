package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P11723_집합 {

    static boolean[] arr = new boolean[20];
    static StringBuilder sb = new StringBuilder();

    static int number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < inputNum ; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            String function = st.nextToken();

            switch (function){
                case "add":
                    number = Integer.parseInt(st.nextToken());
                    add(number);
                    break;

                case "remove":
                    number = Integer.parseInt(st.nextToken());
                    remove(number);
                    break;

                case "check":
                    number = Integer.parseInt(st.nextToken());
                    check(number);
                    break;

                case "toggle":
                    number = Integer.parseInt(st.nextToken());
                    toggle(number);
                    break;

                case "all":
                    all();
                    break;

                case "empty":
                    empty();
                    break;
            }
        }
        System.out.println(sb.toString());

    }
    public static void add(int number){
        if(arr[number-1]){
            return;
        }else{
           arr[number-1]=true;
        }
        //arr[number - 1] = true; 줄이기 가능
    }

    public static void remove(int number){
        if(!arr[number-1]){
            return;
        }else{
            arr[number-1]=false;
        }
        //arr[number - 1] = false; 줄이기 가능
    }

    public static void check(int number){
        if(!arr[number-1]){
            sb.append("0\n");
        }else{
            sb.append("1\n");
        }

    }

    public static void toggle(int number){
        if(!arr[number-1]){
            arr[number-1]=true;
        }else{
            arr[number-1]=false;
        }
        //arr[number - 1] = !arr[number - 1]; 줄이기 가능
    }

    public static void all(){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] =true;
        }
        //Arrays.fill(arr, true); 줄이기 가능

    }

    public static void empty(){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] =false;
        }
        //Arrays.fill(arr, false); 줄이기 가능

    }
}
