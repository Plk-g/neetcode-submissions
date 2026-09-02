class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l =0; 
        int r=0;
        int maxLength = 0;
        int maxCount = 0;
        
        for( r=0; r<s.length(); r++){
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r),0)+1);
            // check the length 
            maxCount = Math.max(maxCount, count.get(s.charAt(r)));

            // if window is invalid ,shrink from left 
            while ((r-l+1)-maxCount > k){
                count.put(s.charAt(l), count.get(s.charAt(l)) -1);
                l++;
            }
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
    }
}
