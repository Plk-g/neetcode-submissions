class Solution {
    public int findKthLargest(int[] nums, int k) {
        //min heap 
        PriorityQueue <Integer> minH = new PriorityQueue<>();

        for(int n: nums){
            minH.offer(n);
            if(minH.size() > k) minH.poll();
        }return minH.peek();
        
    }
}
