import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, String> map = new TreeMap<>();
        for (int i = 0; i < strings.length; i++)
            map.put(strings[i].charAt(n) + strings[i], strings[i]);
        String[] answer = new String[map.size()];
        Iterator<String> it = map.values().iterator();
        for (int i = 0; i < map.size(); i++) {
            answer[i] = it.next();
        }
        return answer;
    }
}