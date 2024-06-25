import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    static List<String[]> paths;
    static LinkedList<String> path;
    static boolean[] used;
    
    public String[] solution(String[][] tickets) {

        paths = new ArrayList<>();
        path = new LinkedList<>();
        used = new boolean[tickets.length];

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals("ICN")) {
            	path.add(tickets[i][0]);
            	path.add(tickets[i][1]);
            	used[i] = true;
            	dfs(tickets);
            	used[i] = false;
            	path.remove(path.size() -1);
            	path.remove(path.size() -1);
            }
        }
        return minPath();
    }

    static void dfs(String[][] tickets) {
        if (path.size() == tickets.length + 1) {
            paths.add(path.toArray(new String[0]));
        } else {
            for (int i = 0; i < tickets.length; i++) {
                if (!used[i] && path.getLast().equals(tickets[i][0])) {
                    path.add(tickets[i][1]);
                    used[i] = true;
                    dfs(tickets);
                    used[i] = false;
                    path.removeLast();
                }
            }
        }
    }

    static boolean pathCmp(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                if (a[i].compareTo(b[i]) < 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    static String[] minPath() {
        String[] answer = paths.get(0);
        for (int i = 1; i < paths.size(); i++) {
            if (!pathCmp(answer, paths.get(i))) {
                answer = paths.get(i);
            }
        }
        return answer;
    }
}