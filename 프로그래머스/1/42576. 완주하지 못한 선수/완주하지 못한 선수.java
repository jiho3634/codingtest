import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = Arrays.stream(participant)
                .collect(Collectors.toMap(name -> name, name -> 1, Integer::sum));

        // 완주한 사람들의 이름을 Map에서 감소시킴
        for (String c : completion) {
            int count = map.get(c) - 1;
            if (count == 0) {
                map.remove(c);
            } else {
                map.put(c, count);
            }
        }

        // 완주하지 못한 사람을 찾아서 반환
        return map.keySet().iterator().next();
    }
}