class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] req = new int[k];
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));

        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            heap.add(key);
            if(heap.size() > k) heap.poll();
        }

        for(int i=k-1; i>=0;i--){
            req[i]= heap.poll();
        }
        return req;
    }
}
