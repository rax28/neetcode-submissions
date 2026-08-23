class Solution {
    public boolean isAnagram(String s, String t) {
        char[] newS = s.toCharArray();
        Arrays.sort(newS);
        String strn= new String(newS);
        
        char[] newT=t.toCharArray();
        Arrays.sort(newT);
        String str =new String(newT);
        if (strn.equals(str)) 
        {
            return true;
        }
        return false;
    }
}
