class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        boolean b = false;
        StringBuilder tmp1 = new StringBuilder(A);
        for (int i = 0; i < A.length(); i++) {
            if (tmp1.toString().equals(B)) {
                b = true;
                break;
            }
            StringBuilder tmp2 = new StringBuilder();
            tmp2.append(tmp1.charAt(tmp1.length() - 1));
            tmp2.append(tmp1.substring(0, A.length() - 1));
            tmp1 = tmp2;
            answer++;
        }
        if (!b)
            return -1;
        else
            return (answer);
    }
}