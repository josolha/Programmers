package DFSBFS;

public class 단어변환복습 {
    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        단어변환복습_Solution sl = new 단어변환복습_Solution();
        System.out.println(sl.solution(begin,target,words));
    }
}
class 단어변환복습_Solution {

    String begin;
    String target;
    String[] words;

    boolean[] visited;
    int answer = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[]words) {
        this.begin = begin;
        this.target = target;
        this.words = words;
        this.visited = new boolean[words.length];

        dfs(0,begin);

        if(answer == Integer.MAX_VALUE){
            return 0;
        }
        return answer;
    }

    private void dfs(int cnt, String begin) {
        if(begin.equals(target)){
           answer = Math.min(answer,cnt);
           return;
        }
        for (int i = 0; i <words.length ; i++) {
            if(!visited[i] && sameOne(begin,words[i])){
                visited[i] =true;
                dfs(cnt+1,words[i]);
                visited[i] =false;
            }
        }
    }

    private boolean sameOne(String begin, String word) {
        int diff = 0;
        for (int i = 0; i <begin.length() ; i++) {
            if(begin.charAt(i) != word.charAt(i)){
                diff++;
                if(diff >1){
                    return false;
                }
            }
        }
        return diff == 1;
    }
}



