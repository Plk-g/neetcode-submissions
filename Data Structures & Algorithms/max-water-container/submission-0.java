class Solution {
    public int maxArea(int[] heights) {
        int l = 0; // 2 //7
        int r = heights.length -1;  //7 //6
        int maxWater =0;

        while (l<r){
            maxWater = Math.max(maxWater, (Math.min(heights[l], heights[r]) * (r-l)));
            if (heights[l] > heights[r]){
            r--;
           }else{
            l++; 
        } 

        }return maxWater;
        
    }
}
