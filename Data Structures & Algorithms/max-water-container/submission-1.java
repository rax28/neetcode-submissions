class Solution {
    public int maxArea(int[] heights) {
        int res=0;

        for(int i=0;i<heights.length;i++)
        {
            for(int j=i+1;j<heights.length;j++)
            {
                int minh=Math.min(heights[i],heights[j]);
                int length=j-i;
                int area=minh*length;
               res= Math.max(res,area);                

            }
        }
        return res;
    }
}
