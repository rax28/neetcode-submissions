class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int [nums.length-k+1];
        Deque <Integer> deq = new Deque<>();
        int r =0,l=0,i=0;

        while(r<nums.length)
        {
            while(!deq.isEmpty()&&nums[deq.peekLast()]<nums[r])
            {
                deq.pollLast();
            }
            deq.add(r);
            if(l>deq.peekFirst)
            {
                deq.pollFirst();
            }
            if(r+1>=k)
            {
                res[i]=nums[deq.peekLast()];
                i++;
                l++;
            }
            r++;
        }
        return res;
    }
}