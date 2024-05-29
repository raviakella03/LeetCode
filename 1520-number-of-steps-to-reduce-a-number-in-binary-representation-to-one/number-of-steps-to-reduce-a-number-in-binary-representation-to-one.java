class Solution {
    public int numSteps(String s) {
        int strLen = s.length();
        int steps = strLen - 1;
        int carry = 0;
        for(int i = strLen - 1; i > 0; i--) {
            if(s.charAt(i) - '0' + carry == 1) {
                ++steps;
                carry = 1;
            }
        } 

        return steps + carry;
    }
}