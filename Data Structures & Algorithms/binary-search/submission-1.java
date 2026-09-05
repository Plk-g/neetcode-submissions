class Solution{
    public int search(int[] nums, int target){
        if (nums.length == 0){
            return -1;
        }

        // initialise variables index 

        int left = 0; 
        int right = nums.length - 1; 

        // find oout the mid 

        while (left <= right){
            int mid = left + (right -left)/2;
            //the reason we do right -left is to contain extreme large value of right. 
            /// compare my mid to target - if target > mid: right; else left 
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid +1;
            }

        }return -1;
        
        // return the index else return -1
        
    }
}
