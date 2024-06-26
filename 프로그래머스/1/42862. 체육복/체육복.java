import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> setLost = new HashSet<>();
        for (int num : lost) setLost.add(num);
        Set<Integer> setReserve = new HashSet<>();
        for (int num : reserve) setReserve.add(num);
        Set<Integer> tmp = new HashSet<>(setReserve);
        setReserve.removeAll(setLost);
        setLost.removeAll(tmp);

        for (int i : setLost) {
            if (setReserve.contains(i - 1)) {
                setReserve.remove(i - 1);
            } else {
                if (setReserve.contains(i + 1)) {
                    setReserve.remove(i + 1);
                } else {
                    n--;
                }
            }
        }
        return n;
    }
}