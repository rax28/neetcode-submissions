class Solution {
    public boolean isValid(String s) {
      Stack <Character> st = new Stack<>();
      HashMap<Character,Character> map = new HashMap<>();
      map.put('}','{');
      map.put(')','(');
      map.put(']','[');

        for(char c :s.toCharArray())
        {
            if(c=='{'||c=='('||c=='[')
            {
                st.push(c);
            }
            else if(!map.containsKey(c)==st.peek())
            {
                return false;
            }
        }
        return true;
    
    }
}
