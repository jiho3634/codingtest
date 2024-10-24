class Solution {
    public int solution(int a, int b) {
        String sA = String.valueOf(a);
        String sB = String.valueOf(b);
        String sAB = sA + sB;
        String sBA = sB + sA;
        int iAB = Integer.parseInt(sAB);
        int iBA = Integer.parseInt(sBA);
        if (iAB >= iBA) {
            return iAB;
        } else {
            return iBA;
        }
    }
}