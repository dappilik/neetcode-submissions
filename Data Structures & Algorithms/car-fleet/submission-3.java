class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[] sortedIndices = IntStream.range(0, position.length)
                                  .boxed()
                                  .sorted((i, j) -> position[j] - position[i])
                                  .mapToInt(Integer::intValue)
                                  .toArray();

        Deque<Float> stack = new ArrayDeque<>();
        for (int i : sortedIndices) {
            float time = (float) (target - position[i]) / speed[i];

            if (stack.isEmpty() || stack.peek() < time) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
