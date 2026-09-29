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
            heightl= Math.max(heightl,height[l]);
            int wt = heightl-height[l];

            if(wt>0)
            {
                res+=wt;
            }
        }
        else
        {
            r--;
            heightr=Math.max(heightr,height[r]);
            int wtt=heightr-height[r];
            if(wtt>0)
            {
                res+=wtt;
            }
        }
       }
        return res;
    }
}