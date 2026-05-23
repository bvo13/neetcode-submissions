class Solution {
    public int maxArea(int[] heights) {
        
        int left=0;
        int right=heights.length-1;
        int maxWater = Math.min(heights[left],heights[right])*(right-left);
        while(left<right){
            int water = Math.min(heights[left],heights[right])*(right-left);
            if(water>maxWater){
                maxWater=water;
            }
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                if(heights[left]>heights[right]){
                    right--;
                }
                else{
                    left++;
                }
            }


        }
        return maxWater;
    }
}
