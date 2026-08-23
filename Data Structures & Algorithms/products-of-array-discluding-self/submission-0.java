class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];

        for(int i =0; i<nums.length;i++)
        {
            int a = 1;
            for(int j = 0 ; j<nums.length;j++){
            if(j==i)
            {
                continue;
            }
            
            a = a*nums[j];

            }
            res[i]=a;
            a=1;
        }

        return res;

    }
}  
