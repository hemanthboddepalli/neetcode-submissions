class MyHashMap {
    private ListNode[] list;
    private static final int SIZE = 1000;

    public MyHashMap() {
        list = new ListNode[SIZE];
    }
    
    public void put(int key, int value) {
        int index = key % SIZE;

        if (list[index] == null) {
            list[index] = new ListNode();
        }

        ListNode curr = list[index];

        while(curr.next != null) {
            if (curr.next.key == key) {
                curr.next.value = value;
                return;
            }
            curr = curr.next;
        }

        curr.next = new ListNode(key, value);
    }
    
    public int get(int key) {
        int index = key % SIZE;

        if (list[index] != null) {
            ListNode curr = list[index];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    return curr.next.value;
                }
                curr = curr.next;
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        int index = key % SIZE;

        if (list[index] != null) {
            ListNode curr = list[index];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }
    }
}

class ListNode {
    int key;
    int value;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */