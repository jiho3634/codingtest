import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothingMap = new HashMap<>();

        // 각 의상 종류별로 의상의 개수를 카운팅
        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothingMap.put(type, clothingMap.getOrDefault(type, 0) + 1);
        }

        int combinations = 1;
        // 각 종류별 (의상 개수 + 1)을 곱함 (해당 종류의 의상을 입지 않는 경우를 고려)
        for (int count : clothingMap.values()) {
            combinations *= (count + 1);
        }

        // 최소 한 개의 의상은 입어야 하므로 아무것도 입지 않은 경우를 제외
        return combinations - 1;
    }
}