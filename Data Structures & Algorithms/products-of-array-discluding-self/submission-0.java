class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pre[i] = nums[i];
            } else {
                pre[i] = pre[i - 1] * nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                post[i] = nums[i];
            } else {
                post[i] = post[i + 1] * nums[i];
            }
        }
        int[] req = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                req[i] = post[i + 1];
            } else if (i == nums.length - 1) {
                req[i] = pre[i - 1];
            } else {
                req[i] = post[i + 1] * pre[i - 1];
            }

        }

        return req;  
    }
}  
