class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int[n];


        // first pass on the left side 
        result[0] =1;
        for (int i =1; i <n; i++){
            result[i] = result[i-1]* nums[i-1];
        }
        // right pass
        int right = 1;
        for (int r = n-1; r>=0; r--){
            result [r] = result[r]*right;
            right = right * nums[r];

        }
        return result;


        
    }
}  
