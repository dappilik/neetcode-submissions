class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<List<Integer>> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < heights.length; right++) {
            int left = right;

            while (!stack.isEmpty() && stack.peek().get(1) > heights[right]) {
                max = Math.max((right - stack.peek().get(0)) * stack.peek().get(1), max);
                left = Math.min(left, stack.peek().get(0));
                stack.pop();
            }

            stack.push(List.of(left, heights[right]));
        }

        while (!stack.isEmpty()) {
            max = Math.max((heights.length - stack.peek().get(0)) * stack.peek().get(1), max);
            stack.pop();
        }
        return max;
    }
}
