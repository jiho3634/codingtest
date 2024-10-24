class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = getGcd(numer, denom);
        int[] answer = {numer / gcd, denom / gcd};
        return answer;
    }
    
    public int getGcd(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		return getGcd(b, a % b);
	}
}