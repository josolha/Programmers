package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //readLine 입력 호출
        String line = bufferedReader.readLine();

        System.out.println("line = " + line);

        //공백으로 구분하여 분리함
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        String a = stringTokenizer.nextToken();
        String b = stringTokenizer.nextToken();
        int c = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(" a ,b, c = " + a + b + c);

    }
}
