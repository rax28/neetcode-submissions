class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int l=0,r=heights.length-1;
        while(l<r)
        {
            int mh = Math.min(heights[l],heights[r]);

            int area = mh*(r-l);

            res = Math.max(area,res);

            if(heights[l]>heights[r])r--;
            else l++;
        }

        return res;
    }
}
