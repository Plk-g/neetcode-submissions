class Solution {
    public boolean isPalindrome(String s){
        // initialise the pointers
        int l = 0;
        int r = s.length()-1;

        // make a loop which checks for alphanumeric
        while (l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if (!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else {
                if(Character.toLowerCase(s.charAt(l)) !=
                Character.toLowerCase(s.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }
        } return true;
    }
}