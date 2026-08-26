class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs)
        {
            char [] str = s.toCharArray();
            Arrays.sort(str);
            String sort = Arrays.toString(str);
            if(!res.containsKey(sort))
            {
                res.put(sort,new ArrayList<>());
            }
            res.get(sort).add(s)
        }
        return new ArrayList<>(res.values());
    }
}
