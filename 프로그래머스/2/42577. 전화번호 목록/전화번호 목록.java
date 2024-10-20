import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호 배열을 정렬
        Arrays.sort(phone_book);
        // 인접한 전화번호끼리만 비교하면 됨 (정렬되어 있기 때문)
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}