class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> seen = new HashSet<>();
        for (int n: nums ) seen.add(n);

        int longest =0; // tracker 
        for(int n: nums){

            if(!seen.contains(n-1)){
                int length =1;
                while(seen.contains(n+length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
        
    }
}
