class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        //O(N), O(1)
        Arrays.fill(result, 1);

        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int prev = 1;

        for(int i = n - 1; i >=0; i--) {
            result[i] = result[i] * prev;
            prev = prev * nums[i];
        }

        //O(N), O(N)
        /*int[] prefixProd = new int[n];
        int[] suffixProd = new int[n];
        prefixProd[0] = nums[0];
        suffixProd[n - 1] = nums[n - 1];

        for(int i = 1; i < n; i++) {
            prefixProd[i] = prefixProd[i - 1] * nums[i];
        }

        for(int i = n - 2; i >= 0; i--) {
            suffixProd[i] = suffixProd[i + 1] * nums[i];
        }

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                result[i] = suffixProd[i + 1];
            } else if(i == n - 1) {
                result[i] = prefixProd[i - 1];
            } else {
                result[i] = prefixProd[i - 1] * suffixProd[i + 1];
            }
        } */
        return result;
    }
}