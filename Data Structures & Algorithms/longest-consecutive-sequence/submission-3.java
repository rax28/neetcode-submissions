class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> res = new HashSet<>();
        int len=0;
       for(int num:nums)
       {
        res.add(num);
       }

       for(int num: nums)
       {
        if(!res.contains(num-1))
        {
            int length =1;

            while(res.contains(num+length))
            {
                length++;
            }

            len=Math.max(length,len);
        }
       }

       return len;
    }
}
