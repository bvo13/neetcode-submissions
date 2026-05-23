class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] indices = new int[2];
        Map<Integer,Integer> complements = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(complements.containsKey(target-nums[i])){
                indices[0] = complements.get(target-nums[i]);
                indices[1] = i;
            }
            complements.put(nums[i],i);

        }
        return indices;
    }
}
