class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=0;
        for(int n:piles)
        {
            r=Math.max(n,r);
        }
        int res =r;
        while(l<=r)
        {
            int k = l+(r-l)/2;
            int hours=0;
            for(int n:piles)
            {
                hours+=Math.ceil((double)n/k);
            }

            if(hours<=h)
            {
                res =Math.min(res,k);
                r=k-1;
            }
            else{
                l=k+1;
            }
        }   
        return res;
    }
}
