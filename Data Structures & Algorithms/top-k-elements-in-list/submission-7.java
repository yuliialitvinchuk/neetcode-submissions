class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[]res = new int[k];
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxNum = 0;
            for (int num : map.keySet()) {
                if (map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    maxNum = num;
                }
            }
            res[i] = maxNum;
            map.remove(maxNum);
        }
        return res;
    }
}