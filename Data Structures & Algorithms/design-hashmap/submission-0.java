class MyHashMap {
    private int K[];
    private int V[];
    public MyHashMap() {
        K = new int[1000001];
        Arrays.fill(K,-1);
        V = new int[1000001];
        Arrays.fill(V,-1);
    }
    
    public void put(int key, int value) {
        K[key] = key;
        V[key] = value;
    }
    
    public int get(int key) {
        return V[key];
    }
    
    public void remove(int key) {
        K[key] = -1;
        V[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */