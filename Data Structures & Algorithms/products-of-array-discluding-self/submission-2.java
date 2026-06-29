class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
        int[] req = new int[n];
        if (n > 0) {
            req[0] = 1;
        }
        for (int i = 1; i < n; i++) {
            req[i] = req[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            req[i] = req[i] * postfix;
            postfix = postfix * nums[i];
        }

        return req;
    }
}  
