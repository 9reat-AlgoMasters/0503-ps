import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        int[] arr = new int[10001];
        int cnt = 0;
        for(int i = 0; i < len; i++){
            if(arr[topping[i]]++ == 0){
                cnt++;
            }
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            set.add(topping[i]);
            if(--arr[topping[i]] == 0){
                cnt--;
            }
            if(cnt == set.size()){
                answer++;
            }
        }
        return answer;
    }
}
