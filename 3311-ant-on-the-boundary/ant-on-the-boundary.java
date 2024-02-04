class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int boundaryVisits = 0;
        int distanceFromBoundary = 0;
        for(int i = 0; i < nums.length; i++) {
            distanceFromBoundary += nums[i];
            if(distanceFromBoundary == 0) {
                ++boundaryVisits;
            }
        }
        return boundaryVisits;
    }
}