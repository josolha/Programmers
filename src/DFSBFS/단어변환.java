package DFSBFS;

public class 단어변환 {
    public static void main(String[] args) {

    String begin = "hit";
    String target = "cog";
    String[] words = 	{"hot", "dot", "dog", "lot", "log"};

    단어변환_Solution sl = new 단어변환_Solution();
    System.out.println(sl.solution(begin,target,words));
    }
}
class 단어변환_Solution {

    String begin;
    String target;
    String[] words;

    int answer = Integer.MAX_VALUE;

    boolean[] visited;


    public int solution(String begin, String target, String[] words) {
        this.begin = begin;
        this.target = target;
        this.words = words;
        visited = new boolean[words.length];

        dfs(0,begin);

        if (answer == Integer.MAX_VALUE) {
            return 0; // 타겟에 도달할 수 없는 경우
        }
        System.out.println(answer);
        return answer;
    }

    private void dfs(int cnt, String begin) {
        if(begin.equals(target)){
            answer = Math.min(answer, cnt);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if(!visited[i] && sameOne(begin,words[i])){
                visited[i] =true;
                dfs(cnt+1,words[i]);
                visited[i] = false; // 백트래킹
            }
        }
    }
    private boolean sameOne(String begin,String other){
        int difCnt = 0;
        for (int i = 0; i < begin.length() ; i++) {
            if(begin.charAt(i) != other.charAt(i)){
                difCnt++;
                if (difCnt >1){
                    return false;
                }
            }

        }
        return difCnt == 1;
    }
}

