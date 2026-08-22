class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s: strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i< str.length()){
            int j = str.indexOf('#',i);
            // 2 things at once - first the string and then convery it just 
            //in urdu lol
            int length = Integer.parseInt(str.substring(i,j));
            // extract the actual required word 
            String decodedw = str.substring(j+1, j+1+length);
            result.add(decodedw);
            i = j+1+length;
        }return result;

    }
}
