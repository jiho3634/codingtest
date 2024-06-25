import java.util.ArrayList;
import java.util.List;
class Solution {

    public static int solution(int n, int[][] computers) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < computers[i].length; j++) {
                if (computers[i][j] == 1 && i != j) {
                    list.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(list, visited, i);
            	answer++;
            }
        }
        return answer;
    }

    static void dfs(List<List<Integer>> list, boolean[] visited, int start) {
        if (list.get(start).isEmpty()) {
            return ;
        } else {
            for (int i : list.get(start)) {
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(list, visited, i);
                }
            }
        }
    }
}