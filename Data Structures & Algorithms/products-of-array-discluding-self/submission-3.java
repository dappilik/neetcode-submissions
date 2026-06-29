class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] req = new int[n];
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            req[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            req[i] *= postfix;
            postfix *= nums[i];
        }
        return req;
    }
}  
