import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        int len = weights.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(weights[0], 1);
        for(int i = 1; i < len ; i++){
            Set<Integer> temp = new HashSet<>();
          //a * (2,3,4) = weights[i] * (2,3,4) 
            for(int j = 2; j < 5; j++){
                for(int k = 2; k < 5; k++){
                    if((1.0 * weights[i] * j / k) % 1 == 0){
                      //weights[i] * j / k 인 a가 있는지 찾기
                        Integer val = map.get(weights[i] * j / k);
                        if(val != null){
                            if(!temp.contains(weights[i] * j / k)){
                                answer += val;
                                temp.add(weights[i] * j / k);
                            }
                        }
                    }
                }
            }
            Integer val = map.get(weights[i]);
            if(val != null){
                map.put(weights[i], val+1);
            }else{
                map.put(weights[i], 1);
            }
        }
        return answer;
    }
}
