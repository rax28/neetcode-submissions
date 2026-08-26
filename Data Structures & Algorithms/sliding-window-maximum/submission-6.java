class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int [nums.length-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        int i=0;
        int l=0;
        int r=0;

        while(r<nums.length)
        {
            while(!q.isEmpty()&&nums[q.peek()]<nums[r])
            {
                q.pollLast();
            }
            q.addLast(r);

            if(l>q.peekFirst())
            {
                q.pollFirst();

            }
            if((r+1)>=k)
            {
                res[i]=nums[q.peekFirst()];
                i++;
                l++;
            }
            r++;

        }

        return res;
    }
}