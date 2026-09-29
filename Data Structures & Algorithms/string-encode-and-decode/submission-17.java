class Solution {

    public String encode(List<String> strs) {
     StringBuilder ress = new StringBuilder();

     for(String n :strs)
     {
        ress.append(n.length()+'#'+n);
     }

     return new String(ress);
    }

    public List<String> decode(String str)
     {
       List<String> res = new List<>();

       int i=0;

       while(i<str.length)
       {
            int j = i;

            while(str.charAt(j)!='#')
            {
                j++;
            }

            int length = Integer.parseInt(i,j);
            i=j+1;
            j=i+length;

            res.add(str.subString(i,j));

            i=j;

       }
        return res;

    }
}
