class Solution {
    public int minEatingSpeed (int[] piles, int h){
        //find max pile - right boundary
        int left = 1;
        int right =0; 
        for(int p: piles)right = Math.max(right, p);

        // binary search on k 
        while (left < right){
            int mid = left + (right - left)/2;
            //check if mid works - cal hours 
            int hours = 0;
            for (int p: piles){
                hours += (int)Math.ceil((double)p/mid);
                
            }

            if (hours<=h){
                right = mid;
            }else{
                left = mid + 1;
            }

        }return left;
        
    }
}


//Find max pile → right boundary
//Binary search while left < right
//Calculate hours for mid
//If hours <= h → right = mid
//If hours > h → left = mid + 1
//Return left