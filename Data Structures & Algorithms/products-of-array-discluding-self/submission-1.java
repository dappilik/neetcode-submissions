class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] pre = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                pre[i] = 1;
            } else {
                pre[i] = pre[i-1] * nums[i-1];
            }
        }
        System.out.println(Arrays.toString(pre));
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                pre[i] = pre[i] * postfix;
                postfix = postfix * nums[i];
                System.out.println(Arrays.toString(pre) + " " +postfix );
            } else {
                System.out.println("before " + Arrays.toString(pre) + " " +postfix );
                pre[i] = pre[i] * postfix;
                postfix = postfix * nums[i];
                System.out.println("After"  + Arrays.toString(pre) + " " + postfix );
            }
        }
        
        return pre;  
    }
}  
