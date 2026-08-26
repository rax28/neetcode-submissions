class Solution {

    public String encode(List<String> strs) {
       StringBuilder res = new StringBuilder();
       for(String s :strs)
       {
        res.append(s.length()).append('#').append(s);
       }
       return res;
    }

    public List<String> decode(String str)
     {
        List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length())
        {
            int j = i;
            while(j!='#')
            {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+length;

            res.add(str.substring(i,j));
        }
        return res;

    }
}
