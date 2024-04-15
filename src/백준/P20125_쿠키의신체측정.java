package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P20125_쿠키의신체측정 {

    static String[][] person ;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder builder =new StringBuilder();

        int size = Integer.parseInt(st.nextToken());

        person = new String[size][size];

        for (int i = 0; i <size ; i++) {
            st = new StringTokenizer(br.readLine());
            person[i] = st.nextToken().split("");
        }

        int[] headIndex = findHead();
        int[] heartIndex = findHeart(headIndex);

        builder.append((heartIndex[0]+1)+" "+(heartIndex[1]+1)+"\n");

        int leftHandSize = leftHand(heartIndex);
        int rightHandSize =rightHand(heartIndex);
        int bodySize = body(heartIndex);

        int[] LeftLegStartIndex = new int[]{heartIndex[0]+bodySize+1,heartIndex[1]-1};
        int leftLegSize = leg(LeftLegStartIndex);

        int[] RightLegStartIndex =new int[]{heartIndex[0]+bodySize+1,heartIndex[1]+1};
        int rightLegSize = leg(RightLegStartIndex);

        builder.append(leftHandSize+" "+rightHandSize+" "+bodySize+" "+leftLegSize+" "+ rightLegSize);

        System.out.println(builder.toString());

    }
    private static int leftHand(int[] heartIndex){
        int size = 0;
        for (int i = heartIndex[1]-1; i >= 0; i--) {
            if(person[heartIndex[0]][i].equals("*")){
               size++;
            }
        }
        return size;
    }
    private static int rightHand(int[] heartIndex){
        int size = 0;
        for (int i = heartIndex[1]+1; i < person.length; i++) {
            if(person[heartIndex[0]][i].equals("*")){
                size++;
            }
        }
        return size;
    }
    private static int body(int[] heartIndex){
        int size = 0;
        for (int i = heartIndex[0]+1; i < person.length ; i++) {
            if(person[i][heartIndex[1]].equals("*")){
                size++;
            }
        }
        return size;
    }
    private static int leg(int[] legStart){
        int size = 0;
        for (int i = legStart[0]; i < person.length ; i++) {
            if(person[i][legStart[1]].equals("*")){
                size++;
            }
        }
        return size;
    }

    private static int[] findHeart(int[] headIndex) {
        return new int[]{headIndex[0] + 1, headIndex[1]};
    }

    private static int[] findHead() {
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person[i].length; j++) {
                if (person[i][j].equals("*")) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
