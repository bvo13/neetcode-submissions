class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int small = 0;
        int big = numbers.length-1;
        int diffRight=0;
        int diffLeft=0;
        while(small!=big){
            if((numbers[small]+numbers[big])==target){
                return new int[]{small+1,big+1};
            }
            if(numbers[small]+numbers[big]<target){
                small++;
               
            }
            if(numbers[small]+numbers[big]>target){
                big--;
            }
        }
        return new int[]{};
    }
}
