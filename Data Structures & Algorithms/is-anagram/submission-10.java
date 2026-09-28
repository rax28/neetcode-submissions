class Solution {
    public boolean isAnagram(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        if(s.length()!=t.length()) return false;
        
        Arrays.sort(a);
        Arrays.sort(b);

        String c= new String(a);
        String v = new String(b);

        if(c.equals(v)) return true;
        else return false;
    }
}
