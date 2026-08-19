class Solution {
    public boolean hasDuplicate(int[] nums) {
        // instantiate an object of hashmap
        HashSet<Integer> numbers = new HashSet<>();

        // loop through the given array 
        for (int i = 0; i<nums.length; i++){
            if (numbers.contains(nums[i])){
                return true;
            }
            else{
                numbers.add(nums[i]);
            }
        }
        return false;
    }
}