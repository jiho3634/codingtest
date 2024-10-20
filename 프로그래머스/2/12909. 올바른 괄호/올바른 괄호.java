class Solution {
    boolean solution(String s) {
       // 스택의 역할을 대신할 카운터
        int openCount = 0;

        // 문자열의 각 문자에 대해 처리
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;  // 여는 괄호면 카운트 증가
            } else {
                openCount--;  // 닫는 괄호면 카운트 감소
            }
            // 여는 괄호보다 닫는 괄호가 먼저 나오면 즉시 false 반환
            if (openCount < 0) {
                return false;
            }
        }

        // 모든 괄호가 짝을 맞췄는지 확인
        return openCount == 0;
    }
}