class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap < Character, Integer > count = new HashMap <>();

        // directly gives us a false if the length nto the same
        // s = car and t = arc
        if (s.length() != t.length()){
            return false;
        }
        // s = car 
        for(char a: s.toCharArray()){
            // s = c and k = 1
            // a and r all the frequecices 1 
            count.put(a, count.getOrDefault(a, 0) +1);
        }
        // t = arc
        for(char a: t.toCharArray()){
            count.put(a, count.getOrDefault(a, 0) - 1); 
            if(count.get(a) <0){
                return false;
            }
        }return true;

    }
}
