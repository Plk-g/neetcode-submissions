class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create HashMap 

        HashMap < String, List<String>> map = new HashMap<>();

        //create a sorted array 
        for (String s: strs){
            char [] chars = s.toCharArray();
            //sort this new array w our string 
            Arrays.sort(chars);
            //put it back as a string 
            String key = new String(chars);

            map.computeIfAbsent(key, K -> new ArrayList<>()).add(s);

        } return new ArrayList<>(map.values());
        
    }
}
