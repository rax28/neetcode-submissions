class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int res =0;
        int l=0;
        for(int r = 0 ; r<s.length()-1;r++)
        {
            while(set.contains(s.charAt(r)))
            {
                l++;
                set.remove(s.charAt(l));
            }
            set.add(s.charAt(r));
            res = Math.max(res,r-l);
        }

        return res;
    }
}
