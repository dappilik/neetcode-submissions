class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length -1;
        int result = 0;
        while(left<right){
            int temp = (right-left)* Math.min(heights[left], heights[right]);
            if(temp > result){
                result= temp;
            }
            if(heights[left] >  heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }
}
