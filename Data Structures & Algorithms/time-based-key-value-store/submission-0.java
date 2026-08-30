class TimeMap {

    public TimeMap() {
        m=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key,k->new TreeMap<>()).add(timestamp,value)
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)) return "";

        TreeMap<Integer,String> tree= get(key);
        Map.Entry<Integer,String> entry=tree.floorEntry(timestamp);
        return entry =null?"":entry.getValue();
    }
}
