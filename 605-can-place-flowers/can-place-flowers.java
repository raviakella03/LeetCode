class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxFlowers = 0;
        if(flowerbed.length < n) {
            return false;
        }

        if(flowerbed.length == 1) {
            return (flowerbed[0] == 0 && (n == 1 || n == 0)) || (flowerbed[0] == 1 && n == 0);
        }

        for(int i = 0; i < flowerbed.length; i++) {
            if(i == 0) {
                if(flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    ++maxFlowers;
                }
            } else if(i == flowerbed.length - 1) {
                if(flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    ++maxFlowers;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    ++maxFlowers;
                }
            }
        }
        
        return maxFlowers >= n;
    }
}