class Solution {
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int resLen = nums1.length + nums2.length;
    //     double[] result = new double[resLen];
    //     int i = 0, j = 0, k = 0;
    //     while(i < nums1.length && j < nums2.length) {
    //         if(nums1[i] < nums2[j]) {
    //             result[k] = (double) nums1[i];
    //             ++i;
    //         } else {
    //             result[k] = (double) nums2[j];
    //             ++j;
    //         }
    //         ++k;
    //     }

    //     while(i < nums1.length) {
    //         result[k] = (double) nums1[i];
    //         ++i;
    //         ++k;
    //     }

    //     while(j < nums2.length) {
    //         result[k] = (double) nums2[j];
    //         ++j;
    //         ++k;
    //     }

    //     if(resLen % 2 == 0) {
    //         return (result[(resLen / 2) - 1] + result[resLen / 2]) / 2;
    //     } else {
    //         return result[resLen / 2];
    //     }
    // }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N = nums1.length;
        int M = nums2.length;
        if(N == 0) {
            if(M % 2 == 0) {
                return ((double) nums2[(M / 2) - 1] + (double) nums2[M / 2]) / 2;
            } else {
                return (double) nums2[M / 2];
            }
        } else if(M == 0) {
            if(N % 2 == 0) {
                return ((double) nums1[(N / 2) - 1] + (double) nums1[N / 2]) / 2;
            } else {
                return (double) nums1[N / 2];
            }
        }

        if(N > M) {
            return findMedianSortedArrays(nums2, nums1, M, N);
        } else {
            return findMedianSortedArrays(nums1, nums2, N, M);
        }
    }

    private double findMedianSortedArrays(int[] A, int[] B, int N, int M) {
        double result = Integer.MAX_VALUE;
        int left = 0;
        int right = N;
        int x = (M + N + 1) / 2;
        while(left <= right) {
            int mid = (left + right) / 2;
            int cut1 = mid;
            int cut2 = x - mid;
            double l1 = cut1 >= 1 ? (double) A[cut1 - 1] : (double) Integer.MIN_VALUE;
            double r1 = cut1 < N ? (double) A[cut1] : (double) Integer.MAX_VALUE;
            double l2 = cut2 >= 1 ? (double) B[cut2 - 1] : (double) Integer.MIN_VALUE;
            double r2 = cut2 < M ? (double) B[cut2] : (double) Integer.MAX_VALUE;
            if(l1 <= r2 && l2 <= r1) {
                if((N + M) % 2 == 0) {
                    result = (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                    break;
                } else {
                    result = Math.max(l1, l2);
                    break;
                }
            } else if(l1 > r2) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}