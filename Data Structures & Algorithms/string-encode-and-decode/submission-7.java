class Solution {

    public String encode(List<String> strs) {
      StringBuilder ress = new StringBuilder();
      for(String n:strs)
      {
        ress.append(n.length()).append("#");
      }
      return new String(ress);
    }

    public List<String> decode(String str)
     {
        List<String> res = new ArrayList<>();

        int i = 0 ;
        while(i<str.length())
        {
            int j = i;

            while(j!="#")
            {
                j++;
            }

            int length=Integer.parseInt(str.substring(i,j));

            i = j+1;
            j=i+length;
            res.add(str.substring(i,j));
            i=j;


        }
        
        return res;

    }
}
