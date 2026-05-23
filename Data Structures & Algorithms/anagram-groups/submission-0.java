class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagrams = new HashMap<>();
        for(String curr: strs){
            int[] counter = new int[26];
            for(char ana:curr.toCharArray()){
                counter[ana-97]+=1;
            }
            String key = Arrays.toString(counter);
            if(anagrams.containsKey(key)){
                anagrams.get(key).add(curr);
            }
            else{
                List<String> same = new ArrayList<>();
                same.add(curr);
                anagrams.put(key, same);
            }
        }
        List<List<String>> returnList = new ArrayList<>();
        for(List<String> finalList: anagrams.values()){
            returnList.add(finalList);
        }
        return returnList;
    }
}
