class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {
            hs2.add(nums2[i]);
        }

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        for(Integer num : hs1) {
            if(!hs2.contains(num)) {
                res1.add(num);
            }
        }

        for(Integer num : hs2) {
            if(!hs1.contains(num)) {
                res2.add(num);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);

        return res;
    }
}