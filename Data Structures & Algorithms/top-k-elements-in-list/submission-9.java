class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> count = new HashMap<>();
       List<Integer>[] freq = new List<Integer>[nums.length];

       for(int i =0;i<nums.length+1;i++)
       {
        freq[i]=new ArrayList<Integer>();
       }

       for(int num :nums)
       {
        count.put(num,count.getOrDefault(num,0)+1);
       }

       for(Map.Entry<Integer,Integer> entry:count.entrySet())
       {
            freq[entry.getValue()].add(entry.getKey());
       }

       int res[k];
       int index=0;

       for(int i=freq.length-1;i>0;i--)
       {
        for(int n:freq[i])
        {
            res[index++]=n;
            if(index==k)return res;
        }
       }
       return res;
    }
}
