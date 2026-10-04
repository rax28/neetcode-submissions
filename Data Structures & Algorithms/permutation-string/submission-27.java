class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int [] a1 = new int [26];
        int [] a2 = new int [26];

        for(int i=0;i<s1.length();i++)
        {
            a1[s1.charAt(i)-'a']++;
            a2[s2.charAt(i)-'a']++;
        }

        int matches = 0;

        for(int i = 0 ;  i< 26;i++)
        {
            if(a1[i]==a2[i])
            {
                matches++;
            }
        }

        int l=0;
        for(int r = s1.length();r<s2.length();r++)
        {
            if(matches==26) return true;
            
            int index = s2.charAt(r)-'a';
            a2[index]++;

            if(a1[inedex]==a2[index]) matches++;
            else if(a1[index]+1==a2[index]) matches --;

            int indexx = s2.charAt(l++)-'a';
            a2[indexx]--;

            if(a1[indexx]==a2[indexx]) matches++;
            else if(a1[indexx]-1==a2[indexx]) matches--;


        }

        return (matches==26);

    }
}
