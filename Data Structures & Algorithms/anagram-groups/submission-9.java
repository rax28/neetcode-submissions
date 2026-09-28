class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> res = new HashMap<>();

        for(String s : strs)
        {
            char a = s.toCharArray();
            Arrays.sort(a);
            String b = new String(a);

            if(!res.containsKey(b))
            {
                res.put(b,ArrayList<String>());
            }

            res.get(b).add(s);
        }

        return new ArrayList<>(res.values());
    
    }
}
