class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indices = new Stack<>();
        int[] days = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!indices.isEmpty()&&temperatures[indices.peek()]<temperatures[i]){
                days[indices.peek()]= i-indices.pop();
            }
            indices.add(i);
        }
        while(!indices.isEmpty()){
            days[indices.pop()]=0;
        }
        return days;

    }
}
