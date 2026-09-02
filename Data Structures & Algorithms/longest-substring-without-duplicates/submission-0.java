class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        HashSet <Character> seen = new HashSet<>();
        int maxLength =0;

        for ( int r=0; r < s.length(); r++){
            // shrink from left if duplicate exists 
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }
            // add the string 
            seen.add(s.charAt(r));
            // update maxLength
            maxLength = Math.max(maxLength, (r-l+1));
        }return maxLength;
        
    }
}
