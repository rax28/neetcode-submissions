class Solution {
    public int trap(int[] height) {
       int res=0;
       int l=0;
       int r=height.length-1;
       int heightl = height[l];
       int heightr = height[r];

       while(l<r)
       {
        if(heightl<heightr||heightl==heightr)
        {
            l++;
            int max= Math.max(heightl,height[l]);
            int wt = max-height[l];

            if(wt>0)
            {
                res+=wt;
            }
        }
        else
        {
            r--;
            int maxx=Math.max(heightr,height[r]);
            int wtt=maxx-height[r];
            if(wtt>0)
            {
                res+=wtt;
            }
        }
       }
        return res;
    }
}