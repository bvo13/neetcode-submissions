class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        Set<Integer> nonDuplicate = new HashSet<>();
        for(int num:nums){
            duplicate = !nonDuplicate.add(num);
            if(duplicate==true){
                break;
            }
        }
        return duplicate;
    }
}