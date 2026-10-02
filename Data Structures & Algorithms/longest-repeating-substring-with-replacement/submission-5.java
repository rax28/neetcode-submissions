class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character,Integer> set = new HashMap<>();
        int l =0;
        int res=0;
        int r = 0;
        int maxfreq=0
        while(r<s.length())
        {
            set.put(s.charAt(r),set.getOrDefault(s.charAt(r),0)+1);

            maxfreq=Math.max(maxfreq,set.get(s.charAt(r)));

            int windowlen = r-l+1;

            while(windowlen-maxfreq>k)
            {
                set.put(s.charAt(l),set.get(s.charAt(l))-1);
                l++;
                windowlen=r-l+1;
            }

            res = Math.max(res,windowlen);
            r++;

        }

        return res;
    }
}
