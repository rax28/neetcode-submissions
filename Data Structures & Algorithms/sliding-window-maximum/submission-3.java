class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int [nums.length-k+1];
        Deque <Integer> q = new ArrayDeque<>();
        int l=0;
        int r=0;
        int i=0;
        while(r<nums.length)
        {
            while(!q.isEmpty()&&nums[q.peek()]<nums[r])
            {
                q.pollLast();
            }
            q.addLast(r);

            if(l>q.getFirst())
            {
                q.pollFirst();
            }
            if(r+1>=k)
            {
                res[i]=q.getFirst();
                i++;
                l++;
            }

            r++;

        }
        
        return res;
    }
}
