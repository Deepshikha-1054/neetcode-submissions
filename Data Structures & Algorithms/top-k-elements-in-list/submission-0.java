class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] bucket = new List[n+1];
        for(int i=0; i<=n; i++){
            bucket[i] = new ArrayList<>();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();

            bucket[count].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for(int i=bucket.length-1; i>=0 && index < k; i--){
            for(int num:bucket[i]){
                result[index++] = num;
                if(index == k){
                    return result;
                }
            }
        }
        return result;
    }
}
