class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int level = 0;

        for(Integer alt : gain) {
            level += alt;
            height = Math.max(height, level);
        }

        return height;
    }
}