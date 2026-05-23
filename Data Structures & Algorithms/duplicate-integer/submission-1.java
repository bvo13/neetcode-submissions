class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        boolean dupe = false;
        for(int number:nums){
            dupe=!(unique.add(number));
            if(dupe==true){
                return dupe;
            }
        }
        return false;
    }
}