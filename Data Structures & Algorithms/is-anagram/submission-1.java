class Solution {
    public boolean isAnagram(String s, String t) {
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String c= new String(a);
        String v = new String(b);

        if(c.isEqual(b)) return true;
        else return false;
    }
}
