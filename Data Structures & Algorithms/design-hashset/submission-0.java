class MyHashSet {
    HashSet<Integer> obj;

    public MyHashSet() {
       obj  = new HashSet<>();
    }
    
    public void add(int key) {
        obj.add(key);
    }
    
    public void remove(int key) {
        obj.remove(key);
    }
    
    public boolean contains(int key) {
        return obj.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */