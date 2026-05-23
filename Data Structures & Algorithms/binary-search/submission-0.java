class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        int beginning=0;
        int end=nums.length-1;
        while(beginning<=end){
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                beginning=mid+1;
                mid=(end+beginning)/2;
            }
            else{
                end=mid-1;
                mid=((end+beginning)/2);
            }
            
        }
        return -1;
    }
}
