class Solution {
    public boolean isValid(String s) {
      Stack <Character> st = new Stack<>();
      HashMap<Character,Character> map = new HashMap<>();
      map.put('}','{');
      map.put(')','(');
      map.put(']','[');

        for(char c :s.toCharArray())
        {
            
            if((!st.isEmpty())&&(map.get(c)==st.peek()))
            {
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.isEmpty();
    
    }
}
