class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] postfix = new int[nums.length];
        int pre = 0;
        int post= nums.length-1;
        int preProduct=1;
        int postProduct=1;
        while(pre<nums.length&&post>=0){
            preProduct*=nums[pre];
            postProduct*=nums[post];
            prefix[pre] = preProduct;
            postfix[post] = postProduct;
            pre++;
            post--;
        }
        for(int i=0; i<nums.length;i++){
            if(i==0){
            nums[i]=postfix[i+1];
            }
            else{
                if(i==nums.length-1){
                    nums[i]=prefix[i-1];
                }
                else{
                    nums[i]=(prefix[i-1])*postfix[i+1];
                }
        }
    }
    return nums;
}  
}
