class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: build frequency map
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Step 2: build bucket array
        // index = frequency, value = list of numbers with that frequency
        List<Integer>[] freq = new List[nums.length + 1];
        for (int n : count.keySet()) {
            int f = count.get(n);
            if (freq[f] == null) freq[f] = new ArrayList<>();
            freq[f].add(n);
        }

        // Step 3: scan right to left, collect k elements
        int[] result = new int[k];
        int idx = 0;
        for (int i = freq.length - 1; i >= 0 && idx < k; i--) {
            if (freq[i] != null) {
                for (int n : freq[i]) {
                    result[idx++] = n;
                    if (idx == k) break;
                }
            }
        }
        return result;
    }
}