class MyHashSet {
    private int[] array;

    public MyHashSet() {
        array = new int[1000001];
        array[0] = -1;
    }
    
    public void add(int key) {
        array[key] = key;
    }
    
    public void remove(int key) {
        array[key] = 0;
    }
    
    public boolean contains(int key) {
        if (array[key] == key) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */