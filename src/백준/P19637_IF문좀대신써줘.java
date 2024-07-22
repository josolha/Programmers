package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.plaf.IconUIResource;

public class P19637_IF문좀대신써줘 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String[] title = new String[a];
        int[] power = new int[b];

        for (int i = 0; i <a ; i++) {
            st = new StringTokenizer(br.readLine());
            title[i] = st.nextToken();
            power[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < b ; i++) {
            int num = Integer.parseInt(br.readLine());

            int start = 0;
            int end = a-1;

            while (start<=end){
                int mid = (start+end)/2;

                if(power[mid] < num){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            sb.append(title[start]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
