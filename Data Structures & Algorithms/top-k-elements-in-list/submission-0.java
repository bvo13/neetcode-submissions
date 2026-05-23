class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencies = new HashMap<>();
        for(int curr:nums){
            if(frequencies.containsKey(curr)){
                frequencies.put(curr,frequencies.get(curr)+1);
            }
            else{
                frequencies.put(curr,1);
            }
        }
        PriorityQueue<int[]> top = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
        frequencies.forEach((key,value)->{
             if(top.size()<k){
                        top.add(new int[]{value,key});
                        return;
                    }
                if(value>(top.peek())[0]&&top.size()>=k){
                    top.poll();
                    top.add(new int[]{value,key});
               }});
        int [] topElements = new int[k];
        for(int i=0;i<k;i++){
            topElements[i] = (top.poll())[1];
        }
        return topElements;
    }

}
