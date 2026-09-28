class Solution {
    public boolean isAnagram(String s, String t) {
        int [] a = new int [26];

        for(char x :s.toCharArray())
        {
            a[x-'a']++;
        }
        for(char x :t.toCharArray())
        {
            a[x-'a']--;
        }

        for(int n:a)
        {
            if(n!=0) return false;
        }
        return true;
    }
}
