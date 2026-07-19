class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack;
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            stack = new ArrayDeque<>();
            int today = temperatures[i];
            int j = i + 1;
            while (j < temperatures.length && temperatures[j] <= today) {
                stack.push(temperatures[j]);
                j++;
            }

            result[i] = j < temperatures.length ? stack.size() + 1 : 0;
        }
        return result;
    }
}
