class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> cont = new HashSet<>();
      
      for(int n:nums)
      {
        if(!cont.contains(n))
        {
            cont.add(n);
        }
        else{
            return true;
        }
      }

      return false;
    }
}