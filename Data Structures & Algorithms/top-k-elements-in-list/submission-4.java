class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> fMap = new HashMap<>();

        for(int i: nums){
            fMap.put(i, fMap.getOrDefault(i, 0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(Map.Entry<Integer, Integer> entry : fMap.entrySet()){
            if(buckets[entry.getValue()] == null){
                buckets[entry.getValue()] = new ArrayList<>();
            }
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index =0;

        for(int i= nums.length; i>0 && index < k; i--){
            if(buckets[i] != null){
                for(int r : buckets[i]){
                    result[index] = r;
                    index++;
                } 
            }
        }

        return result;
    }
}
