class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> triplets = new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        if(i!=0&&nums[i-1]==nums[i]){
            continue;
        }
        int left = i+1;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]+nums[i]>0){
                right--;
            }
            else{
            if(nums[left]+nums[right]+nums[i]<0){
                left++;
            }
            else{
             
                triplets.add(List.of(nums[left],nums[right],nums[i]));
    
             while(left<right&&nums[left]==nums[left-1]){
                left++;
             }
            do{
                right--;
            }while(left<right&&nums[right]==nums[right+1]);
            }
        }
       }
    

       
        
    }
    return triplets;
}
}
