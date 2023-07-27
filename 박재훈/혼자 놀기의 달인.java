class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        int len = cards.length;
      //하라는대로 다 하기
        for(int i = 0; i < len; i++){  
            boolean[] visited = new boolean[len];
            int cntGroup1 = 0;
            int idx = i;
            while(!visited[idx]){
                visited[idx] = true;
                idx = cards[idx] - 1;
                cntGroup1++;
            }
            for(int j = 0; j < len; j++){
                if(visited[j]) continue;
                int cntGroup2 = 0;
                idx = j;
                while(!visited[idx]){
                    visited[idx] = true;
                    idx = cards[idx] - 1;
                    cntGroup2++;
                }
                answer = Math.max(answer, cntGroup1 * cntGroup2);
            }
        }
        return answer;
    }
}
