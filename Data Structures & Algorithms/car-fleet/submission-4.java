class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Integer[] sortedIndices = new Integer[position.length];
        for(int i=0; i< position.length;i++){
            sortedIndices[i] = i;
        }
        Arrays.sort(sortedIndices, (a,b) -> position[b]- position[a]);
        
        Deque<Double> stack = new ArrayDeque<>();
        for (int i : sortedIndices) {
            Double time = (double) (target - position[i]) / speed[i];

            if (stack.isEmpty() || stack.peek() < time) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
