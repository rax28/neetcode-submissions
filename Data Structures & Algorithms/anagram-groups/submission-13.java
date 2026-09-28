class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> res = new HashMap<>();

        for(String s : strs)
        {
            int [] count = new int [26];

            for(char c :s.toCharArray())
            {
                count[c-'a']++;
            }

            String a = Arrays.toString(count);

            res.putIfAbsent(a,new ArrayList<>());
            res.get(a).add(s);
        }

        return new ArrayList<>(res.values());
    
    }
}
