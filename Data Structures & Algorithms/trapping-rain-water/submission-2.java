class Solution {
    public int trap(int[] height) {
        int res=0, l =0, r=height.length-1,maxl=height[l],maxr=height[r];

        while(l<r)
        {
          if(maxl<maxr||maxl==maxr)
          {
             l++;
            maxl=Math.max(maxl,height[l]);
            int wt=maxl-height[l];
            if(wt>0)
            {
                res+=wt;

            }
           
          }
          else{
             r--;
            maxr=Math.max(maxr,height[r]);
            int wtt=maxr-height[r];
            if(wtt>0)
            {
                res+=wtt;
            }
           
          }
            
        
        }
        return res;
    }
}