class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> a = new HashSet<>();

      for(int n :nums)
      {
        if(a.contains(n))
        {
          return true;
        }
        else{
          a.add(n);
        }
      }

      return false;
    }
}