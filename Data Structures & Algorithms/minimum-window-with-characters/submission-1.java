class Solution {
    public String minWindow(String s, String t) 
    {
        HashMap<Character,Integer> countT = new HashMap<>();
        HashMap<Character,Integer> window= new hashMap<>();

        int [] res={-1,-1};
        int reslen=Integer.MAX_VALUE;
        int l=0;
        
        for(int i=0;i<t.length();i++)
        {
            counT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
        }

        int have=0;
        int need= countT.size();

        for(int r = 0;r<s.length();r++)
        {
            char right=s.charAt(r);

            window.put(r,window.getOrDefault(r,0)+1);

            if(countT.containsKey(r)&&window.get(r).equals(countT.get(r)))
            {
                have ++;

            }

            while(have==need)
            {
                if(r-l+1<reslen)
                {
                    reslen=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char left = s.charAt(l);
                window.put(left,window.get(left)-1);
                if(countT.containsKey(left)&&window.get(left)<countT.get(left))
                {
                    have--;
                }
                l++
            }

        }
        return reslen=Integer.MAX_VALUE ? "":s.substring(res[0],res[1]+1);
    }
}
