class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] req = new int[k];
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n2) - map.get(n1));

        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            heap.add(key);
        }

        for(int i=0; i<k;i++){
            req[i]= heap.poll();
        }
        return req;
    }
}
