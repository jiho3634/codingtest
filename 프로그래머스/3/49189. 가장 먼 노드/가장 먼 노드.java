import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
                List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            list.get(a[0] - 1).add(a[1]);
            list.get(a[1] - 1).add(a[0]);
        }

        int[] distance = new int[n];
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.add(1);
        visited[0] = true;
        int max = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            for (int i : list.get(tmp - 1)) {
                if (!visited[i - 1]) {
                    q.add(i);
                    visited[i - 1] = true;
                    distance[i - 1] = distance[tmp - 1] + 1;
                    if (max < distance[i - 1]) {
                        max = distance[i - 1];
                    }
                }
            }
        }
        int answer = 0;
        for (int d : distance) {
            if (d == max) {
                answer++;
            }
        }
 
       return  answer;
    }
}