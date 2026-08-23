class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> res = new HashSet<>();

      for(int n :nums)
      {
        if(!res.add(n)) return true;
      }
      return false;
    }
}