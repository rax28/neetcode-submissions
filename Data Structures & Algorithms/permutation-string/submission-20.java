class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false

        int [] a1 = new int a1[26];
        int [] a2 = new int a2[26];

        for(int i=0;i<s1.length();i++)
        {
            a1[s1.charAt(i)-'a']++;
            a2[s2.charAt(i)-'a']++;
        }

        int match = 0;

        for(int i = 0 ;  i< 26;i++)
        {
            if(a1[i]==a2[i])
            {
                matches++;
            }
        }

        int l=0;
        for(int r = s1.length();r<s2.legnth();r++)
        {
            if(matches==26) return true;
        }

        return (match==26);

    }
}
