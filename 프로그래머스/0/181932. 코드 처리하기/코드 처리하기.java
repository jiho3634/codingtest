class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
            } else {
                if (!mode && (i % 2 == 0)) {
                    ret += code.charAt(i);
                } else if (mode && (i % 2 == 1)) {
                    ret += code.charAt(i);
                }
            }
        }
        return ret.equals("") ? "EMPTY" : ret;
    }
}