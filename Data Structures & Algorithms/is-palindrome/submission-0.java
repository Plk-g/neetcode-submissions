class Solution {
    public boolean isPalindrome(String s) {

        String new_s = "";

        for (char c : s.toCharArray()){
            if (Character.isDigit(c) || Character.isLetter(c)){
                new_s += c;
            }
        }
        new_s = new_s.toLowerCase();

        int a_pointer = 0;
        int b_pointer = new_s.length()-1;

        while (a_pointer <= b_pointer) {
            if (new_s.charAt(a_pointer) != new_s.charAt(b_pointer)){
                return false;
            }

            a_pointer += 1;
            b_pointer -= 1;
        }

        return true;
    }
}
