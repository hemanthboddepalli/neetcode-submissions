class MyHashSet {
    private LinkedList<Integer>[] set;
    private static final int SIZE = 10000;

    public MyHashSet() {
        set = new LinkedList[SIZE];
    }
    
    public void add(int key) {
        int index = key % SIZE;

        if (set[index] == null) {
            set[index] = new LinkedList<>();
        }

        if (!set[index].contains(key)) {
            set[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = key % SIZE;

        if (set[index] != null) {
            set[index].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index = key % SIZE;
        if (set[index] != null && set[index].contains(key)) {
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