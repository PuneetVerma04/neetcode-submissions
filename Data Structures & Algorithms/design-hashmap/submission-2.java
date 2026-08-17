class MyHashMap {
    private int size = 769;
    private List<int[]>[] buckets;

    public MyHashMap() {
        buckets = new ArrayList[size];
        for(int i=0;i<size;i++){
            buckets[i] = new ArrayList<>();
        }        
    }
    
    private int hash(int key){
        return key % size;
    }

    public void put(int key, int value) {
        int hash = hash(key);
        for(int[] pair: buckets[hash]){
            if(pair[0]==key){
                pair[1]=value;
            }
        }
        buckets[hash].add(new int[]{key, value});
    }
    
    public int get(int key) {
        int hash = hash(key);
        for(int[] pair: buckets[hash]){
            if(pair[0]==key) return pair[1];
        }
        return -1;
    }
    
    public void remove(int key) {
        int hash = hash(key);
        buckets[hash].removeIf(pair -> pair[0]==key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */