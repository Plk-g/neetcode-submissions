class Solution {
    public int [] dailyTemperatures (int[] temperatures){
        Stack <Integer> tempIndex = new Stack<>();
        int [] results = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++){
            // while stack not empty AND temperatures[i] > temperatures[stack top]
            while(!tempIndex.isEmpty() && temperatures[i]>temperatures[tempIndex.peek()]){
                //set result[popped index] = i - popped index
                int idx = tempIndex.pop();
                results[idx] = i - idx; 

            }
            // push i onto stacka
            tempIndex.push(i);

        } return results;
    }

}