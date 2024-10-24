class Solution {
    public int solution(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        String sab = sa + sb;
        int iab = Integer.parseInt(sab);
        int ab2 = 2 * Integer.parseInt(sa) * Integer.parseInt(sb);
        return Math.max(iab, ab2);
    }
}